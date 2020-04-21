package com.nortal.summeruni.cars.controller;

import com.nortal.summeruni.cars.entity.Car;
import com.nortal.summeruni.cars.service.CarService;
import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> master

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor

public class CarController {
    private final CarService carService;


    @GetMapping
    public List<Car> getCars() {
        return carService.getCars();
    }

<<<<<<< HEAD
=======
    @GetMapping("/{id}")
    public Car getCar(@PathVariable Long id) {
        return carService.getCar(id);
    }
>>>>>>> master
}
