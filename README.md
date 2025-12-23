# Spring Boot Student API

This project is a simple Spring Boot REST API that demonstrates basic backend development practices, including RESTful endpoints, Docker containerization, and error handling.

## Features

- REST API for retrieving:
  - a list of students
  - a single student by ID
- Graceful handling of invalid or non-existent student IDs with a user-friendly error response
- Dockerized application setup for easy run and testing
- API available on port `8080` and testable via browser or Postman

## API Endpoints

- `GET /students`  
  Returns a list of all students.

- `GET /students/{studentId}`  
  Returns a student by ID.  
  If an invalid or non-existent ID is provided, a meaningful error message is returned.

## Running the Application with Docker

1. Build the Docker image:
   ```bash
   docker build -t student-api .
   ```
   
2. Build the container:
   ```bash
   docker run -p 8080:8080 student-api
   ```

3. Access the API
   
   http://localhost:8080/students
   
   http://localhost:8080/students/{studentId}


Technologies Used
Java
Spring Boot
REST API
Docker
