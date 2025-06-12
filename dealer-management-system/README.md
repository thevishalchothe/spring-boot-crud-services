# Dealer Management System ⚙️💼

## 📘 Project Overview

The Dealer Management System is a backend service designed to perform CRUD operations on dealer data. It enables efficient onboarding and management of dealers, making it ideal for use in car finance platforms. Built with Spring Boot, RestFul API's and Spring Data JPA, this system demonstrates a scalable and modular architecture that can be extended into a full dealership and loan management platform.

---

## Features 🚀 

- Add new dealers with essential info (name, location, GST, etc.)
- View dealer details by ID
- List all active dealers
- Update dealer information
- Soft delete dealers (mark inactive)
- Clean RESTful APIs with meaningful responses
- Modular and maintainable architecture

---

## 🔗 REST API Endpoints

| Method | Endpoint            | Description              |
|--------|---------------------|--------------------------|
| POST   | `/api/dealers`      | Create a new dealer      |
| GET    | `/api/dealers`      | Get list of all dealers  |
| GET    | `/api/dealers/{id}` | Get dealer by ID         |
| PUT    | `/api/dealers/{id}` | Update dealer details    |
| DELETE | `/api/dealers/{id}` | Delete dealer by ID      |

All responses are wrapped with appropriate HTTP status codes and error messages via `ResponseEntity`.

---

## How to Run

1. **Clone the repo**  
   ```bash
   git clone https://github.com/your-username/dealer-management-system.git

   ```

2. **Navigate into project**

    ```bash
    cd dealer-management-system
    ```
3. **Build and run**

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```
4. **Access APIs**
Visit
    ```
     http://localhost:8080/api/dealers
    ```
 via Postman or Swagger.

---

## Example JSON Payload

    ```json
    Copy
    Edit
    {
      "name": "ABC Motors",
      "location": "Pune",
      "contactNumber": "9876543210",
      "email": "abc@dealers.com",
      "inventoryStatus": "Active"
    }
    ```

---

## Project Summary 📝

- Developed using Spring Boot, Spring Data JPA, and Lombok to ensure clean and maintainable code.
- Built RESTful APIs to support Create, Read, Update, and Delete (CRUD) operations for dealer management.
- Organized into modular layers including Controller, Service, Repository, and Model.
- Dealer entity includes key fields such as name, location, contact number, email, and inventory status.
- Implemented a custom exception (DealerNotFoundException) for clean and reusable error handling.
- Added global exception handling using @RestControllerAdvice to return consistent and informative error responses.
- Used ResponseEntity to provide proper HTTP status codes and structured API responses.
- Tested and validated API endpoints using tools like Postman.
- Designed to be easily extendable for future features like vehicle inventory integration or loan assignment.
