## Feign结合服务注册发现案例

## 测试

### 1. Eureka Server 配置
ch4-2-eureka-server 目录下，使用 default 的 profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=default
```
访问：
```
curl -i http://localhost:8761/eureka/apps
```
或者:
```
http://localhost:8761/
```

### 1. Eureka Consumer 配置
ch4-2-Consumer 目录下，使用 default 的 profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=default
```
访问：
```
curl -i http://localhost:8761/eureka/apps
```
或者:
```
http://localhost:8761/
```