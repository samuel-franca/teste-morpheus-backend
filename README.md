## O backend do sistema foi desenvolvido em Java (utilizando o Spring Boot). Além disso, utilizou-se o banco de dados PostgreSQL para armazenar os usuários cadastrados.

### Pré-requisitos:
- **Java Development Kit (JDK)**. [Clique aqui](https://www.oracle.com/java/technologies/javase-downloads.html) para acessar a área de downloads do JDK.
- **Apache Maven**. [Clique aqui](https://maven.apache.org/download.cgi) para acessar a área de downloads do Maven.
- **PostgreSQL**. [Clique aqui](https://www.postgresql.org/download/) para acessar a área de downloads do PostgreSQL.

Obs.: Deve-se adicionar corretamente o Maven nas variáveis de ambiente.

### Passos para rodar a aplicação backend:
#### 1. Clone o repositório:
```
git clone https://github.com/samuel-franca/teste-morpheus-backend
```
#### 2. Crie o banco de dados no PostgreSQL:
```
create database cadastro;
```
#### 3. Configure o banco de dados:
- Abra o arquivo `src/main/resources/application.properties`.
- Mude o `spring.datasource.username` e o `spring.datasource.password`.

Obs.: Caso o PostgreSQL não esteja utilizando a porta 5432, deve-se modificá-la no `spring.datasource.url`.

#### 4. Rode a aplicação:
```
mvn spring-boot:run
```
O servidor iniciará na porta 8080.

### Deploy do backend no Heroku:
1. Instale o Heroku CLI (para possibilitar a conexão da máquina com o servidor Heroku). [Clique aqui](https://devcenter.heroku.com/articles/heroku-cli) para acessar a página de downloads do Heroku CLI.

2. Cadastre-se no [site oficial do Heroku](https://www.heroku.com/). Após realizar o cadastro e logar, deve-se criar um novo app em `New -> Create New App`.

3. Na página redirecionada, coloque o nome da aplicação (teste-morpheus-backend, no nosso caso) e clique em `Create app`.

4. O deploy foi feito com os arquivos contidos no Git, utilizando o Heroku CLI:
- `heroku login`;
- `git add .`, tendo em vista que o respositório git já estava iniciado na minha máquina, caso não esteja, deve-se inserir o comando `git init` (para mais informações, acesse a [página de deploy com o git do Heroku](https://devcenter.heroku.com/articles/git));
- `git commit -m "Mensagem do commit"`;
- `heroku git:remote -a teste-morpheus-backend`, na qual teste-morpheus-backend é o nome do respositório remoto criado;
- `git push heroku master`, para subir a aplicação pro Heroku;
- Após isso, a aplicação já está disponível no Heroku e uma URL de acesso é disponibilizada: https://teste-morpheus-backend.herokuapp.com/.

Vale ressaltar que, no backend, os controllers definidos foram feitos visando somente o uso da API no vueJS, por isso não há, por exemplo, a página inicial ("/"). No entanto, se inserir um path válido, a aplicação retorna o desejado. Por exemplo: https://teste-morpheus-backend.herokuapp.com/usuario/lista.
