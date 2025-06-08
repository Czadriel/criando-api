# Resumo do Projeto - API de Conta de Jogador

## 🎯 Objetivo:
#### Criar uma API RESTful em Java com Spring Boot para gerenciar contas de jogadores (PlayerAccount), permitindo operações básicas como criar, buscar, listar, atualizar e deletar usuários.

### 🛠️ Tecnologias Utilizadas:
#### Java 17+

#### Spring Boot

#### Spring Web

#### Spring Data JPA

#### H2 Database (ou outro banco relacional via JPA)

#### Swagger/OpenAPI (documentação da API)

#### Maven

#### 📦 Entidade Principal: PlayerAccount
#### A entidade representa a conta de um jogador com os seguintes campos:

#### id (Long) - Identificador único

#### nickname (String) - Apelido do jogador

#### email (String) - Email do jogador

#### senhaCriptografada (String) - Senha criptografada do jogador

### 🔁 Camadas do Projeto:
#### 1. Model (account/PlayerAccount.java)
#### Define a estrutura da entidade PlayerAccount e suas anotações JPA (@Entity, @Id, etc).

#### 2. Repository (RepositoryPlayer)
#### Interface que estende JpaRepository<PlayerAccount, Long>, fornecendo métodos CRUD prontos.

#### 3. Service (ServicePlayer)
#### Camada de regras de negócio com métodos:

#### listar(): retorna todos os jogadores

#### buscarPorId(Long id): retorna um jogador por ID

#### salvar(PlayerAccount): cria ou atualiza uma conta

#### deletar(Long id): remove uma conta

#### 4. Controller (ControllerPlayer)
#### Define os endpoints REST:

#### GET /player: lista todos os jogadores

#### GET /player/{id}: busca um jogador por ID

#### POST /player: cria uma nova conta

#### PUT /player/{id}: atualiza uma conta existente

#### DELETE /player/{id}: remove uma conta

#### 🔍 Swagger UI
#### Interface gráfica para testar a API em:
#### 👉 http://localhost:8080/swagger-ui.html
#### (necessário adicionar a dependência do Springdoc OpenAPI)

## 🙋 Sobre Mim
### Meu nome é Adriel e atualmente estou estudando Análise e Desenvolvimento de Sistemas, buscando me especializar em Desenvolvidor Back-end .
### Conecte-se comigo no [![linkendin](https://www.linkedin.com/in/adrielcezar/)](https://linkendin.com/)

## 📣 Contribuição
### Sinta-se à vontade para abrir issues ou fazer pull requests com sugestões e melhorias.
