FROM openjdk:15-jdk-alpine

COPY ./build/libs/myweb-1.0.1.jar app.jar

EXPOSE 5432

ENTRYPOINT ["java","-jar","/app.jar"]