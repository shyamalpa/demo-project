# Build stage
FROM maven:3.8.4-openjdk-11-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Run stage
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/hello-world-0.0.1-SNAPSHOT.jar app.jar

# Create a non-root user
RUN addgroup --system javauser && adduser --system --no-create-home --ingroup javauser javauser
USER javauser

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"] 