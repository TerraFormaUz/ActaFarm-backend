# ActaFarm Backend

Welcome to the ActaFarm backend repository! This repository contains the backend codebase for ActaFarm, the online community platform for farmers.

## Technologies Used

- **Java**: The backend is written in Java, a powerful and versatile programming language widely used for enterprise applications.
- **Spring Boot**: Spring Boot is used to create stand-alone, production-grade Spring-based applications with minimal setup, making it ideal for building robust backend services.
- **Spring Data JPA**: Spring Data JPA is used for data access, providing an easy and efficient way to interact with the database.
- **Spring Security**: Spring Security is used to handle authentication and authorization, ensuring secure access to ActaFarm's features.
- **MySQL**: ActaFarm backend utilizes MySQL as the database management system to store and manage data efficiently.

## Getting Started

To set up and run the ActaFarm backend on your local machine, follow these steps:

1. **Clone the Repository**: Clone the ActaFarm backend repository to your local machine.
    ```
    git clone https://github.com/TerraFormaUz/ActaFarm-backend.git
    ```

2. **Database Configuration**: Configure your MySQL database settings in the `application.properties` file. Ensure you have MySQL installed and running on your system.

3. **Build and Run**: Build and run the application using your preferred IDE or by running the following command:
    ```
    ./mvnw spring-boot:run
    ```

4. **Explore API Documentation**: Explore the API documentation to understand the available endpoints and how to interact with them. The documentation is usually available at `http://localhost:8080/swagger-ui.html`.

## Contributing

We welcome contributions from the community to improve ActaFarm's backend functionality. If you're interested in contributing, please refer to the CONTRIBUTING.md file for guidelines on how to contribute.

## License

ActaFarm Backend is licensed under the [MIT License](LICENSE), allowing for the free use, modification, and distribution of the codebase.
