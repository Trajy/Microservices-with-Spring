FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/api-gateway-0.0.1-SNAPSHOT.jar hr-api-gateway.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","/hr-api-gateway.jar"]
