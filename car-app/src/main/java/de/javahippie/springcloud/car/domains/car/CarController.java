package de.javahippie.springcloud.car.domains.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public ResponseEntity<List<Car>> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Car> getById(@PathVariable("id") String id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Car> save(@RequestBody Car car) {
        if(null == car.getId()) {
            car.setId(UUID.randomUUID().toString());
        }
        return ResponseEntity.ok(repository.save(car));
    }
}
