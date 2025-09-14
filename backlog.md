| Prioridade | Épico / User Story | Sprint |
| :--- | :--- | :---: |
| | **ATIVIDADES DA SPRINT 1 (Planejamento e Modelagem)** | |
| Alta | Como equipe, desejamos documentar os casos de uso para Aluno, Professor Orientador e Professor de TG, para que todos os fluxos principais estejam mapeados. | 1 |
| Alta | Como equipe, desejamos modelar o ciclo de vida de uma entrega em um diagrama de atividades, para que o fluxo fique claro e padronizado. | 1 |
| Alta | Como equipe, desejo consolidar os requisitos funcionais e não funcionais em um Documento de Especificação, para que haja uma base única de consulta. | 1 |
| Alta | Como equipe, desejo modelar o banco de dados em um DER, para que as entidades, atributos e relacionamentos fiquem claros. | 1 |
| Alta | Como equipe, desejo converter o DER em modelo lógico e escrever o script DDL inicial, para que o banco possa ser implementado. | 1 |
| Média | Como equipe, desejo configurar o repositório GitHub e documentar a estratégia de branches no README, para que o time siga um fluxo padrão. | 1 |
| Média | Como equipe, desejo criar a estrutura de pacotes base da aplicação Java, para que o código siga um padrão desde o início. | 1 |
| Média | Como equipe, desejo criar o projeto base em JavaFX e configurar dependências (ex: JDBC Driver), para que possamos iniciar o desenvolvimento. | 1 |
| Baixa | Como equipe, desejo revisar e refinar as User Stories existentes no backlog, para garantir clareza e consistência. | 1 |
| Baixa | Como equipe, desejo definir os critérios de aceite para as histórias que serão desenvolvidas nas Sprints 2 e 3, para que o backlog esteja pronto para execução. | 1 |
| | **ÉPICO 1: Controle de Acesso e Perfis de Usuário** | |
| Alta | Como um usuário, desejo realizar login com e-mail e senha para que eu seja autenticado e redirecionado para o meu dashboard. | 2 |
| Alta | Como um novo usuário, desejo registrar uma conta com meu perfil (Aluno, Orientador, Prof. TG) para que meus dados sejam salvos e eu possa acessar o sistema. | 2 |
| Média | Como um usuário, ao tentar logar com credenciais erradas, desejo receber uma mensagem de erro para que eu possa tentar novamente. | 2 |
| Média | Como um usuário, ao me registrar com um e-mail que já existe, desejo ser notificado para que se evite a duplicidade de contas. | 2 |
| Média | Como um aluno, ao me registrar, desejo selecionar meu orientador a partir de uma lista filtrada por curso para que o vínculo correto seja estabelecido. | 2 |
| Baixa | Como um usuário, desejo acessar uma tela de configurações para que eu possa atualizar meus dados cadastrais (nome, senha). | 2 |
| | **ÉPICO 2: Painel do Aluno** | |
| Alta | Como um aluno, desejo visualizar em meu dashboard a lista de todas as minhas entregas com seus status atuais (Aprovado, Pendente, etc.) para que eu possa acompanhar meu progresso. | 2 |
| Alta | Como um aluno, desejo acessar os detalhes de uma entrega para que eu possa ver o histórico de conversas e submissões com meu orientador. | 3 |
| Alta | Como um aluno, desejo enviar mensagens de texto e anexar arquivos em uma entrega para que eu possa submeter meu trabalho e me comunicar com meu orientador. | 3 |
| Média | Como um aluno, desejo ser notificado visualmente quando um professor avaliar minha entrega para que eu saiba que há um novo feedback. | 3 |
| Baixa | Como um aluno, desejo ter um botão para "Entregar Portfólio Final" que só é habilitado quando todas as entregas estiverem assinadas para que eu possa finalizar o processo. | 3 |
| | **ÉPICO 3: Painel do Professor Orientador** | |
| Alta | Como um professor orientador, desejo visualizar em meu painel a lista dos meus orientandos para que eu possa selecionar um e gerenciar suas entregas. | 2 |
| Alta | Como um professor orientador, desejo ser notificado sobre novas submissões dos meus alunos para que eu possa identificar rapidamente o que precisa ser avaliado. | 3 |
| Alta | Como um professor orientador, ao avaliar uma entrega, desejo poder "Aprovar" ou "Reprovar" e enviar um feedback com pontos de correção para que o aluno receba minha avaliação. | 3 |
| Média | Como um professor orientador, desejo poder "Assinar" uma entrega já aprovada para que eu possa formalizar a conclusão daquela etapa. | 3 |
| Média | Como um professor orientador, desejo acessar o histórico de versões e mensagens de uma entrega para que eu tenha todo o contexto necessário durante a avaliação. | 3 |
| | **ÉPICO 4: Painel do Professor de TG (Coordenador)** | |
| Alta | Como um Prof. TG, desejo ter um painel com a visão geral de todos os orientadores e o progresso de seus orientandos para que eu possa monitorar o andamento dos trabalhos. | 2 |
| Média | Como um Prof. TG, desejo poder visualizar o progresso de um aluno específico, incluindo o status de suas entregas, em modo de leitura para que eu possa realizar auditorias. | 3 |
| Média | Como um Prof. TG, desejo visualizar o histórico de interações (chat) entre um aluno e seu orientador em modo de leitura para que eu possa entender o contexto das correções. | 3 |
| Baixa | Como um Prof. TG, desejo visualizar uma lista de alunos com 100% das entregas assinadas e poder baixar o portfólio final para que eu possa gerenciar a conclusão dos TGs. | 3 |

## Definição de Pronto (Definition of Done - DoD)
Uma User Story é considerada **"Pronta"** quando:

* A funcionalidade foi implementada (interface e lógica de negócio).
* Os dados são persistidos corretamente no banco de dados.
* A funcionalidade foi testada pela equipe de desenvolvimento.
* O Product Owner (P.O.) validou que a entrega atende aos critérios de aceite e agrega o valor descrito na história.

---

## Definição de Preparado (Definition of Ready - DoR)
Uma User Story é considerada **"Preparada"** para ser puxada para uma Sprint quando:

* A história é clara, concisa e foi compreendida por toda a equipe de desenvolvimento.
* Os critérios de aceite foram definidos e são testáveis, deixando claro como a funcionalidade será validada.
* Quaisquer dependências (técnicas ou de outras histórias) foram identificadas e resolvidas ou planejadas.
* A equipe de desenvolvimento estimou o esforço necessário para completar a história.
* A história é pequena o suficiente para ser concluída dentro de uma única Sprint.
* O Product Owner (P.O.) validou a história, garantindo que ela agrega valor ao produto.
