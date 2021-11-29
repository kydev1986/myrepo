FROM openjdk:11

MAINTAINER Chua Koon Yuan

EXPOSE 8080

WORKDIR /usr/local/bin/

COPY ./target/coursedemo-0.0.1-SNAPSHOT.jar webapp.jar

CMD ["java","-jar","webapp.jar"]