package de.javahippie.springcloud.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuthServiceExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceExampleApplication.class, args);
    }
}
