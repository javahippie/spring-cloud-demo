package de.javahippie.springcloud.authserviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServiceExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceExampleApplication.class, args);
    }
}