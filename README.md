# Forum Hub

## Descrição do Projeto

O **Forum Hub** é uma aplicação de backend desenvolvida para replicar a funcionalidade de um fórum. Os usuários podem criar tópicos, visualizar todos os tópicos, visualizar um tópico específico, atualizar e deletar tópicos. O objetivo é implementar uma API REST seguindo as melhores práticas do modelo RESTful.

## Funcionalidades

- Criar um novo tópico
- Mostrar todos os tópicos criados
- Mostrar um tópico específico
- Atualizar um tópico
- Eliminar um tópico

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- MySQL
- Spring Data JPA
- Spring Security
- Lombok
- Flyway Migration
- Bean Validation (javax.validation)

## Requisitos

- JDK 17 ou superior
- Maven 4
- MySQL

## Configuração do Banco de Dados

Certifique-se de que o MySQL esteja instalado e rodando. Crie um banco de dados chamado `forumhub` e configure o arquivo `application.properties` com suas credenciais do MySQL.


spring.datasource.url=jdbc:mysql://localhost:3306/forumhub
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

## Executando a Aplicação
Clone o repositório:

Copiar código
git clone https://github.com/seu_usuario/forumhub.git
Navegue até o diretório do projeto:

Copiar código
cd forumhub
Compile e execute a aplicação:

Copiar código
./mvnw spring-boot:run

## Endpoints da API
A API expõe os seguintes endpoints:

- GET /api/topics: Retorna todos os tópicos
- GET /api/topics/{id}: Retorna um tópico específico por ID
- POST /api/topics: Cria um novo tópico
- PUT /api/topics/{id}: Atualiza um tópico existente por ID- 
- DELETE /api/topics/{id}: Deleta um tópico por ID

# Desenvolvedor

[<img loading="lazy" src="https://avatars.githubusercontent.com/u/134724019?v=4" width=115><br><sub>Ronaldo Navarro</sub>](https://github.com/ronaldosnavarro)