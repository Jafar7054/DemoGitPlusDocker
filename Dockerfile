#Step 1: Use a lightweight JDK image
FROM openjdk:17-jdk-slim

#Step 2: Set working directory
WORKDIR /app

#Step 3: Copy project jar file into the container
COPY target/dockerPlusGit-0.0.1-SNAPSHOT.jar app.jar

#Step 4: Run the app
ENTRYPOINT [ "jave", "-jar", "app.jar" ]
