# TODO Simple Backend

A simple backend service for a TODO application built using **Spring Boot**, **Hibernate (JPA)**, and **MySQL**.  
This project exposes RESTful APIs for managing tasks and is designed to be consumed by a frontend application using **Axios**.

---

## 🚀 Tech Stack

- Java
- Spring Boot
- Hibernate (JPA)
- MySQL
- Maven
- REST APIs
- Axios (Frontend Integration)

---

## 📌 Features

- Create a new task
- Get all tasks
- Update a task (PATCH)
- Delete a task
- MySQL-based persistent storage using Hibernate ORM

---

## 🔗 API Endpoints

| Method | Endpoint        | Description            |
|------:|------------------|------------------------|
| POST  | `/tasks`         | Add a new task         |
| GET   | `/tasks/all`     | Get all tasks          |
| PATCH | `/tasks/{id}`    | Update an existing task|
| DELETE| `/tasks/{id}`    | Delete a task          |

---

## 🗄 Database

- Database: **MySQL**
- ORM: **Hibernate (JPA)**
- Tables are auto-generated using JPA entity mappings.

---

## ⚙️ Configuration

Update your database configuration in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
