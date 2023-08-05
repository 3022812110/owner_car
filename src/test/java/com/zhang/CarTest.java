package com.zhang;

import com.zhang.mapper.CarMapper;
import com.zhang.pojo.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
public class CarTest {
    @Autowired
    private CarMapper carMapper;

    //Find all
    @Test
    void selectAll(){
        List<Car> cars = carMapper.selectList(null);
        for (Car car:cars
             ) {
            System.out.println(car);
        }
    }

    //Find by ID
    @Test
    void selectById(){
        Car car = carMapper.selectById(1);
        System.out.println(car);
    }

    //Increase
    @Test
    void insert(){
        Car car = new Car();
        car.setBrand("BYD");
        car.setModel("B");
        car.setYear(2023);
        car.setNumber("C0001");
        carMapper.insert(car);
        System.out.println(car);
    }
    //Revise
    @Test
    void updateById(){
        Car car = carMapper.selectById(6);
        car.setBrand("BYD");
        car.setModel("M");
        car.setYear(2023);
        car.setNumber("C0001");
        carMapper.updateById(car);
        System.out.println(car);
    }

    //delete
    @Test
    void deleteById(){
        carMapper.deleteById(7);
        Car car = carMapper.selectById(7);
        System.out.println(car);

    }





}
