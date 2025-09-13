# 🚀 Projeto
##  Sistema de Gestão de Trabalhos de Graduação (TG)

> Aplicação **Java Desktop + JDBC** com **banco de dados relacional** para facilitar a gestão, acompanhamento e comunicação entre **coordenador, orientadores e orientados** durante o desenvolvimento dos Trabalhos de Graduação.

---

### 📄 Contexto do Desafio
- **Tema do semestre:** *Produto entrega de TG* (CRUD desktop) com **modelagem de BD relacional**; a **primeira entrega não envolve acesso a BD**. Tecnologias ensinadas contam como **requisitos não funcionais**. 
- **Tecnologias avaliadas:** **Java Desktop + JDBC**, **BD relacional**, **Git**. 
- **Problema a resolver:** atrasos e perda de mensagens entre aluno e orientador; dificuldade em manter **histórico de correções e versões**; necessidade de gerar **TG final em Markdown (MD)**. 
---

## 👥 Equipe
| Foto | Nome Completo | Papel | (GitHub/LinkedIn) |
|---|---|---|---|
| <img src="https://media.licdn.com/dms/image/v2/D4E03AQETqTeWU1u0kQ/profile-displayphoto-shrink_400_400/B4EZcZJ13MHkAg-/0/1748473702240?e=1759968000&v=beta&t=JzKRX1STN03zrwpxW0U8Sc2v6cvh6PZ5ZXv_s6gYYBo" alt="Erick Faria" width="100" style="border-radius:50%"/> | _Erick Faria_ | **Product Owner (PO)** |&nbsp;&nbsp;&nbsp;[![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/ErickvFaria) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/%C3%A9rick-vin%C3%ADcius-79193b253?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app) |
| <img src="https://media.licdn.com/dms/image/v2/D5603AQFB3SF5kKWbpA/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1680381556339?e=1759968000&v=beta&t=dCTpHztLS2BHzzqoWRczFyV47yPz03WtsRAlL1g2MD0" alt="Pedro Quirino" width="100" style="border-radius:50%"/> | _Pedro Quirino_ | **Scrum Master (SM)** |&nbsp;&nbsp;&nbsp; [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/pedroquirino) &nbsp;&nbsp;&nbsp;&nbsp;  [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/pedro-henrique-quirino-909aa8270?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app)|
| <img src="https://media.licdn.com/dms/image/v2/D4D03AQFIiL3WGBRszg/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1665246965939?e=1759968000&v=beta&t=2v3RldR6oCG1jxQOSfeo363Qgzmb_XAMw5TN684mkbM" alt="Rodrigo Pereira" width="100" style="border-radius:50%"/> | _Rodrigo Pereira_ | **Dev Team** |&nbsp;&nbsp;&nbsp; [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/ropcastr) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/rodrigo-pereira-de-castro-09758853/) |
| <img src="https://media.licdn.com/dms/image/v2/D4D03AQGYuR3ifpe5eA/profile-displayphoto-shrink_400_400/B4DZXff2PxHsAg-/0/1743211423151?e=1759968000&v=beta&t=VsJZRlZYbFHNJvotAN86ClaNE173ULiN-o1iDc-IPc0" alt="Benjamin Marques" width="100" style="border-radius:50%"/> | _Benjamin Marques_ | **Dev Team** |&nbsp;&nbsp;&nbsp; [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/maarquueess) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/benjamin-marques-48a4bb359?trk=contact-info) |
| <img src="https://media.licdn.com/dms/image/v2/D5603AQGxl091YHkmUg/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1730907608299?e=1759968000&v=beta&t=znfCRBn34xHGjLRqJMqx82uiN4W27-jkCbibBHhB-T4" alt="Kaio Adalton" width="100" style="border-radius:50%"/> | _Kaio Adalton_ | **Dev Team** |&nbsp;&nbsp;&nbsp; [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/onkaidev) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/kaio-braz%C3%A3o?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app) |


---

## 🎯 Objetivo
Centralizar informações de TG (dados, entregas, histórico, feedbacks e commits), reduzindo atritos de comunicação e melhorando a rastreabilidade da evolução do trabalho.

---

## 🧩 Épicos
- **Gestão de Usuários** (alunos, orientadores, coordenador)
- **Gestão de TGs** (cadastro, informações, progresso, seções)
- **Comunicação e Interação** (chat, mensagens, histórico)
- **Relatórios e Histórico** (andamento, feedbacks, entregas)
- **Configurações**  

---

## 📌 Product Backlog (User Stories)
> 

| ID   | Épico                | User Story / Tarefa                                                                 | Prioridade |
| ---- | -------------------- | ----------------------------------------------------------------------------------- | ---------- |
| US01 | Levantamento Inicial | Como **coordenador**, quero **levantar os requisitos funcionais e não funcionais** para **definir claramente o escopo do sistema** | **Must**   |
| US02 | Levantamento Inicial | Como **coordenador**, quero **mapear usuários e criar personas** para **entender melhor as necessidades de cada perfil do sistema** | **Must**   |
| US03 | Levantamento Inicial | Como **coordenador**, quero **definir os objetivos principais do sistema/produto** para **alinhar expectativas com todos os envolvidos** | **Must**   |
| US04 | Levantamento Inicial | Como **usuário do sistema**, quero **ter fluxos de navegação macro** para **visualizar de forma simples como irei interagir com a aplicação** | **Must**   |
| US05 | Prototipação         | Como **usuário**, quero **visualizar wireframes de baixa fidelidade** para **entender a estrutura inicial das telas do sistema** | **Must**   |
| US06 | Prototipação         | Como **stakeholder**, quero **validar os wireframes criados** para **garantir que atendem às minhas necessidades antes do desenvolvimento** | **Should** |
| US07 | Banco de Dados       | Como **desenvolvedor**, quero **modelar o banco de dados conceitual** para **ter uma base estruturada para implementação futura** | **Should** |
| US08 | Documentação         | Como **coordenador**, quero **documentar os requisitos funcionais iniciais** para **manter o alinhamento entre equipe e stakeholders** | **Could**  |
| US09 | Gestão de Usuários   | Como **coordenador**, quero **cadastrar orientadores** para **organizar a equipe de orientação** | **Must**   |
| US10 | Gestão de Usuários   | Como **coordenador**, quero **cadastrar orientados** para **vincular alunos a orientadores** | **Must**   |
| US11 | Gestão de Usuários   | Como **coordenador**, quero **visualizar lista de orientados** para **acompanhar quem está cadastrado** | **Should** |
| US12 | Gestão de Usuários   | Como **coordenador**, quero **atualizar dados do orientado** para **manter as informações corretas no sistema** | **Could**  |
| US13 | Gestão de TGs        | Como **orientado**, quero **cadastrar informações do meu TG** para **formalizar meu projeto no sistema** | **Must**   |
| US14 | Gestão de TGs        | Como **orientado**, quero **acompanhar o progresso do meu TG** para **ter visibilidade da evolução do meu trabalho** | **Should** |
| US15 | Gestão de TGs        | Como **coordenador**, quero **visualizar todos os TGs** para **acompanhar a situação geral** | **Could**  |
| US16 | Gestão de TGs        | Como **orientado**, quero **enviar entregas do TG** para **submeter versões parciais do trabalho** | **Must**   |
| US17 | Comunicação          | Como **orientado**, quero **trocar mensagens com meu orientador (chat)** para **tirar dúvidas e receber feedback rápido** | **Must**   |
| US18 | Comunicação          | Como **orientador**, quero **registrar feedbacks em entregas** para **fornecer orientações diretamente nas submissões** | **Should** |
| US19 | Comunicação          | Como **usuário**, quero **acessar histórico de interações** para **consultar mensagens e feedbacks anteriores** | **Should** |
| US20 | Relatórios           | Como **coordenador**, quero **relatórios de evolução** para **acompanhar o andamento dos TGS** | **Could**  |
| US21 | Relatórios           | Como **coordenador**, quero **exportar relatórios (CSV)** para **compartilhar dados com outros envolvidos** | **Could**  |
| US22 | Relatórios           | Como **orientador**, quero **histórico de entregas dos orientados** para **acompanhar correções e prazos cumpridos** | **Should** |
| US23 | Configurações        | Como **coordenador**, quero **definir permissões** para **controlar acessos e responsabilidades no sistema** | **Could**  |
| US24 | Configurações        | Como **aluno**, quero **notificações de prazos** para **ser lembrado das minhas entregas** | **Could**  |
| US25 | Configurações        | Como **aluno/orientador**, quero **alertas de feedbacks e prazos** para **acompanhar interações importantes no sistema** | **Could**  |


---

## ✅ Critérios de Aceitação (Definition of Ready – DoR)
> Estrutura de User Story + Critérios de Aceitação conforme **Guia de Artefatos** (3Cs, DoR/DoD). 

# 📌 Sprint Backlog – Sprint 1

## 🎯 Objetivo da Sprint
Realizar o **levantamento de requisitos** e produzir os **wireframes iniciais**, junto da **documentação mínima necessária**, com meta de entregar um **esboço de tela** validado.

---

## ✅ Itens do Backlog da Sprint 1

1. **Levantar requisitos funcionais e não funcionais**  
   - Saída: lista documentada de requisitos.  

2. **Mapear usuários e criar personas**  
   - Saída: personas definidas.  

3. **Definir objetivos principais do sistema/produto**  
   - Saída: documento de objetivos aprovado pelo PO.  

4. **Criar fluxos de navegação macro**  
   - Saída: fluxograma de alto nível das interações.  

5. **Criar wireframes de baixa fidelidade para telas principais**  
   - Saída: wireframes iniciais (rascunho digital).  

6. **Validar wireframes com stakeholders**  
   - Saída: feedback registrado em ata/documento.  

7. **Documentar requisitos funcionais iniciais**  
   - Saída: documentação mínima pronta para apoiar evolução futura.  

---





## 📊 Status Board (Scrum)
| Item | Tarefa | Prioridade |Status |
|------|--------|--------|--------|
| 1 | Levantar requisitos funcionais e não funcionais | - |To Do |
| 2 | Mapear usuários e criar personas | - |To Do |
| 3 | Definir objetivos principais do sistema/produto | - |To Do |
| 4 | Criar fluxos de navegação macro | - |To Do |
| 5 | Criar wireframes de baixa fidelidade | - |To Do |
| 6 | Validar wireframes com stakeholders | - |To Do |
| 7 | Modelagem conceitual do Banco de dados | - |To Do |
| 8 | Documentar requisitos funcionais iniciais | - |To Do |


---



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
- ![Java](https://img.icons8.com/color/48/java-coffee-cup-logo.png) &nbsp;   &nbsp;      ![MySQL](https://img.icons8.com/color/48/mysql-logo.png)  &nbsp;  &nbsp;      ![Git](https://img.icons8.com/color/48/git.png) 
- ![IntelliJ IDEA](https://img.icons8.com/color/48/intellij-idea.png) &nbsp;    &nbsp;    ![Jira](https://img.icons8.com/color/48/jira.png) &nbsp; &nbsp;               ![Discord](https://img.icons8.com/color/48/discord-logo.png)


---

## 🌿 Estratégia de Branch
- `main` – versão estável
- `Sprint-x` – versão de desenvolvimento

