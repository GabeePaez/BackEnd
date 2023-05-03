FROM amazoncorretto:11-alpine-jdk
MAINTAINER Gabee
COPY target/gab-0.0.1-SNAPSHOT.jar  gab-app.jar
ENTRYPOINT ["java","-jar","/gab-app.jar"]
