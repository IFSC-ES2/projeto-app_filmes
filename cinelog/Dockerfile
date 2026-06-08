# Build stage
FROM eclipse-temurin:25-jdk-jammy AS build
WORKDIR /app
COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew clean bootJar --no-daemon

# Runtime stage
FROM eclipse-temurin:25-jre-jammy
WORKDIR /app
COPY --from=build /app/build/libs/cinelog-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
