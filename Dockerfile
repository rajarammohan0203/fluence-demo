FROM openjdk:8-jdk-alpine
COPY target/spring-boot-docker.jar /app/spring-boot-docker.jar
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "spring-boot-docker.jar"]
