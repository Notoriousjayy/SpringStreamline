# Use an official OpenJDK image as the base image
FROM openjdk:17-jdk-slim AS builder

# Set a working directory in the container
WORKDIR /app

# Copy Maven wrapper and related files
COPY mvnw .
COPY .mvn .mvn

# Ensure the Maven wrapper script is executable
RUN chmod +x mvnw

# Copy the application source code
COPY src src
COPY pom.xml .

# Run Maven to build the application
RUN ./mvnw clean package -DskipTests

# Use a smaller image for the runtime
FROM openjdk:17-jdk-slim

# Set a working directory in the container
WORKDIR /app

# Copy the built JAR file from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose the port on which the application will run
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
