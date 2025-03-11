# Spring Boot Button Application

A simple Spring Boot application with a clean user interface featuring multiple interactive buttons.

## Features

- Responsive web interface with modern styling
- Four different button styles with hover and click animations
- Server-side button action processing
- Message display area for feedback
- WAR file packaging for deployment to external servlet containers

## Requirements

- Java 17 or higher
- Maven 3.6.3 or higher

## Building the Application

To build the application and generate the WAR file:

```bash
mvn clean package
```

This will create a `button-app.war` file in the `target` directory.

## Running the Application

### Option 1: Using Spring Boot Maven Plugin

```bash
mvn spring-boot:run
```

### Option 2: Running the WAR file directly

```bash
java -jar target/button-app.war
```

### Option 3: Deploying to an External Server

Copy the `button-app.war` file from the `target` directory to your servlet container's deployment directory (e.g., Tomcat's `webapps` folder).

## Accessing the Application

Once running, access the application at:

```
http://localhost:8080/
```

## Project Structure

- `src/main/java/com/example/buttonapp/` - Java source files
  - `ButtonAppApplication.java` - Spring Boot application entry point
  - `controller/HomeController.java` - Controller for handling HTTP requests
- `src/main/resources/` - Application resources
  - `application.properties` - Application configuration
  - `static/` - Static resources (CSS, JavaScript)
  - `templates/` - Thymeleaf templates
- `src/main/webapp/` - Web application configuration
- `src/test/` - Test files

## Customization

You can easily customize this application by:

1. Modifying the CSS in `src/main/resources/static/css/style.css`
2. Adding more buttons or functionality in `src/main/resources/templates/index.html`
3. Extending the controller logic in `src/main/java/com/example/buttonapp/controller/HomeController.java`

## License

This project is available under the MIT License.
