##  3.5.3 支持 Remote Region(Page52)

### 1. Eureka Server 实例(Page55)
ch3-3-eureka-server目录下，profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=zone1
mvn spring-boot:run -Dspring.profiles.active=zone2
mvn spring-boot:run -Dspring.profiles.active=zone3-region-west
mvn spring-boot:run -Dspring.profiles.active=zone4-region-west
```

### 2. Eureka Client 实例(Page56)
ch3-3-eureka-client目录下，profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=zone1
mvn spring-boot:run -Dspring.profiles.active=zone2
mvn spring-boot:run -Dspring.profiles.active=zone3
mvn spring-boot:run -Dspring.profiles.active=zone4
```

### 3. Zuul GateWay 实例(Page57)
ch3-3-zuul-gateway目录下，profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=zone1
mvn spring-boot:run -Dspring.profiles.active=zone2
```

访问：
```
curl -i http://localhost:10001/demo-client/actuator/env
curl -i http://localhost:10002/demo-client/actuator/env
```