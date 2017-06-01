package cloud.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Administrator on 2017/5/14.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServerApplication.class, "--server.port=8081");
    }
}
