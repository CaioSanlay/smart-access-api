# Smart Access API

Projeto desenvolvido para praticar backend com Spring Boot, simulando um sistema de controle de acesso (usuários e portas).

A ideia foi construir uma API completa, aplicando boas práticas como separação em camadas, uso de DTO, tratamento de exceções e algumas regras de negócio.

---

## O que o projeto faz

- Cadastra usuários
- Cadastra portas
- Registra acessos (qual usuário acessou qual porta)
- Lista os dados cadastrados
- Permite deletar usuários (com regra de segurança)

---

## Regras implementadas

- Não permite cadastrar duas portas com o mesmo nome
- Não permite deletar um usuário que já possui acessos registrados
- Retorna mensagens de erro mais claras (ex: usuário não encontrado)

---

## Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

---

## Estrutura

O projeto foi organizado em camadas:

- controller → recebe as requisições
- service → onde ficam as regras de negócio
- repository → acesso ao banco
- entity → representação das tabelas
- dto → entrada de dados da API
- exception → tratamento de erros

---

## Como rodar

1. Clonar o projeto

```bash
git clone https://github.com/CaioSanlay/smart-access-api.git

```
2. Configurar o banco no application.properties

```properties
spring.application.name=smart-access-api
spring.datasource.url=jdbc:postgresql://localhost:5432/smartdb
spring.datasource.username=postgres
spring.datasource.password=1234

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```
3. Rodar o projeto pela IDE (Intellij)

---

## Endpoints principais

### Users
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| POST   | /users   | Criar usuário |
| GET    | /users   | Listar usuários |
| DELETE | /users/{id} | Deletar usuário |

---

### Doors

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| POST   | /doors   | Criar porta|
| GET    | /doors   | Listar portas|

---

### Access 

| Método | Endpoint | Descrição |
|--------|----------|-----------|
 | POST  | /acess   | Registrar Acesso|

---

## Exemplos

#### Criar usuário:

```json
{
  "name": "Caio",
  "email": "caio@email.com"
}
```
#### Criar porta:

```json
{
  "name": "Porta Sala"
}
```
#### Registrar acesso:

```json
{
  "userId": 1,
  "doorId": 1
}
```
---
## Observações
Esse projeto foi importante pra eu consolidar:

- criação de API REST com Spring
- uso de DTO para separar entrada de dados
- tratamento global de exceções
- aplicação de regras de negócio simples
- uso de ResponseEntity

---

## Autor 

Caio Sanlay