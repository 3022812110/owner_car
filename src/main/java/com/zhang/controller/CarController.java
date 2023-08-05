package com.zhang.controller;

import com.zhang.pojo.Car;
import com.zhang.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    //Find all cars
    @GetMapping("/")
    public List<Car> getAllCars(){
        return carService.list();
    }

    //Find a car by ID
    @GetMapping("/id")
    public Car getCarById(@PathVariable int id){
        return carService.getById(id);
    }

    //Increase
    @PostMapping("/")
    public void addCar(@RequestBody Car car){
        carService.save(car);
    }

    //Revise
    @PutMapping("/{id}")
    public void updateCar(@PathVariable int id,@RequestBody Car car){
        car.setId(id);
    }

    //Delete
    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable int id){
        carService.removeById(id);
    }

}
