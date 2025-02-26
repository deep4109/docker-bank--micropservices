#start with a base image containing java runtime
FROM openjdk:17-jdk-slim

#info about who maintains the image
MAINTAINER bank-microservice-accounts

#add the application's jar to the container
COPY target/bank-microservice-accounts-0.0.1-SNAPSHOT.jar bank-microservice-accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","bank-microservice-accounts-0.0.1-SNAPSHOT.jar"]