# Java CRUD API with Swagger Documentation

This repository contains a Java-based CRUD (Create, Read, Update, Delete) API integrated with Swagger for interactive API documentation. The project is designed to demonstrate a simple RESTful web service using Spring Boot, JPA (Java Persistence API), and Swagger UI.

## Project Overview

- Full CRUD functionality for managing entities.
- RESTful endpoints for handling API requests.
- Database integration using JPA.
- API documentation generated with Swagger.

## Technologies Used

- **Java**: Core language used for development.
- **Spring Boot**: Framework used for building the REST API.
- **JPA (Hibernate)**: ORM tool for database interaction.
- **Swagger**: Used for generating interactive API documentation.
- **H2 Database**: In-memory database used for development and testing.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven

### Running the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repository.git
   ```
2. Navigate to the project directory:
   ```bash
   cd your-repository
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

The application will start running at `http://localhost:8080`.

## Swagger Documentation

Once the application is running, you can access the Swagger UI at:
```
http://localhost:8080/swagger-ui/index.html
```
Swagger provides an interactive way to explore and test the API endpoints.

## API Endpoints

| Method | Endpoint        | Description                   |
|--------|-----------------|--------------------------------|
| GET    | /api/entities   | Retrieve all entities          |
| POST   | /api/entities   | Create a new entity            |
| GET    | /api/entities/{id} | Retrieve a single entity by ID |
| PUT    | /api/entities/{id} | Update an existing entity by ID |
| DELETE | /api/entities/{id} | Delete an entity by ID         |

## Database Configuration

The project uses an in-memory H2 database by default. You can access the H2 console at:
```
http://localhost:8080/h2-console
```
Default credentials:
- **URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: (leave it blank)

## Customizing Database Configuration

If you want to use a different database (e.g., MySQL, PostgreSQL), update the `application.properties` file located in the `src/main/resources` directory.

Example for MySQL:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
```

## How to Contribute

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Make your changes and commit them:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push to your branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Create a pull request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Contact

For any questions or issues, please contact:
- **Your Name**: [your.email@example.com]
- GitHub: [https://github.com/your-username]

---

Happy Coding!

