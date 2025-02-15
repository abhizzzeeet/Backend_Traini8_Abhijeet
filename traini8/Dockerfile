# Use an official OpenJDK 17 image
FROM eclipse-temurin:17-jdk

# Set the working directory
WORKDIR /app

# Copy Maven wrapper & pom.xml for dependency resolution
COPY mvnw pom.xml ./
COPY .mvn .mvn

# Grant execution permissions to Maven wrapper
RUN chmod +x mvnw

# Download dependencies (this helps with caching layers)
RUN ./mvnw dependency:go-offline

# Copy the project files
COPY src ./src

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose the port your app runs on (Spring Boot default is 8080)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/traini8-0.0.1-SNAPSHOT.jar"]
