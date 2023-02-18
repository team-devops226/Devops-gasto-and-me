# Dockerfile for the back-end
FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
MAINTAINER Mamadou devopsteam226@gmail.com
ARG JAR_FILE=target/gastro-and-me-back-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]