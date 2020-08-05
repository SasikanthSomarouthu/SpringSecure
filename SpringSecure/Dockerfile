FROM openjdk:8-jdk-alpine

# install bash --> commented because I just need /bin/sh which is already provided by the base image
#RUN apk add --no-cache bash
RUN /bin/sh -c "./mvnw clean install"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]