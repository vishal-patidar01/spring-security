🚀 Spring Security – Complete Authentication & Authorization

This project demonstrates a complete Spring Boot + Spring Security setup including:

Role-based access control

In-memory authentication

UserDetailsService implementation

BCrypt password encoding

Global exception handling

CRUD REST APIs (Posts)

DTO + Entity + Service + Repository pattern

MySQL integration

Clean project structure

JWT dependencies (ready for implementation)


📁 **Project Structure**

```
spring-security/
│
├── src/main/java/com/vishal/SecurityApp/SecurityApplication
│   ├── advice/
│   │   ├── ApiError.java
│   │   └── GlobalExceptionHandler.java
│   │
│   ├── config/
│   │   └── WebSecurityConfig.java
│   │
│   ├── controller/
│   │   └── PostController.java
│   │
│   ├── dto/
│   │   └── PostDto.java
│   │
│   ├── entities/
│   │   ├── PostEntity.java
│   │   └── User.java
│   │
│   ├── exceptions/
│   │   └── ResourceNotFoundException.java
│   │
│   ├── repositories/
│   │   ├── PostRepository.java
│   │   └── UserRepository.java
│   │
│   ├── services/
│   │   ├── UserService.java
│   │   └── PostServiceImpl.java
│   │
│   └── SecurityApplication.java
│
├── src/main/resources/
│   └── application.properties
│
└── pom.xml
```

 └── pom.xml
