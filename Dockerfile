# Use an official OpenJDK image as the base image
FROM openjdk:17-jdk-slim

# Set a working directory in the container
WORKDIR /app

# Copy the Maven build file (pom.xml) and Maven wrapper files
COPY mvnw .
COPY .mvn .mvn

# Copy the source code into the container
COPY src src

# Copy the Maven project file
COPY pom.xml .

# Run Maven to build the application
RUN ./mvnw clean package -DskipTests

# Copy the built JAR file into the container
COPY target/*.jar app.jar

# Expose the port on which the application will run
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
