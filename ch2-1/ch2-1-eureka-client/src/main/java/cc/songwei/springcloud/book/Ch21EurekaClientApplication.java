package cc.songwei.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Ch21EurekaClientApplication {

    /**
     *
     */
    protected Ch21EurekaClientApplication() {

    }
    /**
     *
     * @param args String Parameter
     */
    public static void main(final String[] args) {
        SpringApplication.run(Ch21EurekaClientApplication.class, args);
    }
}
