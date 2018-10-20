##  3.5.2 构建 Multi Zone Eureka Server(Page47)

### 1. Eureka Server 实例(Page50)
ch3-2-eureka-server 目录下，profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=zone1a
mvn spring-boot:run -Dspring.profiles.active=zone1b
mvn spring-boot:run -Dspring.profiles.active=zone2a
mvn spring-boot:run -Dspring.profiles.active=zone2b
```

### 2. Eureka Client 实例(Page51)
ch3-2-eureka-client 目录下，profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=zone1
mvn spring-boot:run -Dspring.profiles.active=zone2
```

### 3. Zuul GateWay 实例(Page51)
ch3-2-zuul-gateway 目录下，profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=zone1
mvn spring-boot:run -Dspring.profiles.active=zone2
```

### 4. 验证 ZoneAffinity(Page52)
```
localhost:10001/demo-client/actuator/env
localhost:10002/demo-client/actuator/env
```