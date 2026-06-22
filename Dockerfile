FROM ubuntu:latest
LABEL authors='devse'


#base iamge
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

#JAR file that will be copied
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar app.jar
#Access through port number 8080
EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]