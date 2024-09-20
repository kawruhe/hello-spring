# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the host machine to the container
COPY target/hello-0.0.1-SNAPSHOT.jar /app/hello.jar

# Expose the port that the application will run on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "hello.jar"]