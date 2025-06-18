### 📚 Flashcards API (Java + Spring Boot + Maven + JUnit)

Uma API simples (em construção) para gerenciamento de flashcards, com foco em estudo por repetição espaçada (similar ao Anki).
Esse projeto será usado como base para estudar JUnit, Maven, Selenium (futuramente para o frontend) e integração com MySQL.

### ✅ Tecnologias utilizadas

- Java 17
- Spring Boot
- Maven
- JUnit 5
- MySQL (em breve - atualmente usando H2 em memória)
- (Futuramente: Selenium + Frontend)

### ✅ Funcionalidades já implementadas

- Cadastro de Cards (Pergunta e Resposta)
- Edição de Cards
- Exclusão de Cards
- Listagem de todos os Cards
- Buscar card por ID

### ✅ Estrutura de Pastas

flashcards-api
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── usuario
│   │   │           └── flashcard
│   │   │               ├── controller
│   │   │               ├── entity
│   │   │               ├── repository
│   │   │               └── FlashcardsApiApplication.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── (Testes com JUnit - em breve)
└── pom.xml

### ✅ Como rodar o projeto localmente

**Pré-requisitos:**

- Java JDK 17+
- Maven instalado
- IDE (Eclipse, IntelliJ ou VS Code)
- Git Bash ou CMD (ou terminal do Eclipse)

**1. Compile o projeto com Maven**

Abra o terminal na pasta do projeto (onde está o pom.xml) e execute:
mvn clean install

**2. Rode o projeto Spring Boot**

Ainda na raiz do projeto:
mvn spring-boot:run

**3. Teste a API no navegador ou Postman:**

Exemplos de endpoints:

| Método | URL                                | Descrição                       |
| ------ | ---------------------------------- | ------------------------------- |
| GET    | `http://localhost:8080/cards`      | Listar todos os cards           |
| POST   | `http://localhost:8080/cards`      | Criar novo card (JSON no corpo) |
| PUT    | `http://localhost:8080/cards/{id}` | Editar um card                  |
| DELETE | `http://localhost:8080/cards/{id}` | Excluir um card                 |
| GET    | `http://localhost:8080/cards/{id}` | Buscar por ID                   |

### ✅ Configuração futura para MySQL

Em construção....

### ✅ Próximos passos do projeto

- Conectar ao MySQL
- Criar testes unitários com JUnit
- Adicionar a lógica de espaçamento baseado em acertos/erros
- Criar o Frontend (Angular ou outro)
- Automatizar testes end-to-end com Selenium

### ✅ Comandos Maven Úteis:

| Comando               | O que faz                 |
| --------------------- | ------------------------- |
| `mvn clean install`   | Faz build + testes        |
| `mvn spring-boot:run` | Roda a aplicação          |
| `mvn test`            | Executa os testes (JUnit) |


### ✅ Sobre a criadora do projeto

Este projeto está sendo desenvolvido como parte dos estudos da Bruna Leonel com foco em automação de testes e desenvolvimento Java.