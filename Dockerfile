FROM eclipse-temurin:21

WORKDIR /engine

COPY . .

CMD ["java", "-jar", "distributed-sync-engine.jar"]