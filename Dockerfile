FROM maven:3.8.6-openjdk-18 AS MAVEN_BUILD
COPY ./ ./
RUN mvn clean package

FROM openjdk:17-alpine
COPY target/hw1-0.0.1-SNAPSHOT.jar /hw1-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/hw1-0.0.1-SNAPSHOT.jar"]