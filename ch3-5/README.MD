##  3.5.5 启用 https(Page61)

### 1. 证书生成(Page61)
ch3-5-eureka-server目录下,生成 server.p12 证书,密码 Spring Clound :
```
keytool -genkeypair -alias server -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore server.p12 -validity 3650
```
ch3-5-eureka-server目录下,生成 client.p12 证书,密码 Client :
```
keytool -genkeypair -alias client -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore client.p12 -validity 3650
```
导出两个 p12 的证书 :
```
keytool -export -alias server -file server.crt --keystore server.p12
```
```
keytool -export -alias client -file client.crt --keystore client.p12
```
将 server.crt 导入 client.p12 中，使 Client 端信任 Server 的证书 :
```
keytool -import -alias server -file server.crt --keystore client.p12
```
将 client.crt 导入 server.p12 中，使 Server 端信任 Client 的证书 :
```
keytool -import -alias client -file client.crt --keystore server.p12
```
### 2. Eureka Server 配置(Page64)
ch3-5-eureka-server目录下，使用 https 的 profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=https
```

### 3. Eureka Client 配置(Page65)
移动 ch3-5-eureka-server 目录下的 resources 目录下的 client.p12 到 ch3-5-eureka-client 目录下的 resources 目录
ch3-3-eureka-client目录下，使用 https 的 profile 启动
```
mvn spring-boot:run -Dspring.profiles.active=https
```