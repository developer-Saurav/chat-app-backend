# 💬 Chat Application Backend

A scalable chat application backend built using **Spring Boot**, designed as a college project with real-world architecture and features.

---

## 🚀 Features (Planned & Implemented)

### ✅ Implemented
- User Registration API
- Spring Boot + JPA + Hibernate
- MySQL database integration
- Clean layered architecture (Controller, Service, Repository)
- Git & GitHub version control

### 🔜 Planned
- User Login with JWT Authentication
- Real-time chat using WebSocket
- Offline message queue
- Smart chat search
- Chat summaries
- Context-based chat rooms
- Polls inside chat rooms
- Media sharing (images, files)

---

## 🛠 Tech Stack

### Backend
- Java 25
- Spring Boot
- Spring Data JPA
- Hibernate
- Spring Security
- Maven

### Database
- MySQL

### Tools
- VS Code
- Git & GitHub
- Postman

---

## 📁 Project Structure


---
src/main/java/com/chatapp/chatapp
│
├── controller # REST APIs
├── service # Business logic
├── repository # Database access
├── entity # JPA entities
└── ChatappApplication.java
## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/developer-Saurav/chat-app-backend.git
cd chat-app-backend

CREATE DATABASE chatapp;

spring.datasource.url=jdbc:mysql://localhost:3306/chatapp
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

./mvnw spring-boot:run

http://localhost:8080

Author

Saurav Pandey
College Student | Java Backend Developer
GitHub: https://github.com/developer-Saurav


Save the file.

In VS Code:
- Open `README.md`
- You should see **nice formatted headings**


Open **CMD** in project folder:


cd F:\Chrome\chatapp
git status