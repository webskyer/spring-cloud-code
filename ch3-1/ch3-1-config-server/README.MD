## API Resources
|  Path                               |  Description                                                        |
| ----------------------------------- | ------------------------------------------------------------------- |
|  /{app}/{profile}                   |  Configuration data for app in Spring profile (comma-separated).    |
|  /{app}/{profile}/{label}           |  Add a git label                                                    |
|  /{app}/{profiels}{label}/{path}    |  An environment-specific plain text cc.songwei.springcloud.book.config file (at "path")         |

## 实例
```
curl -i localhost:8888/eureka-client1/default
curl -i localhost:8888/eureka-server1/default
```

## Page45 加载新配置
```
curl -i -X POST localhost:8761/actuator/refresh
curl -i -X POST  localhost:8081/actuator/refresh
```

## Page45 调用queryController方法
```
curl -i localhost:8761/query/eureka-server
curl -i localhost:8081/query/eureka-server
```

## Page47 加载新配置
```
curl -i -X POST localhost:8761/actuator/refresh
curl -i -X POST localhost:8762/actuator/refresh
curl -i -X POST localhost:8763/actuator/refresh
curl -i -X POST  localhost:8081/actuator/refresh
```

## Page47 调用queryController方法
```
curl -i localhost:8761/query/eureka-server
curl -i localhost:8762/query/eureka-server
curl -i localhost:8763/query/eureka-server
curl -i localhost:8081/query/eureka-server
```