<hr>
<p align="center">
   <img src="https://github.com/renatof4rias/spring-project-delivery/assets/123312837/b64b845a-2303-40c0-8c04-54dd6f9d203e" #vitrinedev/>
</p>
<hr>
<h1 align="center"> Order Item </h1>

## Descrição do projeto 

<p align="justify">
Order Item é uma aplicação backend de uma API REST.

A aplicação consiste em um sistemas que cadastra, lista, busca, deleta e atualiza (CRUD) produtos, ordens de pedidos e usuários.  
</p>

<h1 align="center"> Tecnologias Utilizadas </h1>

## Back end

- Java 
- Spring Boot
- JPA / Hibernate
- Maven
- MVC
- Banco de Dados em Memória H2
<h1 align="center"> Como execurtar o projeto </h1>

## Back end  
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone git@github.com:renatof4rias/spring-project-orderItem

# entrar na pasta do projeto back end
cd orderItem

# executar o projeto
./mvnw spring-boot:run
```

<h1 align="center"> Como testar o projeto </h1>

Pré-requisitos: Postman

```bash
#END POINTS USUARIO
[GET] /users #Busca todos os usuários registrados no banco de dados.
[GET] /users/id #Busca um usuário específico.
[POST] /users #Cadastra um novo usuário ¹.
[DELETE] /users/id #Remove o cadastro de um usuário específico.
[PUT] /users/id #Atualiza dados de um usuário específico ².

#END POINTS PRODUTOS
[GET] /products #Busca todos os produtos registrados no banco de dados.
[GET] /products/id #Busca um produto específico.

#END POINTS ORDEM
[GET] /orders #Busca todos os pedidos registrados no banco de dados.
[GET] /orders/id #Busca um pedido específico.

#END POINTS CATEGORIA
[GET] /categories #Busca todas as categorias registrados no banco de dados.
[GET] /categories/id #Busca uma categoria específica.

```
Observações 
```bash
#Método [POST] /users e [PUT] /users/id necesita de um "body" como parâmetro.
Exemplo : 
{
        "name": " Nome usuário",
        "email": "abdc@12345.com",
        "phone": "01 0101-0101",
        "password": "admin"
}

```
# Autor
Renato Gonçalves Farias

https://www.linkedin.com/in/renatof4rias/

renatof4rias@gmail.com
