**CRUD Application**

This repository contains a simple CRUD (Create, Read, Update, Delete) application implemented using SQL and MongoDB databases. The application is built using Spring Boot framework in Java.

### Features:

1. **SQL Database Operations:**
   - Create, read, update, and delete operations using SQL database.
   - Endpoints for interacting with SQL database:
     - `POST /Student/saveStudent` - Create a new student record.
     - `GET /Student/Getall` - Retrieve all student records.
     - `GET /Student/GetbyId/{Id}` - Retrieve a specific student record by ID.
     - `PUT /Student/updatebyId/{rollNo}` - Update a student record by roll number.
     - `GET /Student/getbyrange/{start}/{end}` - Retrieve student records within a specified ID range.
     - `DELETE /Student/DeleteById/{Id}` - Delete a student record by ID.

2. **MongoDB Operations:**
   - Create, read, update, and delete operations using MongoDB.
   - Endpoints for interacting with MongoDB:
     - `POST /Student/saveStudent1` - Create a new student record.
     - `GET /Student/Getall1` - Retrieve all student records.
     - `GET /Student/GetbyId1/{Id}` - Retrieve a specific student record by ID.
     - `PUT /Student/updatebyId1/{rollNo}` - Update a student record by roll number.
     - `GET /Student/getbyrange1/{start}/{end}` - Retrieve student records within a specified ID range.
     - `DELETE /Student/DeleteById1/{Id}` - Delete a student record by ID.

### Installation:

1. **Database Setup:**
   - Set up both SQL and MongoDB databases.
   - Configure the connection settings for both databases in the application's configuration files.

2. **Application Setup:**
   - Clone this repository to your local machine.
   - Open the project in your preferred IDE.
   - Configure the Spring Boot application properties to connect to your databases.
   - Build and run the application.

### Usage:

1. **SQL Database:**
   - Use the provided SQL endpoints to perform CRUD operations on student records.

2. **MongoDB:**
   - Use the provided MongoDB endpoints to perform CRUD operations on student records.
