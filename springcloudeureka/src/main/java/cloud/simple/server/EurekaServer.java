package cloud.simple.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2017/5/16.
 */
@SpringBootApplication
@EnableEurekaServer
/*@EnableEurekaServer注解就可以让应用变为Eureka服务器*/
public class EurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
    }
}
