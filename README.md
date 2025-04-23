# Spring Boot JWT Authentication Demo

A demonstration project for JWT-based authentication in Spring Boot applications.

## Features

- User registration and login with JWT authentication
- Password encryption using BCrypt
- Role-based authorization with Spring Security
- Customized access denied handling
- H2 database for development and testing

## Technologies

- Spring Boot 3.x
- Spring Security
- JSON Web Tokens (JWT)
- BCrypt
- Maven
- H2 Database

## Getting Started

1. Clone the repository
2. Configure application.properties with your own settings
3. Run the application using Maven: `mvn spring-boot:run`
4. Access the application at http://localhost:8080

## API Endpoints

### Auth Controller

- POST /api/auth/signin - Authenticate user and generate JWT token
- POST /api/auth/signup - Register a new user
- POST /api/auth/signout - Logout user

### Test Controller

- GET /api/test/all - Public content
- GET /api/test/user - User role access
- GET /api/test/mod - Moderator role access
- GET /api/test/admin - Admin role access