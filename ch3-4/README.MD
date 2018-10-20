##  3.5.4 开启 HTTP Basic 认证(Page58)

### 1. Eureka Server 配置(Page59)
ch3-4-eureka-server 目录下，使用 security 的 profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=security
```
访问：
```
curl -i http://localhost:8761/eureka/apps
```
没有传递 Authorization 的 header,返回 401
传递 Authorization 的 header：
```
curl -i --basic -u admin:Xk38CNHigBP5jK75 http://localhost:8761/eureka/apps
```
### 2. Eureka Client 配置(Page60)
ch3-4-eureka-client 目录下，使用 security 的 profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=security
```
命令查看：
```
curl -i --basic -u admin:Xk38CNHigBP5jK75 http://localhost:8761/eureka/apps
```