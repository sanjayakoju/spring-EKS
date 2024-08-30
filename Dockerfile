# Building jaf from maven
#FROM maven:3.8.4-openjdk-17 AS builder
#WORKDIR /app
#COPY pom.xml .
#RUN mvn dependency:go-offline
#COPY src src
#RUN mvn package

# Creating image from builder
#FROM openjdk:17
#WORKDIR /app
#COPY --from=builder /app/target/Spring-EKS.jar .
#CMD ["java", "-jar", "Spring-EKS.jar"]

# If the jar is build then this work
FROM --platform=linux/amd64 openjdk:17
ADD target/springboot-eks.jar springboot-eks.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springboot-eks.jar"]

