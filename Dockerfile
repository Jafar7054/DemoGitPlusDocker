#Step 1: Use a lightweight JDK image
FROM openjdk:17-jdk-slim

#Step 2: Set working directory
WORKDIR /app

#Step 3: Copy project jar file into the container
COPY target/* app.jar

#Step 4: Run the app
ENTRYPOINT [ "java", "-jar", "app.jar" ]
