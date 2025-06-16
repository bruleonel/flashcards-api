
# Anki API - Projeto de Flashcards estilo Anki

Este projeto é uma API REST básica para cadastro e gerenciamento de flashcards, focada em facilitar o estudo com repetição espaçada.

## Tecnologias

- Java 17
- Spring Boot 3.1.2
- Maven
- MySQL
- Spring Data JPA

## Como rodar

1. Configure o MySQL e crie um banco chamado `anki_db`
2. Ajuste o arquivo `src/main/resources/application.properties` com seu usuário e senha do MySQL
3. No terminal, dentro da pasta do projeto, rode:

```bash
mvn clean spring-boot:run
```

4. A API estará disponível em `http://localhost:8080`

## Endpoints disponíveis

| Método | Endpoint      | Descrição               |
|--------|---------------|-------------------------|
| POST   | /cards        | Criar novo flashcard    |
| GET    | /cards        | Listar todos os cards   |
| GET    | /cards/{id}   | Buscar card pelo ID     |
| PUT    | /cards/{id}   | Editar card             |
| DELETE | /cards/{id}   | Deletar card            |

---

Depois podemos implementar a lógica de repetição espaçada, respostas e estudos.

