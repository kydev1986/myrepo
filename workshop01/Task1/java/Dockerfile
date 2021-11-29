FROM openjdk:17.0.1-jdk-oraclelinux7

MAINTAINER Chua Koon Yuan

EXPOSE 5000

ENV INSTANCE_NAME=java-dov-bear
ENV INSTANCE_HASH=123456
ENV PORT=5000

WORKDIR /usr/local/bin/

COPY ./target/dovbear-0.0.1-SNAPSHOT.jar webapp.jar

CMD ["java","-jar","webapp.jar"]