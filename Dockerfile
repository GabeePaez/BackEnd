FROM amazoncorretto:8
MAINTAINER Gabee
COPY target/gab-0.0.1-SNAPSHOT.jar  gab-app.ja
ENTRYPOINT ["java","-jar","/gab-app.jar"]
