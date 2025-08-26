FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu

RUN adduser --system demo

USER demo

WORKDIR /apps

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
