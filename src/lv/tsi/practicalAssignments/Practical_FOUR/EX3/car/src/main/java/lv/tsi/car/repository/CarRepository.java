package lv.tsi.car.repository;

import lv.tsi.car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CarRepository extends JpaRepository<Car, Long> { }
