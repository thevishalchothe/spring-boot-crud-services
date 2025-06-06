# Customer Management System Example ⚙️💼 

## 📘 Project Overview

The **Customer Management System** is a backend service designed to perform basic **Create, Read, Update, and Delete (CRUD)** operations on customer data. It's ideal for learning and demonstrating RESTful service development using **Spring Boot**. This application can be extended into a full-fledged CRM (Customer Relationship Management) system.

---

##  Features 📝 

- Create, read, update, and delete customer records
- Upload Aadhar card as file with customer data
- RESTful API design using Spring Boot
- Layered architecture (Controller, Service, Repository)
- Global exception handling using `@RestControllerAdvice`
- `.gitignore` configured for clean version control
- Maven-based build and dependency management
- Swagger/OpenAPI ready (optional integration)

---

## Technologies Used 🚀 

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven
- H2 / MySQL (configurable)
- Swagger / OpenAPI (optional)

  ---

## How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/vishal-chothe-patil/spring-boot-crud-services.git
   ```
   
2. **Navigate to the project directory**

    ```bash
    cd spring-boot-crud-services
    ```

3.  **Build and run the application**

    ```bash
    mvn spring-boot:run
    ```

4. **Access the API**
    
    ```bash
    http://localhost:8080/api/customers
    ```
