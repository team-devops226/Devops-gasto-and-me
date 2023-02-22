# Build Stage
FROM maven:3.6.3-jdk-11-openj9 AS build
COPY pom.xml /app/
COPY src /app/src
RUN mvn -DskipTests -f /app/pom.xml clean package

# Run Stage
FROM adoptopenjdk/openjdk11:alpine-jre
COPY --from=build /app/target/gastro-and-me-back*.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
