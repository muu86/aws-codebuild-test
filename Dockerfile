FROM amazoncorretto:17

ARG JAR_FILE=build/libs/*SNAPSHOT.jar

EXPOSE 8181

COPY ${JAR_FILE} app.jar

ENTRYPOINT [ "java", "-jar", "/app.jar"]

