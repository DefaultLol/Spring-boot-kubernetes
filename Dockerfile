FROM openjdk:8
EXPOSE 8080
ADD target/kuber-postgres.jar kuber-postgres.jar
ENTRYPOINT ["java","-jar","kuber-postgres.jar"]