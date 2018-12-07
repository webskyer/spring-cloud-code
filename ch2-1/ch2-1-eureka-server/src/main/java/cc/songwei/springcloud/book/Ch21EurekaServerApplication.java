package cc.songwei.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Ch21EurekaServerApplication {

    /**
     *
     */
    protected Ch21EurekaServerApplication() {

    }

    /**
     *
     * @param args String
     */
    public static void main(final String[] args) {
        SpringApplication.run(Ch21EurekaServerApplication.class, args);
    }
}
