FROM openjdk:8-jre
WORKDIR /
COPY ./target/minisocial-0.0.1.jar minisocial.jar
ENTRYPOINT  ["java", "-jar", "minisocial.jar"]