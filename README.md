# TGHub - Gestão de Trabalhos de Graduação

## 1. Título do Projeto
TGHub: Ciclo de Vida de Trabalhos de Graduação (TG) da modalidade Portfólio.

## 2. Descrição do Projeto
Este projeto visa solucionar as dores no processo de orientação e acompanhamento de Trabalhos de Graduação (TG) da modalidade Portfólio, criando um ecossistema centralizado para alunos, professores orientadores e professores de TG.

A solução ataca os seguintes problemas identificados:
* **Para o Aluno:** A comunicação com o orientador é falha e descentralizada, utilizando plataformas como e-mail e MS Teams, o que causa demora e perda de notificações.
* **Para o Professor Orientador:** Há uma grande dificuldade em manter um histórico de correções e acessar versões anteriores dos trabalhos para cada aluno, exigindo controles manuais e dispersos.
* **Para o Professor de TG:** É necessário um método eficiente para saber quais professores orientam quais alunos e o status de finalização de cada portfólio, processo que hoje depende de documentos físicos assinados.

O TGHub propõe uma plataforma única onde toda a interação, submissão de arquivos, feedback e acompanhamento do progresso acontecem de forma rastreável e organizada.

## 3. Backlog do Produto
O backlog completo do produto, contendo os épicos e as user stories para o desenvolvimento do sistema, pode ser encontrado no seguinte arquivo:

[Backlog do Produto](doc/backlog.md)

## 4. Cronograma de Evolução do Projeto
O desenvolvimento do projeto será realizado de forma incremental ao longo de três Sprints, cada uma representando uma fase do projeto. Ao final de cada Sprint, um incremento funcional do produto será apresentado.

| Sprint | Período da Sprint | Objetivo Principal (Sprint Goal) |
| :--- | :--- | :--- |
| **Sprint 1** | 08/09/2025 - 30/09/2025 | Foco em documentação, modelagem e estrutura do projeto. Serão definidos os casos de uso, o modelo de dados (MER e lógico), a arquitetura do sistema e as prioridades do backlog. |
| **Sprint 2** | 06/10/2025 - 26/10/2025 | Foco na implementação do núcleo de usuários e do banco de dados. Serão desenvolvidas as funcionalidades de registro/login para todos os perfis e as telas pós-login (dashboards) com dados dinâmicos, além dos formulários de preenchimento/visualização de TG para cada entrega e para a versão atual do documento final. |
| **Sprint 3** | 03/11/2025 - 23/11/2025 | Foco na implementação da funcionalidade de interação (chat). Será desenvolvida a mecânica troca de mensagens, avaliação, notificações e assinatura das entregas. |

**Link para Documentação da Sprint 1:** [Sprint 1](/doc/backlog_sprint1.md)  

## 5.  Tecnologias
- ![Java](https://img.icons8.com/color/48/java-coffee-cup-logo.png) &nbsp;   &nbsp;      ![MySQL](https://img.icons8.com/color/48/mysql-logo.png)  &nbsp;  &nbsp;      ![Git](https://img.icons8.com/color/48/git.png) 
- ![IntelliJ IDEA](https://img.icons8.com/color/48/intellij-idea.png) &nbsp;    &nbsp;    ![Trello](https://img.icons8.com/color/48/trello.png)
 &nbsp; &nbsp;               ![Discord](https://img.icons8.com/color/48/discord-logo.png)

## 6. Estratégia de Branch
* `main` – versão estável
* `Sprint-x` – versão de desenvolvimento

## 7. Equipe
| Foto | Nome Completo | Papel | GitHub/LinkedIn |
| :--- | :--- | :--- | :--- |
| <img src="https://media.licdn.com/dms/image/v2/D4E03AQETqTeWU1u0kQ/profile-displayphoto-shrink_400_400/B4EZcZJ13MHkAg-/0/1748473702240?e=1759968000&v=beta&t=JzKRX1STN03zrwpxW0U8Sc2v6cvh6PZ5ZXv_s6gYYBo" alt="Erick Faria" width="100" style="border-radius:50%"/> | Erick Faria | Product Owner (PO) | [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/ErickvFaria) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/%C3%A9rick-vin%C3%ADcius-79193b253) |
| <img src="https://media.licdn.com/dms/image/v2/D5603AQFB3SF5kKWbpA/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1680381556339?e=1759968000&v=beta&t=dCTpHztLS2BHzzqoWRczFyV47yPz03WtsRAlL1g2MD0" alt="Pedro Quirino" width="100" style="border-radius:50%"/> | Pedro Quirino | Scrum Master (SM) | [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/pedroquirino) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/pedro-henrique-quirino-909aa8270) |
| <img src="https://media.licdn.com/dms/image/v2/D4D03AQFIiL3WGBRszg/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1665246965939?e=1759968000&v=beta&t=2v3RldR6oCG1jxQOSfeo363Qgzmb_XAMw5TN684mkbM" alt="Rodrigo Pereira" width="100" style="border-radius:50%"/> | Rodrigo Pereira | Dev Team | [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/ropcastr) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/rodrigo-pereira-de-castro-09758853) |
| <img src="https://media.licdn.com/dms/image/v2/D4D03AQGYuR3ifpe5eA/profile-displayphoto-shrink_400_400/B4DZXff2PxHsAg-/0/1743211423151?e=1759968000&v=beta&t=VsJZRlZYbFHNJvotAN86ClaNE173ULiN-o1iDc-IPc0" alt="Benjamin Marques" width="100" style="border-radius:50%"/> | Benjamin Marques | Dev Team | [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/maarquueess) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/benjamin-marques-48a4bb359) |
| <img src="https://media.licdn.com/dms/image/v2/D5603AQGxl091YHkmUg/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1730907608299?e=1759968000&v=beta&t=znfCRBn34xHGjLRqJMqx82uiN4W27-jkCbibBHhB-T4" alt="Kaio Adalton" width="100" style="border-radius:50%"/> | Kaio Adalton | Dev Team | [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/onkaidev) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/kaio-braz%C3%A3o) |
| <img src="https://media.licdn.com/dms/image/v2/D4E03AQFPHRgLqobEcw/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1723668682051?e=1760572800&v=beta&t=lEgII4sWlZz4iaedaOEoY4mx0oVq25PgAVnNLke8Q_k" alt="Guilherme Ioshua" width="100" style="border-radius:50%"/> | Guilherme Ioshua| Dev Team | [![GitHub](https://img.icons8.com/ios-glyphs/30/ffffff/github.png)](https://github.com/guiioshua) &nbsp;&nbsp;&nbsp;&nbsp; [![LinkedIn](https://img.icons8.com/ios-filled/30/0077b5/linkedin.png)](https://www.linkedin.com/in/guilherme-ioshua-sene) |
