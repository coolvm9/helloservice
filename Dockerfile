FROM openjdk:11
MAINTAINER Satya A
COPY build/libs/helloservice-0.0.1-SNAPSHOT.jar helloservice.jar
ENTRYPOINT ["java","-jar","/helloservice.jar"]