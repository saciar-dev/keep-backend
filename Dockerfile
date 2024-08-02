FROM openjdk:17-jdk-slim

COPY target/keepApp-0.0.1-SNAPSHOT.jar keep-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "keep-app.jar"]