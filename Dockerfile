FROM amazoncorretto:8-alpine-jdk
MAINTAINER Gabee
COPY target/gab-0.0.1-SNAPSHOT.jar  gabee-ap.jar
ENTRYPOINT ["java","-jar","/gabee-ap.jar"]
