# 🍃 API REST - Spring Boot & MongoDB

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![MongoDB](https://img.shields.io/badge/MongoDB-Atlas-green)

API RESTful completa desenvolvida para gerenciamento de usuários, integrada ao banco de dados NoSQL MongoDB.

---

## 🚀 Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3**
* **Spring Data MongoDB**
* **Lombok**
* **Maven**

---

## 🛠️ Funcionalidades (CRUD)

- [x] **Criar:** Cadastrar novos usuários
- [x] **Listar:** Buscar todos os usuários
- [x] **Buscar por ID:** Obter detalhes de um usuário específico
- [x] **Atualizar:** Editar dados de um usuário
- [x] **Deletar:** Remover um usuário por ID

---

## 📌 Endpoints da API

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `POST` | `/users` | Cria um novo usuário |
| `GET` | `/users` | Retorna todos os usuários |
| `GET` | `/users/{id}` | Retorna um usuário pelo ID |
| `PUT` | `/users/{id}` | Atualiza as informações do usuário |
| `DELETE` | `/users/{id}` | Deleta um usuário pelo ID |

---

## ⚙️ Como executar o projeto

### Pré-requisitos
* Java 17 instalado
* Maven instalado
* Conta no [MongoDB Atlas](https://www.mongodb.com/cloud/atlas) ou MongoDB local rodando

### Passos

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git](https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git)
   cd SEU-REPOSITORIO
