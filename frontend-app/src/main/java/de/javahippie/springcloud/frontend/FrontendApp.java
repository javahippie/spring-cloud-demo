package de.javahippie.springcloud.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FrontendApp {

    public static void main(String[] args) {
        SpringApplication.run(FrontendApp.class, args);
    }
}
