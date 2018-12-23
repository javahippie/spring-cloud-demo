package de.javahippie.springcloud.frontend.domains.car;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
@FeignClient(name = "car-app")
public interface CarClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/car", consumes = "application/json")
    List<Car> getAllCars();
}