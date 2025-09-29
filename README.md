<h1 align="center"> EQUIPE DATA-MASTER </h1>
<h2 align="center"> <strong>TG Hub</strong><br>Gestão de Trabalhos de Graduação</h2>
<h3 align="center">2º Semestre BD - 2025 - 2</h3>

## Índice
[🎯 Objetivo](#-objetivo) •
[🖼️ Backlog](#-backlog-do-produto) •
[⏳ Cronograma](#-cronograma-de-evolução-do-projeto) •
[📋 RF](#-requisitos-funcionais-rf) •
[⚙️ RNF](#️-requisitos-não-funcionais-rnf) •
[💻 Tecnologias](#-tecnologias-e-ferramentas-utilizadas) •
[📁 Documentação](#-documentação-geral) •
[👥 Equipe](#-equipe) •

## 🎯 Objetivo

O **TGHUB** é uma aplicação desktop projetada para gerenciar, centralizar e otimizar o fluxo de desenvolvimento e orientação dos Trabalhos de Graduação (TG) na modalidade Portfólio. A plataforma foi concebida para resolver problemas específicos enfrentados por cada um dos envolvidos no processo acadêmico.

### Para o Aluno:
* **Dor:** Comunicação descentralizada e ineficiente com o orientador, resultando em perda de histórico e feedbacks dispersos em e-mails e outras plataformas.
* **Solução do TGHUB:** Oferece um **canal de comunicação direto e contextualizado** para cada entrega do TG. Através de **formulários guiados**, o aluno constrói seu portfólio de acordo com o padrão exigido, submetendo versões que ficam registradas em um **histórico claro e acessível**, eliminando a ambiguidade e a perda de informações.

### Para o Professor Orientador:
* **Dor:** Dificuldade em acompanhar múltiplos alunos, manter um histórico de correções e acessar versões anteriores dos trabalhos, exigindo controles manuais e paralelos.
* **Solução do TGHUB:** Disponibiliza um **dashboard de gerenciamento** que exibe o progresso de todos os orientandos em tempo real. O sistema organiza o **histórico de submissões e feedbacks** para cada entrega, permitindo a aprovação de versões e a **assinatura digital** das etapas concluídas, centralizando todo o processo de avaliação em um único local.

### Para o Coordenador de TG:
* **Dor:** Falta de visibilidade sobre o andamento dos TGs, os vínculos entre alunos e orientadores, e a dependência de processos manuais para validar a finalização dos trabalhos.
* **Solução do TGHUB:** Fornece **dashboards de supervisão** que permitem ao Coordenador auditar o andamento de qualquer trabalho em modo de leitura, visualizando o histórico de interações e o status de cada entrega. A plataforma automatiza a verificação de quais portfólios estão completos e assinados, agilizando o processo de encerramento do semestre.

Em essência, o TGHUB substitui o fluxo fragmentado de e-mails, trocas de arquivos e controles manuais por uma plataforma única e estruturada, garantindo que o processo de orientação seja mais eficiente, transparente e rastreável para todos os envolvidos.

## 🖼️ Backlog do Produto
O backlog completo do produto, contendo os épicos e as user stories para o desenvolvimento do sistema, pode ser encontrado no seguinte arquivo:

[Backlog do Produto](docs/backlogs/product_backlog.md)

## ⏳ Cronograma de Evolução do Projeto
O desenvolvimento do projeto será realizado de forma incremental ao longo de três Sprints, cada uma representando uma fase do projeto. Ao final de cada Sprint, um incremento funcional do produto será apresentado.


| Sprint | Período da Sprint | Objetivo Principal (Sprint Goal) |Status| Detalhamento da Sprint | Incremento Entregue |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **1** | 08/09/2025 - 28/09/2025 | Foco em documentação, modelagem e estrutura do projeto. Serão definidos os casos de uso, o modelo de dados (MER e lógico), a arquitetura do sistema e as prioridades do backlog. |✅ |[Backlog](/docs/backlogs/backlog_sprint1.md) [Burndown](docs/burndown/relatorioSprintUmTGHub.png)| [Entrega](docs/wireframes/interface_login.gif) |
| **2** | 06/10/2025 - 26/10/2025 | Foco na implementação do núcleo de usuários e do banco de dados. Serão desenvolvidas as funcionalidades de registro/login para todos os perfis e as telas pós-login (dashboards) com dados dinâmicos, além dos formulários de preenchimento/visualização de TG para cada entrega e para a versão atual do documento final. | 🔄 |[Backlog da Sprint 2](/docs/backlogs/backlog_sprint2.md) | |
| **3** | 03/11/2025 - 23/11/2025 | Foco na implementação da funcionalidade de interação (chat). Será desenvolvida a mecânica troca de mensagens, avaliação, notificações e assinatura das entregas. | 🔄 | -| |

## 📋 Requisitos Funcionais (RF)

Abaixo, os requisitos funcionais derivados das *User Stories* priorizadas no backlog:

<details>
<summary><strong>1. Acesso e Autenticação</strong></summary>

- RF01: O sistema deve permitir que membros da comunidade acadêmica (Aluno, Orientador, Prof. TG) acessem sua área pessoal de forma segura.
- RF02: O sistema deve permitir a criação de um acesso inicial para novos membros.
- RF03: O sistema deve permitir atualização de informações pessoais do usuário.

</details>

<details>
<summary><strong>2. Gestão do Progresso</strong></summary>

- RF04: O sistema deve exibir ao aluno uma visão geral do status de todas as suas entregas.
- RF05: O sistema deve exibir ao orientador o progresso de todos os seus orientandos.
- RF06: O sistema deve exibir ao professor de TG o progresso consolidado de todos os trabalhos do semestre.

</details>

<details>
<summary><strong>3. Produção e Submissão de Trabalhos</strong></summary>

- RF07: O sistema deve permitir que o aluno construa o conteúdo de suas entregas de forma guiada.
- RF08: O sistema deve permitir que o aluno submeta seu trabalho ao orientador.
- RF09: O sistema deve permitir que o orientador registre avaliações formais sobre submissões.
- RF10: O sistema deve manter um histórico de versões de entregas e feedbacks associados.
- RF11: O sistema deve permitir a revisão do resultado final do documento antes da entrega.
- RF12: O sistema deve permitir a formalização e obtenção do documento final da entrega.
- RF13: O sistema deve permitir a submissão final do portfóĺio do aluno.

</details>

<details>
<summary><strong>4. Comunicação e Notificações</strong></summary>

- RF14: O sistema deve notificar orientadores sobre novas submissões.
- RF15: O sistema deve notificar alunos sobre novas avaliações de orientadores.

</details>

<details>
<summary><strong>5. Validação e Auditoria</strong></summary>

- RF16: O sistema deve permitir ao orientador validar formalmente uma entrega concluída.
- RF17: O sistema deve permitir ao professor de TG auditar o andamento de um aluno específico.
- RF18: O sistema deve permitir ao professor de TG consultar o histórico de interações entre aluno e orientador.
- RF19: O sistema deve permitir ao professor de TG acessar e arquivar portfólios finalizados.

</details>

<details>
<summary><strong>6. Vínculos Acadêmicos</strong></summary>

- RF20: O sistema deve permitir que alunos estabeleçam vínculo formal com seu orientador.

</details>

---

## ⚙️ Requisitos Não Funcionais (RNF)

<details>
<summary><strong>RNF01 - Usabilidade</strong></summary>

A interface deve ser intuitiva, responsiva e acessível, considerando diferentes perfis de usuário (Aluno, Orientador, Prof. TG).

</details>

<details>
<summary><strong>RNF02 - Confiabilidade</strong></summary>

O sistema deve versionar as submissões e avaliações para garantir rastreabilidade.

</details>

<details>
<summary><strong>RNF03 - Performance</strong></summary>

O sistema deve responder às interações do usuário em até 2 segundos em condições normais de uso.

</details>

<details>
<summary><strong>RNF04 - Manutenibilidade</strong></summary>

O código deve ser modular e documentado, facilitando atualizações e correções.

</details>

---

## 💻 Tecnologias e Ferramentas Utilizadas

| Tecnologia/Ferramenta | Ícone | Descrição |
|------------------------|-------|-----------|
| Java | ![Java](https://img.icons8.com/color/48/java-coffee-cup-logo.png) | Linguagem principal utilizada no **back-end** do sistema. |
| JavaFX| <img src="https://www.qftest.com/fileadmin/Webdata/logos-icons/JavaFX.png" alt="JavaFX" width="48"> | Framework principal para a construção da interface gráfica (GUI) da aplicação desktop, garantindo uma experiência de usuário moderna e responsiva. |
| MySQL Connector | ![Connector](https://img.icons8.com/color/48/database.png) | Driver JDBC oficial que permite a comunicação direta entre a aplicação Java e o servidor de banco de dados MySQL. |
| MySQL | ![MySQL](https://img.icons8.com/color/48/mysql-logo.png) | Banco de dados relacional, responsável pelo armazenamento das informações. |
| Maven | <img src="https://icons.iconarchive.com/icons/simpleicons-team/simple/256/apache-maven-icon.png" alt="Maven" width="48"> | Ferramenta de automação de compilação (*build*) e gerenciamento de dependências, responsável por baixar as bibliotecas e empacotar o projeto.|
| Git | ![Git](https://img.icons8.com/color/48/git.png) | Sistema de controle de versão do código-fonte. |
| Jira | ![Jira](https://img.icons8.com/color/48/jira.png)|Gerenciamento de projeto e rastreamento de tarefas.|
 
## 📁 [Documentação Geral](docs/)

### 🏃‍ Definição de Pronto (Definition of Done - DoD)
Uma User Story é considerada **"Pronta"** quando:

* A funcionalidade foi implementada (interface e lógica de negócio).
* Os dados são persistidos corretamente no banco de dados.
* A funcionalidade foi testada pela equipe de desenvolvimento.
* O Product Owner (P.O.) validou que a entrega atende aos critérios de aceite e agrega o valor descrito na história.

### 🏆 Definição de Preparado (Definition of Ready - DoR)
Uma User Story é considerada **"Preparada"** para ser puxada para uma Sprint quando:

* A história é clara, concisa e foi compreendida por toda a equipe de desenvolvimento.
* Os critérios de aceite foram definidos e são testáveis, deixando claro como a funcionalidade será validada.
* Quaisquer dependências (técnicas ou de outras histórias) foram identificadas e resolvidas ou planejadas.
* A equipe de desenvolvimento estimou o esforço necessário para completar a história.
* A história é pequena o suficiente para ser concluída dentro de uma única Sprint.
* O Product Owner (P.O.) validou a história, garantindo que ela agrega valor ao produto.

### 🧩 Estratégia de Branch
* `main` – versão estável
* `Sprint-x` – versão de desenvolvimento

[Diagrama de Arquitetura do Sistema](docs/tecnica/Diagrama%20de%20Arquitetura%20do%20Sistema.png) 

[Wireflow da Aplicação](docs/wireframes/Wireflow.png)

[Casos de uso](docs/use_cases/CasosDeUso.md)

[Padrão Commit do Projeto](docs/processos/padrao_commit.md)



## 👥 Equipe
| Foto | Nome Completo | Papel | GitHub/LinkedIn |
| :--- | :--- | :--- | :--- |
| <img src="https://media.licdn.com/dms/image/v2/D4E03AQETqTeWU1u0kQ/profile-displayphoto-shrink_400_400/B4EZcZJ13MHkAg-/0/1748473702240?e=1759968000&v=beta&t=JzKRX1STN03zrwpxW0U8Sc2v6cvh6PZ5ZXv_s6gYYBo" alt="Erick Faria" width="100" style="border-radius:50%"/> | Erick Faria | Product Owner (PO) | [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/ErickvFaria) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/%C3%A9rick-vin%C3%ADcius-79193b253) |
| <img src="https://media.licdn.com/dms/image/v2/D5603AQFB3SF5kKWbpA/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1680381556339?e=1759968000&v=beta&t=dCTpHztLS2BHzzqoWRczFyV47yPz03WtsRAlL1g2MD0" alt="Pedro Quirino" width="100" style="border-radius:50%"/> | Pedro Quirino | Scrum Master (SM) | [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/pedroquirino) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/pedro-henrique-quirino-909aa8270) |
| <img src="https://media.licdn.com/dms/image/v2/D4D03AQFIiL3WGBRszg/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1665246965939?e=1759968000&v=beta&t=2v3RldR6oCG1jxQOSfeo363Qgzmb_XAMw5TN684mkbM" alt="Rodrigo Pereira" width="100" style="border-radius:50%"/> | Rodrigo Pereira | Dev Team | [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/ropcastr) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/rodrigo-pereira-de-castro-09758853) |
| <img src="https://media.licdn.com/dms/image/v2/D4D03AQGYuR3ifpe5eA/profile-displayphoto-shrink_400_400/B4DZXff2PxHsAg-/0/1743211423151?e=1759968000&v=beta&t=VsJZRlZYbFHNJvotAN86ClaNE173ULiN-o1iDc-IPc0" alt="Benjamin Marques" width="100" style="border-radius:50%"/> | Benjamin Marques | Dev Team | [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/maarquueess) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/benjamin-marques-48a4bb359) |
| <img src="https://media.licdn.com/dms/image/v2/D5603AQGxl091YHkmUg/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1730907608299?e=1759968000&v=beta&t=znfCRBn34xHGjLRqJMqx82uiN4W27-jkCbibBHhB-T4" alt="Kaio Adalton" width="100" style="border-radius:50%"/> | Kaio Adalton | Dev Team | [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/onkaidev) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/kaio-braz%C3%A3o) |
| <img src="https://media.licdn.com/dms/image/v2/D4E03AQFPHRgLqobEcw/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1723668682051?e=1760572800&v=beta&t=lEgII4sWlZz4iaedaOEoY4mx0oVq25PgAVnNLke8Q_k" alt="Guilherme Ioshua" width="100" style="border-radius:50%"/> | Guilherme Ioshua| Dev Team | [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/guiioshua) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/guilherme-ioshua-sene) |
