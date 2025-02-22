# Spring Boot Journal Application

## Overview
This is a **Spring Boot-based Journal Application** that allows users to create, manage, and retrieve journal entries. The application provides a set of RESTful APIs secured with authentication.

## Features
- **User Authentication & Authorization** 
- **CRUD Operations on Journal Entries**
- **Rate Limiting & Security Measures**
- **Database Integration with MongoDB**

## Technologies Used
- **Spring Boot**
- **Spring Security (JWT Authentication)**
- **MongoDB (Spring Data MongoDB)**
- **Redis & Kafka (if applicable)**

## Getting Started
### Prerequisites
Ensure you have the following installed:
- Java 17+
- Maven 3+
- MongoDB (if using a local database)

### Installation & Setup
#### Clone the repository:
```bash
  git clone https://github.com/Dushyant-K/journal-app.git
  cd journal-app
```
#### Configure the Database:
Update `application.properties` or `application.yml` with your MongoDB credentials:
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/journal_db
```

#### Build and Run the Application:
```bash
  mvn clean install
  mvn spring-boot:run
```

The application will be available at: `http://localhost:8080`

The application will be available at `journalapplication-production-7081.up.railway.app`

## Contribution
Contributions are welcome! Feel free to open issues and submit pull requests.

## License
This project is licensed under the MIT License.

