FROM openjdk:8-jdk-alpine

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} gateway-0.0.1-SNAPSHOT.jar

EXPOSE 80 50050-50060

ENTRYPOINT ["java","-jar","/gateway-0.0.1-SNAPSHOT.jar"]