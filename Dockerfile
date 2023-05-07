FROM amazoncorretto:8-alpine-jdk
MAINTAINER GABEE
COPY target/gab-0.0.1-SNAPSHOT.jar gabee-app.jar
ENTRYPOINT ["java","-jar","/gabee-app.jar"]
