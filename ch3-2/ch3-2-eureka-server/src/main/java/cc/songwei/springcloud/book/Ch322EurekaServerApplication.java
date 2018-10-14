package cc.songwei.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch322EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch322EurekaServerApplication.class, args);
    }
}