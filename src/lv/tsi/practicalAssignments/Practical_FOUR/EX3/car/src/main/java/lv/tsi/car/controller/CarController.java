package lv.tsi.car.controller;

import lombok.RequiredArgsConstructor;
import lv.tsi.car.model.Car;
import lv.tsi.car.repository.CarRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController
{
    private final CarRepository carRpstry;

    @GetMapping("/getcars")
    public ResponseEntity<List<Car>> getAllCars()
    {
        return ResponseEntity.ok(carRpstry.findAll());
    }

    @GetMapping("/getcar/{id}")
    public ResponseEntity<Car> getOneCarById(@PathVariable Long id)
    {
        return carRpstry.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping("/car")
    public ResponseEntity<Car> addCar(@RequestBody Car car)
    {
        var saveCar = carRpstry.save(car);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveCar);
    }

}
