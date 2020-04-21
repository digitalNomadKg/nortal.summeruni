package com.nortal.summeruni.cars.controller;

import com.nortal.summeruni.cars.entity.Car;
import com.nortal.summeruni.cars.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")

public class CarController {
    private final CarService carService;

    @GetMapping
    public List<Car> getCars() {
        return new ArrayList<Car>();
    }

    @PostMapping
    public Long addCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

}
