# springboot-microservices

JAVA : 17
Spring boot : 3.0.4

eureka-discovery:
  + port 8761
  + dependencies: spring-cloud-starter-netflix-eureka-server
  + application.properties
  + @EnableEurekaServer in main class
  + localhost:8761
  
api-gateway:
  + port: 8989
  + dependecies:  - spring-cloud-starter-gateway
                  - spring-cloud-starter-netflix-eureka-client
                  - spring-boot-starter-actuator
  + application.properties: routes + eureka server
  + @EnableDscoveryClient in main class
  + check eureka dicovery (localhost:8761): an instance API-GATEWAY should be added
  
users-service: 
  + port: 9090
  + DB: h2: http://localhost:9090/h2
  + entity : Users
  + repository 
  + service
  + controller
  + swagger: http://localhost:9090/swagger-ui/index.html
  + check eureka dicovery (localhost:8761): an instance USERS-SERVICE should be added 
