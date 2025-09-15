## Planejamento da Sprint 1

### Desafio
O principal desafio da Sprint 1 é transformar os conceitos e wireframes em uma base técnica e documental sólida para o projeto. O foco não está na escrita de código funcional, mas na criação dos artefatos de engenharia de software que servirão como um mapa para as Sprints de implementação. A equipe deve traduzir as necessidades dos usuários em especificações formais e projetar a arquitetura de dados que suportará todas as funcionalidades. O sucesso desta Sprint será medido pela clareza e completude da documentação e dos modelos gerados, que devem mitigar riscos e incertezas para o desenvolvimento futuro.

### Meta da Sprint (Sprint Goal)
> Ao final da Sprint 1, teremos toda a documentação de requisitos finalizada, os modelos conceitual e lógico do banco de dados aprovados, a estrutura inicial do projeto versionada no Git e o backlog de produto refinado e priorizado para as próximas Sprints.

### Período
08/09/2025 - 30/09/2025

---

| Prioridade | Atividade | Estimativa (Pontos) |
| :--- | :--- | :---: |
| Alta | Documentar os casos de uso para os perfis Aluno, Professor Orientador e Prof. TG, incluindo os principais casos de uso ("Registrar Usuário", "Submeter Entrega", "Avaliar Entrega", "Monitorar Progresso"). | 5 |
| Alta | Modelar o ciclo de vida de uma entrega em diagrama de atividades (Submissão → Avaliação → Correção → Aprovação → Assinatura). | 3 |
| Alta | Consolidar todos os requisitos funcionais e não funcionais em um Documento de Especificação. | 5 |
| Alta | Criar o Diagrama Entidade-Relacionamento (DER) com todas as entidades (Usuário, Curso, Entrega, Submissão, Mensagem), atributos e relacionamentos. | 8 |
| Alta | Converter o DER em modelo lógico e escrever o script SQL inicial (DDL) para criação das tabelas. | 5 |
| Média | Configurar o repositório GitHub, criar README inicial e documentar estratégia de branches (main, develop, sprint-1, etc.). | 1 |
| Média | Criar a estrutura de pacotes base da aplicação Java (`com.tghub.model`, `com.tghub.dao`, `com.tghub.view`, `com.tghub.controller`). | 1 |
| Média | Criar o projeto base em JavaFX e configurar dependências necessárias (ex: JDBC Driver). | 2 |
| Baixa | Revisar e refinar todas as User Stories do backlog, garantindo clareza e consistência. | 3 |
| Baixa | Definir os critérios de aceite para todas as User Stories que serão desenvolvidas nas Sprints 2 e 3. | 3 |

### Definição de Pronto (DoD) para a Sprint 1
Uma atividade ou artefato desta Sprint é considerado **"Pronto"** quando atende aos seguintes critérios:

* O documento de especificação de requisitos (contendo casos de uso e diagramas) foi finalizado e revisado pela equipe.
* O Modelo Entidade-Relacionamento e o Modelo Lógico do banco de dados foram concluídos e aprovados.
* O script SQL (DDL) para criação do banco de dados foi escrito e validado.
* O repositório Git foi configurado com a estrutura de branches e o projeto JavaFX inicial foi versionado.
* Todas as User Stories para as Sprints 2 e 3 possuem critérios de aceite definidos.