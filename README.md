# Homework: Spring Boot REST API (Basic)

## Task Description
Your task is to create a RESTful web service for managing a To-Do List.  
You will use Spring Boot and Spring MVC annotations to handle HTTP requests.

For this assignment, we will **not use a database**. The data should be stored **in memory** (e.g., in a `List` or `Map` inside the service).

## Goals
- Understand the difference between `@Controller` and `@RestController`.
- Learn how to map HTTP methods (GET, POST, PUT, DELETE) to Java methods.
- Work with data passing using `@RequestBody` and `@PathVariable`.
- Understand HTTP status codes (200, 201, 404).

## Technical Requirements

### 1. Data Model (Task)
The `Task` class is already created. It has the following fields:
- `id` (Long)
- `title` (String)
- `completed` (boolean)

### 2. Service Layer (TaskService)
Implement the logic for storing tasks in `TaskService`.  
Use `ArrayList` or `HashMap` as storage.

Methods to implement:
- Get all tasks
- Get task by ID
- Create a new task
- Update an existing task
- Delete a task

### 3. Controller (TaskController)
Implement REST endpoints under `/tasks`:

| Method | URL           | Description                  | Success Status |
|--------|---------------|-----------------------------|----------------|
| GET    | /tasks        | Return all tasks             | 200 OK         |
| GET    | /tasks/{id}   | Return a task by ID          | 200 OK         |
| POST   | /tasks        | Create a new task (JSON body)| 201 Created    |
| PUT    | /tasks/{id}   | Update an existing task      | 200 OK         |
| DELETE | /tasks/{id}   | Delete a task                | 204 No Content (or 200) |

**Important:** If a task with the given ID is not found (for GET or PUT), return **404 Not Found**.

## Step-by-Step Instructions
1. **Dependencies:** The project is already configured with Spring Boot. No changes in `pom.xml` are required.
2. **Run the application:** Run the `TodoApplication` class. The server will start on port 8080.
3. **Development:**
    - Start with `TaskService`.
    - Move on to `TaskController`. Don’t forget the `@RestController` annotation.
4. **Manual check:** Use Postman or a browser.
    - Open `http://localhost:8080/tasks` → should return an empty list `[]`.
5. **Tests:** Run `mvn test` to verify correctness.
