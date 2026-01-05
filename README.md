# Spring Boot Backend Playground

This repository is a hands-on backend playground built using Spring Boot
to demonstrate clean REST API design, proper layering, and backend best practices.

The project is intentionally kept simple to focus on core fundamentals
that are commonly evaluated in backend interviews and real-world systems.

---

## Purpose

- Practice building RESTful APIs using Spring Boot
- Apply clean architecture (Controller → Service → Repository)
- Demonstrate validation, pagination, and exception handling
- Serve as a reference for backend interview preparation

---

## Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 In-memory Database
- Maven

---

## Project Structure

src/main/java/com/gaurang/playground
controller   - REST controllers
service      - Business logic
repository   - Data access layer
model        - JPA entities
dto          - Request/response DTOs
exception    - Global exception handling

---

## Features Implemented

- Create user
- Fetch users with pagination
- Fetch user by ID
- Update user
- Delete user
- Request validation using DTOs
- Global exception handling

---

## API Endpoints

Create User  
POST /users

Request body:
{
  "name": "Gaurang",
  "email": "gaurang@example.com"
}

Response:
{
  "id": 1,
  "name": "Gaurang",
  "email": "gaurang@example.com"
}

---

Get Users (Paginated)  
GET /users?page=0&size=5

---

Get User by ID  
GET /users/{id}

Example:
GET /users/1

---

Update User  
PUT /users/{id}

Request body:
{
  "name": "Gaurang Updated",
  "email": "gaurang.updated@example.com"
}

---

Delete User  
DELETE /users/{id}

Example:
DELETE /users/1

---

## Running the Application

Run from project root (where pom.xml exists):

./mvnw spring-boot:run

Application runs at:
http://localhost:8080

---

## Notes

- This project intentionally avoids additional infrastructure concerns
  to keep the focus on core backend design
- Emphasis is on code clarity, structure, and correctness
- Designed to be concise and easy to explain during backend interviews
