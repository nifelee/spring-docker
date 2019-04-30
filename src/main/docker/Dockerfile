FROM openjdk:8-jdk-alpine
ARG BUILD_VERSION

ENV DB_HOST localhost
ENV DB_PORT 3306

ADD spring-docker-${BUILD_VERSION}.jar app.jar

EXPOSE 19900

ENTRYPOINT exec java -jar /app.jar