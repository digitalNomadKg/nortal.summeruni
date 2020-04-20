package com.nortal.summeruni.cars.repository;

import com.nortal.summeruni.cars.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car,Long>{
        }
