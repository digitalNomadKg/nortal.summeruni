package com.nortal.summeruni.cars.service;

import com.nortal.summeruni.cars.entity.Car;
import com.nortal.summeruni.cars.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor

public class CarService {
    private final CarRepository carRepository;

    public List<Car> getCars() {
        return carRepository.findAll();
    }
}
