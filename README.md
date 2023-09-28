# Spring Boot com MongoDB
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/gabrielwenchenck/spring-boot-mongodb/blob/main/LICENSE) 

## Sobre o projeto

Este projeto é um serviço de gerenciamento de usuários, posts e comentários, desenvolvido com Spring Boot e MongoDB. O objetivo deste projeto foi treinar habilidades de associações entre objetos (objetos aninhados e referências) utilizando MongoDB no Spring Boot, bem como compreender as decisões de design para um banco de dados orientado a documentos.

## Documentação

[![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)](https://documenter.getpostman.com/view/21578696/2s9YJZ3jRr)


## Modelo de domínio
![image](https://github.com/gabrielwenchenck/spring-boot-mongodb/assets/104534121/f6cf2e79-c81e-47b8-8dab-8e0cbb3f3cd9)


## Funcionalidades

- CRUD de usuários
- Busca de posts dos usuários
- Busca de posts por id
- Consulta de posts com os critérios: 
  - 'texto'(contido no título do post, no corpo do post ou no comentário associado à algum post)
  - 'minDate'(para buscar posts que foram feitos após essa data)
  - 'maxDate'(para buscar posts anteriores à essa data)

## Tecnologias utilizadas
- Java
- Spring Boot
- MongoDB
- Maven

## Para executar o projeto:

Pré-requisitos: Java 17

```bash
# clonar repositório
https://github.com/gabrielwenchenck/spring-boot-mongodb.git

# executar o projeto
./mvnw spring-boot:run
```

## Autor
Gabriel Inácio Wenchenck de Carvalho

