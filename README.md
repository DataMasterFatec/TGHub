# 🚀 Projeto
##  Sistema de Gestão de Trabalhos de Graduação (TG)

> Aplicação **Java Desktop + JDBC** com **banco de dados relacional** para facilitar a gestão, acompanhamento e comunicação entre **coordenador, orientadores e orientados** durante o desenvolvimento dos Trabalhos de Graduação. [oai_citation:0‡Backlog_Gestao_TG.pdf](file-service://file-UsY2Pf5E63vkR57poAZwQj) [oai_citation:1‡Desafio do Parceiro Academico 2BD - Interno (2).pdf](file-service://file-HyU7AeZfeoMMcQ8w4vxGeY)

---

### 📄 Contexto do Desafio
- **Tema do semestre:** *Produto sem contexto* (CRUD desktop) com **modelagem de BD relacional**; a **primeira entrega não envolve acesso a BD**. Tecnologias ensinadas contam como **requisitos não funcionais**. [oai_citation:2‡Desafio do Parceiro Academico 2BD - Interno (2).pdf](file-service://file-HyU7AeZfeoMMcQ8w4vxGeY)
- **Tecnologias avaliadas:** **Java Desktop + JDBC**, **BD relacional**, **Git**. [oai_citation:3‡Desafio do Parceiro Academico 2BD - Interno (2).pdf](file-service://file-HyU7AeZfeoMMcQ8w4vxGeY)
- **Problema a resolver:** atrasos e perda de mensagens entre aluno e orientador; dificuldade em manter **histórico de correções e versões**; necessidade de gerar **TG final em Markdown (MD)**. [oai_citation:4‡Desafio do Parceiro Academico 2BD - Interno (2).pdf](file-service://file-HyU7AeZfeoMMcQ8w4vxGeY)

---

## 👥 Equipe
| Foto | Nome Completo | Papel | Contato (GitHub/LinkedIn) |
|---|---|---|---|
| <img src="https://media.licdn.com/dms/image/v2/D4E03AQETqTeWU1u0kQ/profile-displayphoto-shrink_400_400/B4EZcZJ13MHkAg-/0/1748473702240?e=1759968000&v=beta&t=JzKRX1STN03zrwpxW0U8Sc2v6cvh6PZ5ZXv_s6gYYBo" alt="Erick Faria" width="100" style="border-radius:50%"/> | _Erick Faria_ | **Product Owner (PO)** | [GitHub](https://github.com/ErickvFaria) · [LinkedIn](https://www.linkedin.com/in/%C3%A9rick-vin%C3%ADcius-79193b253?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app) |
| <img src="https://media.licdn.com/dms/image/v2/D5603AQFB3SF5kKWbpA/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1680381556339?e=1759968000&v=beta&t=dCTpHztLS2BHzzqoWRczFyV47yPz03WtsRAlL1g2MD0" alt="Pedro Quirino" width="100" style="border-radius:50%"/> | _Pedro Quirino_ | **Scrum Master (SM)** | [GitHub](https://github.com/pedroquirino) · [LinkedIn](https://www.linkedin.com/in/pedro-henrique-quirino-909aa8270?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app) |
| <img src="https://media.licdn.com/dms/image/v2/D4D03AQFIiL3WGBRszg/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1665246965939?e=1759968000&v=beta&t=2v3RldR6oCG1jxQOSfeo363Qgzmb_XAMw5TN684mkbM" alt="Rodrigo Pereira" width="100" style="border-radius:50%"/> | _Rodrigo Pereira_ | **Dev Team** | [GitHub](https://github.com/ropcastr) · [LinkedIn](https://www.linkedin.com/in/rodrigo-pereira-de-castro-09758853/) |
| <img src="https://media.licdn.com/dms/image/v2/D4D03AQGYuR3ifpe5eA/profile-displayphoto-shrink_400_400/B4DZXff2PxHsAg-/0/1743211423151?e=1759968000&v=beta&t=VsJZRlZYbFHNJvotAN86ClaNE173ULiN-o1iDc-IPc0" alt="Benjamin Marques" width="100" style="border-radius:50%"/> | _Benjamin Marques_ | **Dev Team** | [GitHub](https://github.com/maarquueess) · [LinkedIn](https://www.linkedin.com/in/benjamin-marques-48a4bb359?trk=contact-info) |
| <img src="https://media.licdn.com/dms/image/v2/D5603AQGxl091YHkmUg/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1730907608299?e=1759968000&v=beta&t=znfCRBn34xHGjLRqJMqx82uiN4W27-jkCbibBHhB-T4" alt="Kaio Adalton" width="100" style="border-radius:50%"/> | _Kaio Adalton_ | **Dev Team** | [GitHub](https://github.com/onkaidev) · [LinkedIn](https://www.linkedin.com/in/kaio-braz%C3%A3o?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app) |





---

## 🎯 Objetivo
Centralizar informações de TG (dados, entregas, histórico, feedbacks e commits), reduzindo atritos de comunicação e melhorando a rastreabilidade da evolução do trabalho. [oai_citation:6‡Backlog_Gestao_TG.pdf](file-service://file-UsY2Pf5E63vkR57poAZwQj)

---

## 🧩 Épicos
- **Gestão de Usuários** (alunos, orientadores, coordenador)
- **Gestão de TGs** (cadastro, informações, progresso, seções)
- **Comunicação e Interação** (chat, mensagens, histórico)
- **Integração com Git** (versionamento, histórico)
- **Relatórios e Histórico** (andamento, feedbacks, entregas)
- **Configurações** (permissões, exportações etc.) [oai_citation:7‡Backlog_Gestao_TG.pdf](file-service://file-UsY2Pf5E63vkR57poAZwQj)

---

## 📌 Product Backlog (User Stories)
> 

| ID | Épico | User Story | Prioridade |
|---|---|---|---|
| US01 | Gestão de Usuários | Como **coordenador**, quero **cadastrar orientadores** | **Must** |
| US02 | Gestão de Usuários | Como **coordenador**, quero **cadastrar orientados** | **Must** |
| US03 | Gestão de Usuários | Como coordenador, quero **visualizar lista de orientados** | Should |
| US04 | Gestão de Usuários | Como coordenador, quero **atualizar dados do orientado** | Could |
| US05 | Gestão de TGs | Como **orientado**, quero **cadastrar informações do meu TG** | **Must** |
| US06 | Gestão de TGs | Como orientado, quero **acompanhar o progresso do meu TG** | Should |
| US07 | Gestão de TGs | Como coordenador, quero **visualizar todos os TGs** | Could |
| US08 | Gestão de TGs | Como **orientado**, quero **enviar entregas do TG** | **Must** |
| US09 | Comunicação | Como **orientado**, quero **trocar mensagens com meu orientador (chat)** | **Must** |
| US10 | Comunicação | Como orientador, quero **registrar feedbacks em entregas** | Should |
| US11 | Comunicação | Como usuário, quero **acessar histórico de interações** | Should |
| US12 | Integração com Git | Como **orientado**, quero **vincular repositório Git/commits** | **Must** |
| US13 | Integração com Git | Como orientador, quero **acessar histórico de commits do aluno** | Should |
| US14 | Integração com Git | Como usuário, quero **comparar versões de commits** | Could |
| US15 | Relatórios | Como coordenador, quero **relatórios de evolução** | Could |
| US16 | Relatórios | Como coordenador, quero **exportar relatórios (CSV)** | Could |
| US17 | Relatórios | Como orientador, quero **histórico de entregas dos orientados** | Should |
| US18 | Configurações | Como coordenador, quero **definir permissões** | Could |
| US19 | Configurações | Como aluno, quero **notificações de prazos** | Could |
| US20 | Configurações | Como aluno/orientador, quero **alertas de feedbacks e prazos** | Could |

---

## ✅ Critérios de Aceitação (Definition of Ready – DoR)
> Estrutura de User Story + Critérios de Aceitação conforme **Guia de Artefatos** (3Cs, DoR/DoD). 

### US01 – Cadastro de orientadores (Must)
- Inserir **nome**, **e-mail** e **matrícula/ID** do orientador.
- **Validar obrigatórios** (não salvar em branco).
- **Persistir** no BD relacional (JDBC).
- Exibir orientador em **lista** após salvar.

### US02 – Cadastro de orientados (Must)
- Inserir **nome**, **RA** e **curso**.
- **Validar obrigatórios**.
- **Vincular orientador** no cadastro ou depois.
- **Persistir** no BD relacional.

### US05 – Cadastro de informações do TG (Must)
- Inserir **título**, **resumo** e **orientador vinculado**.
- Registrar **data de cadastro**.
- **Permitir atualizar** enquanto não finalizado.
- Orientador **visualiza** TG do aluno.

### US08 – Upload de entregas do TG (Must)
- Anexar arquivos **.docx** ou **.md**.
- Registrar **data** e **versão** da entrega.
- **Vincular** ao TG e ao aluno.
- Orientador **acessa/baixa** arquivos.
- **Histórico de versões** mantido.

### US09 – Chat aluno ↔ orientador (Must)
- Troca de mensagens (**remetente, destinatário, conteúdo, data/hora**).
- Aluno e orientador **visualizam histórico**.
- **Armazenar** no BD (tempo real ou simulado).

### US12 – Integração com Git (Must)
- Informar **URL de repositório Git** e **validar**.
- Exibir **commits** (autor, mensagem, data).
- Orientador **acessa histórico**.
> 

---

## 📅 Sprint Backlog – Exemplo (Sprint 1)
- **Meta:** base do sistema (cadastro de usuários e TG, upload e chat inicial). 
- **Capacidade estimada:** 16 Story Points (exemplo didático do guia).

| ID | User Story | Estimativa | Status |
|---|---|---|---|
| US01 | Cadastro de orientadores | 5 | A fazer |
| US02 | Cadastro de orientados | 5 | A fazer |
| US05 | Cadastro de informações do TG | 5 | A fazer |
| US08 | Upload de entregas | 8 | A fazer |
| US09 | Chat aluno ↔ orientador | 8 | A fazer |


---

## 📚 Documentação (repositório `/docs`)
- **DoR – Definition of Ready** (`docs/dor.md`): checklist de histórias prontas (critérios, regras, artefatos). 
- **DoD – Definition of Done** (`docs/dod.md`): critérios de entrega (versão no Git, PR, testes, limpeza de código etc.). 
- **Manual de Instalação** (`docs/manual-instalacao.md`) – **obrigatório**. 
- **Manual do Usuário** (`docs/manual-usuario.md`) – **obrigatório**. 
- **Modelo Entidade-Relacionamento** (`docs/modelo-dados.mer`) – **obrigatório**. 

---

## 🔧 Requisitos Não Funcionais
- **Aplicação Java Desktop** com **JDBC**.
- **Banco de Dados relacional** (modelo ER).
- **Git/GitHub** para versionamento.
- **Entrega de código funcional**  /  **conformidade técnica** avaliadas. 

---

## 🛠️ Tecnologias
- **Java**
- **Javafx**
- **IntelliJ IDEA**
- **Scene Builder**
- **JDBC**
- **MySQL/PostgreSQL (Relacional)**
- **Git/GitHub** 
- **Jira**
- **Discord**
  

---

## 🌿 Estratégia de Branch
- `main` – versão estável
- `Sprint-x` – versão de desenvolvimento

