# NSBM Student Hub

NSBM Student Hub is a comprehensive **Spring Boot 4.x** application built to manage student data efficiently. It includes full CRUD operations, advanced data navigation via pagination and sorting, and robust role-based security with encrypted credentials.

## 🚀 Features

* **Complete Student CRUD**: Create, Read, Update, and Delete student records.
* **Pagination & Sorting**: Efficient data retrieval using Spring Data JPA `Pageable`.
* **Role-Based Security**: Access control where 'ADMIN' roles are required for data modification.
* **Password Encryption**: Secure storage of user credentials using **BCrypt** hashing.
* **Database Integration**: Persistent storage using a MySQL relational database.

## 🛠️ Tech Stack

* **Java**: OpenJDK 24
* **Framework**: Spring Boot 4.0.2
* **ORM**: Spring Data JPA / Hibernate
* **Security**: Spring Security
* **Database**: MySQL
* **Build Tool**: Maven

## 📂 Project Structure

All source code is located under the package `com.day13.nsbm_student_hub`:

```text
src/main/java/com/day13/nsbm_student_hub/
├── config        # Security configuration and password encoding
├── controller    # REST API Endpoints
├── entity        # JPA Entities (Student, User, Role)
├── repository    # Data Access Layer interfaces
└── service       # Business logic (CRUD, Pagination, Sorting)
