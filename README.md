# API de Controle de Usuários, Produtos, Pedidos e Categorias

Este projeto é uma API desenvolvida para gerenciar usuários, produtos, pedidos e categorias. Foi implementado utilizando Spring Boot, Spring Data JPA, JPA, Hibernate e um banco de dados H2 para testes locais, além de integração com o PostgreSQL para o ambiente de produção.

## Arquitetura

A arquitetura da API segue o modelo de relacionamento entre entidades conforme a imagem a seguir:

![Arquitetura do Projeto](https://github.com/zainemt/webservice-springboot-jpa/blob/main/imgs/estrutura%20projeto.png)

As principais entidades incluem:
- **Product**: Representa um produto no sistema.
- **Order**: Representa um pedido feito por um usuário.
- **User**: Representa um cliente do sistema.
- **Category**: Classifica os produtos.
- **OrderItem**: Relação entre produtos e pedidos.
- **Payment**: Representa um pagamento vinculado a um pedido.
- **OrderStatus**: Enumeração de status de um pedido (como `WAITING_PAYMENT`, `PAID`, etc.).

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **JPA**
- **Hibernate**
- **H2 Database** (para testes locais)
- **PostgreSQL** (banco de dados em produção)

## Modelo Lógico

A API segue uma arquitetura baseada em camadas, conforme ilustrado na imagem abaixo:

![Modelo Lógico](https://github.com/zainemt/webservice-springboot-jpa/blob/main/imgs/modelo%20l%C3%B3gico.png)

As camadas incluem:

1. **Application Layer**: Representa a camada mais externa, responsável pela interação com os clientes da aplicação, como usuários ou outros sistemas.

2. **Resource Layer (Controladores REST)**: Nessa camada, são expostos os endpoints da API por meio de controladores REST. Ela gerencia a interação entre as requisições dos usuários e os serviços internos.

3. **Service Layer**: Camada intermediária que contém a lógica de negócios. Aqui são realizados os cálculos, regras e validações antes de passar ou receber dados da camada de acesso a dados.

4. **Data Access Layer (Repositórios de Dados)**: Esta camada é responsável por se comunicar com o banco de dados. Utiliza-se de repositórios (implementados via Spring Data JPA) para acessar, salvar e manipular os dados das entidades.

5. **Entities**: Representam os objetos de domínio da aplicação, mapeados para as tabelas no banco de dados. São usados em todas as camadas conforme necessário.

Essa divisão em camadas permite que a aplicação seja mais modular e facilita a manutenção, teste e reutilização de código, promovendo a separação de responsabilidades.

## Funcionalidades

A API oferece os seguintes endpoints principais:

- **Usuários**: CRUD de usuários.
- **Produtos**: Gerenciamento de produtos e categorias.
- **Pedidos**: Controle de pedidos e seus status.
- **Pagamentos**: Registros de pagamentos associados aos pedidos.

### Endpoints

1. **Usuários**
   - `GET /users`: Retorna a lista de todos os usuários.
   - `GET /users/{id}`: Retorna os detalhes de um usuário específico.
   - `POST /users`: Cria um novo usuário.
   - `PUT /users/{id}`: Atualiza os dados de um usuário existente.
   - `DELETE /users/{id}`: Deleta um usuário específico.

2. **Produtos**
   - `GET /products`: Retorna a lista de todos os produtos.
   - `GET /products/{id}`: Retorna os detalhes de um produto específico.
   - `POST /products`: Cria um novo produto.
   - `PUT /products/{id}`: Atualiza um produto existente.
   - `DELETE /products/{id}`: Remove um produto.

3. **Pedidos**
   - `GET /orders`: Retorna a lista de todos os pedidos.
   - `GET /orders/{id}`: Retorna os detalhes de um pedido específico.
   - `POST /orders`: Cria um novo pedido.
   - `PUT /orders/{id}`: Atualiza os detalhes de um pedido.
   - `DELETE /orders/{id}`: Remove um pedido específico.

4. **Pagamentos**
   - `POST /payments`: Registra um pagamento para um pedido específico.

## Como Executar Localmente

Para executar a aplicação localmente, siga os passos abaixo:

### Pré-requisitos
- **Java 21**
- **Maven**
- **Banco de Dados PostgreSQL (caso deseje rodar em produção)**

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/zainemt/webservice-springboot-jpa.git
2. Acesse o diretório do projeto:
   ```bash
   cd webservice-springboot-jpa
3. Rode a aplicação localmente usando o banco de dados H2:
   ```bash
   mvn spring-boot:run

## Banco de Dados H2
Acesse o console do H2 em http://localhost:8080/h2-console e utilize as seguintes credenciais:

- **JDBC URL: jdbc:h2:mem:testdb**
- **Usuário: sa**
- **Senha: (campo vazio)**

## Contribuições

Sinta-se à vontade para contribuir com o projeto. Para isso, siga os passos abaixo:

1. Faça um **fork** do projeto.
2. Crie um **branch** para a sua feature:
   ```bash
   git checkout -b feature/nome-da-feature
3. Commit suas mudanças:
   ```bash
   git commit -m 'Adiciona nova feature'
4. Envie para o repositório remoto:
   ```bash
   git push origin feature/nome-da-feature
5. Abra um Pull Request.



