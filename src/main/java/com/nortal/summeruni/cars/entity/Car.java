package com.nortal.summeruni.cars.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    private Long id;
    private String brand;
    private String model;
    private String countryOfOrigin;
    private int maxSpeed;
}
