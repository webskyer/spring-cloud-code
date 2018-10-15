##  3.5.1 Eureka Server在线扩容(Page42)

### 1个 Eureka Server(Page43)
ch3-1-config-server目录下，profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=native
```
ch3-1-eureka-server目录下，profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=peer1
```
ch3-1-eureka-client目录下，profile 启动
```
mvn spring-boot:run
```

### 2个 Eureka Server(Page43)
ch3-1-eureka-server目录下，profile 启动第二个Eureka Server
```
mvn spring-boot:run -Dspring.profiles.active=peer2
```
启动后，修改 eureka-client.yml,eureka-server-peer1.yml,
重启 config-server,刷新 eureka-client 和 Eureka Server 的 peer1 加载新配置
```
curl -i -X POST localhost:8761/actuator/refresh
curl -i -X POST localhost:8081/actuator/refresh
```
分别调用 queryController 的方法：
```
curl -i localhost:8761/query/eureka-server
curl -i localhost:8081/query/eureka-server
```

### 3个 Eureka Server(Page43)
ch3-1-eureka-server目录下，profile 启动第三个Eureka Server
```
mvn spring-boot:run -Dspring.profiles.active=peer3
```
启动后，修改 eureka-client.yml,eureka-server-peer1.yml,eureka-server-peer2.yml,
重启 config-server,刷新 eureka-client、Eureka Server 的 peer1 和 peer2 加载新配置
```
curl -i -X POST localhost:8761/actuator/refresh
curl -i -X POST localhost:8762/actuator/refresh
curl -i -X POST localhost:8081/actuator/refresh
```
分别调用 queryController 的方法：
```
curl -i localhost:8761/query/eureka-server
curl -i localhost:8763/query/eureka-server
curl -i localhost:8081/query/eureka-server
```