-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema tghub
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `tghub` DEFAULT CHARACTER SET utf8mb4 ;
USE `tghub` ;

-- -----------------------------------------------------
-- Table `tghub`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tghub`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome_completo` VARCHAR(100) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `senha_hash` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tghub`.`coordenador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tghub`.`coordenador` (
  `usuario_id` INT NOT NULL,
  `rd` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`usuario_id`),
  UNIQUE INDEX `rd_UNIQUE` (`rd` ASC) VISIBLE,
  CONSTRAINT `fk_coordenador_usuario`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `tghub`.`usuario` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tghub`.`curso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tghub`.`curso` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `coordenador_id` INT NOT NULL,
  `nome` VARCHAR(75) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `nome_UNIQUE` (`nome` ASC) VISIBLE,
  INDEX `fk_curso_coordenador_idx` (`coordenador_id` ASC) VISIBLE,
  CONSTRAINT `fk_curso_coordenador`
    FOREIGN KEY (`coordenador_id`)
    REFERENCES `tghub`.`coordenador` (`usuario_id`)
    ON DELETE RESTRICT
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tghub`.`aluno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tghub`.`aluno` (
  `usuario_id` INT NOT NULL,
  `ra` VARCHAR(100) NOT NULL,
  `curso_id` INT NOT NULL,
  PRIMARY KEY (`usuario_id`),
  UNIQUE INDEX `ra_UNIQUE` (`ra` ASC) VISIBLE,
  INDEX `fk_aluno_curso_idx` (`curso_id` ASC) VISIBLE,
  CONSTRAINT `fk_aluno_usuario`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `tghub`.`usuario` (`id`)
    ON DELETE CASCADE -- SUGESTÃO: Alterado para CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_aluno_curso`
    FOREIGN KEY (`curso_id`)
    REFERENCES `tghub`.`curso` (`id`)
    ON DELETE RESTRICT -- Impede deletar um curso que tem alunos
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tghub`.`orientador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tghub`.`orientador` (
  `usuario_id` INT NOT NULL,
  `rd` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`usuario_id`),
  UNIQUE INDEX `rd_UNIQUE` (`rd` ASC) VISIBLE,
  CONSTRAINT `fk_orientador_usuario`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `tghub`.`usuario` (`id`)
    ON DELETE CASCADE -- SUGESTÃO: Alterado para CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tghub`.`curso_orientador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tghub`.`curso_orientador` (
  `curso_id` INT NOT NULL,
  `orientador_id` INT NOT NULL,
  PRIMARY KEY (`curso_id`, `orientador_id`),
  INDEX `fk_co_orientador_idx` (`orientador_id` ASC) VISIBLE,
  CONSTRAINT `fk_co_curso`
    FOREIGN KEY (`curso_id`)
    REFERENCES `tghub`.`curso` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_co_orientador`
    FOREIGN KEY (`orientador_id`)
    REFERENCES `tghub`.`orientador` (`usuario_id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tghub`.`trabalho_graduacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tghub`.`trabalho_graduacao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `aluno_id` INT NOT NULL,
  `orientador_id` INT NOT NULL,
  `status_geral` ENUM('Em Andamento', 'Finalizado', 'Trancado') NOT NULL DEFAULT 'Em Andamento', -- SUGESTÃO: Alterado para ENUM
  `perfil_aluno_json` JSON NULL, -- CORREÇÃO: Renomeado para refletir o conteúdo (dados do onboarding)
  PRIMARY KEY (`id`),
  UNIQUE INDEX `aluno_id_UNIQUE` (`aluno_id` ASC) VISIBLE,
  INDEX `fk_tg_orientador_idx` (`orientador_id` ASC) VISIBLE,
  CONSTRAINT `fk_tg_aluno`
    FOREIGN KEY (`aluno_id`)
    REFERENCES `tghub`.`aluno` (`usuario_id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tg_orientador`
    FOREIGN KEY (`orientador_id`)
    REFERENCES `tghub`.`orientador` (`usuario_id`)
    ON DELETE RESTRICT -- Impede deletar um orientador que tem TGs ativos
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tghub`.`entrega`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tghub`.`entrega` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tg_id` INT NOT NULL,
  `titulo` VARCHAR(255) NOT NULL,
  `semestre_referencia` INT NOT NULL,
  `data_limite` DATE NOT NULL,
  `status` ENUM('Aguardando Envio', 'Aprovação Pendente', 'Assinatura Pendente', 'Assinado') NOT NULL DEFAULT 'Aguardando Envio', -- SUGESTÃO: Alterado para ENUM
  `data_assinatura` DATETIME NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_entrega_tg_idx` (`tg_id` ASC) VISIBLE,
  CONSTRAINT `fk_entrega_tg`
    FOREIGN KEY (`tg_id`)
    REFERENCES `tghub`.`trabalho_graduacao` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tghub`.`submissao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tghub`.`submissao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `entrega_id` INT NOT NULL,
  `versao` INT NOT NULL,
  -- CORREÇÃO: Removida a coluna `semestre_referencia` por ser redundante
  `data_envio` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status_submissao` ENUM('Pendente', 'Aprovado', 'Rejeitado') NOT NULL DEFAULT 'Pendente', -- SUGESTÃO: Alterado para ENUM
  `feedback_orientador` TEXT NULL,
  `conteudo_formulario` JSON NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_submissao_entrega_idx` (`entrega_id` ASC) VISIBLE,
  UNIQUE INDEX `idx_entrega_versao_unique` (`entrega_id` ASC, `versao` ASC) VISIBLE, -- SUGESTÃO: Garante que a versão é única por entrega
  CONSTRAINT `fk_submissao_entrega`
    FOREIGN KEY (`entrega_id`)
    REFERENCES `tghub`.`entrega` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tghub`.`mensagem`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tghub`.`mensagem` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `entrega_id` INT NOT NULL,
  `remetente_id` INT NOT NULL,
  `conteudo` TEXT NOT NULL,
  `data_envio` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP, -- SUGESTÃO: Alterado para NOT NULL com DEFAULT
  PRIMARY KEY (`id`),
  -- CORREÇÃO: Removido o UNIQUE index de `entrega_id` que impedia múltiplas mensagens
  INDEX `fk_msg_entrega_idx` (`entrega_id` ASC) VISIBLE,
  INDEX `fk_msg_remetente_idx` (`remetente_id` ASC) VISIBLE,
  CONSTRAINT `fk_msg_entrega`
    FOREIGN KEY (`entrega_id`)
    REFERENCES `tghub`.`entrega` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_msg_remetente`
    FOREIGN KEY (`remetente_id`)
    REFERENCES `tghub`.`usuario` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;