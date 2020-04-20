package com.nortal.summeruni.cars.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private String model;
    private String countryOfOrigin;
    private int maxSpeed;
}
