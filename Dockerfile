FROM openjdk:15-jdk-alpine

COPY ./build/libs/myweb-0.0.2.jar app.jar

EXPOSE 5432

ENTRYPOINT ["java","-jar","/app.jar"]