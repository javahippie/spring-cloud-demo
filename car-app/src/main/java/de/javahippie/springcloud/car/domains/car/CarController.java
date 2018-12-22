package de.javahippie.springcloud.car.domains.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public ResponseEntity<List<Car>> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Car> getById(@PathVariable("id") Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
