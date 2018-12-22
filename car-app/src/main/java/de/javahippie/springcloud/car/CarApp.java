package de.javahippie.springcloud.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CarApp {

    public static void main(String[] args) {
        SpringApplication.run(CarApp.class, args);
    }
}
