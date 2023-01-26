FROM java:19.0.1

EXPOSE 8080

ADD target/spring-docker-demo.jar spring-docker-demo

ENTRYPOINT ["java","-jar","spring-docker-demo.jar"]