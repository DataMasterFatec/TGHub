## Planejamento da Sprint 1

### Desafio
O principal desafio da Sprint 1 é transformar os conceitos e wireframes em uma base técnica e documental sólida para o projeto. O foco não está na escrita de código funcional, mas na criação dos artefatos de engenharia de software que servirão como um mapa para as Sprints de implementação. A equipe deve traduzir as necessidades dos usuários em especificações formais e projetar a arquitetura de dados que suportará todas as funcionalidades. O sucesso desta Sprint será medido pela clareza e completude da documentação e dos modelos gerados, que devem mitigar riscos e incertezas para o desenvolvimento futuro.

### Meta da Sprint (Sprint Goal)
> Ao final da Sprint 1, teremos toda a documentação de requisitos finalizada, os modelos conceitual e lógico do banco de dados aprovados, a estrutura inicial do projeto versionada no Git e o backlog de produto refinado e priorizado para as próximas Sprints.

### Período
08/09/2025 - 30/09/2025

---

| Prioridade | Atividade | Sprint |
| :--- | :--- | :---: |
| Alta | Documentar os casos de uso para os perfis Aluno, Professor Orientador e Prof. TG, incluindo os principais casos de uso ("Registrar Usuário", "Submeter Entrega", "Avaliar Entrega", "Monitorar Progresso"). | 1 |
| Alta | Modelar o ciclo de vida de uma entrega em diagrama de atividades (Submissão → Avaliação → Correção → Aprovação → Assinatura). | 1 |
| Alta | Consolidar todos os requisitos funcionais e não funcionais em um Documento de Especificação. | 1 |
| Alta | Criar o Diagrama Entidade-Relacionamento (DER) com todas as entidades (Usuário, Curso, Entrega, Submissão, Mensagem), atributos e relacionamentos. | 1 |
| Alta | Converter o DER em modelo lógico e escrever o script SQL inicial (DDL) para criação das tabelas. | 1 |
| Média | Configurar o repositório GitHub, criar README inicial e documentar estratégia de branches (main, develop, sprint-1, etc.). | 1 |
| Média | Criar a estrutura de pacotes base da aplicação Java (`com.tghub.model`, `com.tghub.dao`, `com.tghub.view`, `com.tghub.controller`). | 1 |
| Média | Criar o projeto base em JavaFX e configurar dependências necessárias (ex: JDBC Driver). | 1 |
| Baixa | Revisar e refinar todas as User Stories do backlog, garantindo clareza e consistência. | 1 |
| Baixa | Definir os critérios de aceite para todas as User Stories que serão desenvolvidas nas Sprints 2 e 3. | 1 |


### Atividades da Sprint 1
As atividades desta Sprint são focadas em planejamento e modelagem, não envolvendo a implementação de funcionalidades do backlog.

#### 1. Documentação e Especificação de Requisitos
* **Casos de Uso:**
    * Elaborar os diagramas de Caso de Uso para cada um dos três perfis de usuário (Aluno, Professor Orientador, Professor de TG).
    * Escrever a especificação detalhada para os principais casos de uso, como "Registrar Usuário", "Submeter Entrega", "Avaliar Entrega" e "Monitorar Progresso".
* **Diagramas de Atividades:**
    * Modelar o fluxo de trabalho (workflow) para os processos mais complexos, como o ciclo de vida de uma entrega (submissão -> avaliação -> correção -> aprovação -> assinatura).
* **Documento de Requisitos:**
    * Consolidar todos os requisitos funcionais e não funcionais em um único documento de especificação.

#### 2. Modelagem do Banco de Dados
* **Modelo Conceitual:**
    * Desenvolver o Diagrama Entidade-Relacionamento (DER) completo, identificando todas as entidades (ex: Usuario, Curso, Entrega, Submissao, Mensagem), seus atributos e os relacionamentos.
* **Modelo Lógico:**
    * Converter o DER para o modelo relacional, definindo o esquema de tabelas, chaves primárias e estrangeiras, tipos de dados e constraints.
* **Script de Criação (DDL):**
    * Escrever o script SQL com os comandos `CREATE TABLE` para todas as tabelas definidas no modelo lógico.

#### 3. Estrutura e Arquitetura do Projeto
* **Configuração do Repositório:**
    * Inicializar o repositório Git no GitHub.
    * Definir e documentar a estratégia de branches (main, sprint-1, etc.) no `readme.md`.
* **Estrutura de Pacotes:**
    * Definir e criar a estrutura de pacotes base da aplicação Java (ex: `com.tghub.model`, `com.tghub.dao`, `com.tghub.view`, `com.tghub.controller`).
* **Setup do Projeto JavaFX:**
    * Criar o projeto JavaFX base em uma IDE, configurando as dependências necessárias (JDBC Driver, etc.).

#### 4. Refinamento do Backlog
* **Revisão das User Stories:**
    * Analisar todas as User Stories presentes no `backlog.md` para garantir clareza e consistência.
* **Definição dos Critérios de Aceite:**
    * Escrever os critérios de aceite para cada uma das histórias que serão desenvolvidas nas Sprints 2 e 3.

---

### Definição de Pronto (DoD) para a Sprint 1
Uma atividade ou artefato desta Sprint é considerado **"Pronto"** quando atende aos seguintes critérios:

* O documento de especificação de requisitos (contendo casos de uso e diagramas) foi finalizado e revisado pela equipe.
* O Modelo Entidade-Relacionamento e o Modelo Lógico do banco de dados foram concluídos e aprovados.
* O script SQL (DDL) para criação do banco de dados foi escrito e validado.
* O repositório Git foi configurado com a estrutura de branches e o projeto JavaFX inicial foi versionado.
* Todas as User Stories para as Sprints 2 e 3 possuem critérios de aceite definidos.
