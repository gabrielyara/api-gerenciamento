# Portfolio API

API básica construída em Java utilizando Spring Boot para gerenciamento simples de usuários. Contém operações básicas REST (CRUD simplificado em memória).

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Maven (para gerenciamento de dependências)
- Spring Web (REST API)

---

### 📁 Estrutura do Projeto
portfolio-api/
├── src/
│   ├── main/
│   │   ├── java/
│       │   └── com/
│           │   └── portfolio/
│               │   ├── PortfolioApiApplication.java (Classe principal)
│               │   ├── model/
│                   │   └── User.java (Modelo de dados)
│               │   └── controller/
│                   │   └── UserController.java (Controlador REST)
│   │   └── resources/
│       │   └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── portfolio/
│                   └── controller/
│                       └── UserControllerTest.java
└── pom.xml (Configuração Maven)
└── README.md (Este arquivo)

---

#### 🛠️ Funcionalidades da API

- **GET /api/users**  
  Retorna a lista de todos os usuários.

- **GET /api/users/{id}**  
  Retorna um usuário pelo ID.

- **POST /api/users**  
  Cria um novo usuário.  
  Exemplo de JSON no corpo da requisição:
  ```json
  {
    "name": "Gabriel Yara",
    "email": "gabriel.yara@email.com"
  }

- **DELETE /api/users/{id}**
    Remove o usuário com o ID especificado.
