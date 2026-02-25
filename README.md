# weather-file-upload
This is a Spring Boot web application that allows users to upload files (such as CSV or Excel) and store them in a MySQL database.
# File Upload Project

## About the Project

This is a simple Spring Boot project where I implemented file upload functionality.  
The uploaded file (like CSV or Excel) is stored in MySQL database using LONGBLOB.

I used Spring Boot, JPA and MySQL to build this.

---

## How to Run

1. Create a database in MySQL:

CREATE DATABASE weatherrdb;

2. Update your MySQL username and password in:

src/main/resources/application.properties

3. Run the project using:

mvn spring-boot:run

or run WeatherprojectApplication.java from IDE.

4. Open browser:

http://localhost:8080

Now you can upload a file and it will be stored in the database.

---

## API

POST /upload  
Used to upload file using multipart/form-data.

---

## Tech Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
