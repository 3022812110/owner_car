package com.zhang;

import com.zhang.mapper.OwnerCarMapper;
import com.zhang.pojo.OwnerCar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class OwnerCarTest {
    @Autowired
    private OwnerCarMapper ownerCarMapper;

    //Find by ID
    @Test
    void selectById(){
        OwnerCar ownerCar = ownerCarMapper.selectById(1);
        System.out.println(ownerCar);
    }

    //find all
    @Test
    void selectAll(){
        List<OwnerCar> ownerCars = ownerCarMapper.selectList(null);
        for (OwnerCar ownerCar:ownerCars
             ) {
            System.out.println(ownerCar);
        }
    }

    //Revise
    @Test
    void updateById(){
        OwnerCar ownerCar = ownerCarMapper.selectById(1);
        ownerCar.setOwnerId(1);
        ownerCar.setCarId(5);
        ownerCarMapper.updateById(ownerCar);
        System.out.println(ownerCar);

    }

    //Increase
    @Test
    void Insert(){
        OwnerCar ownerCar = new OwnerCar();
        ownerCar.setOwnerId(5);
        ownerCar.setCarId(1);
        ownerCarMapper.insert(ownerCar);
        System.out.println(ownerCar);
    }

    //delete
    @Test
    void deleted(){
        ownerCarMapper.deleteById(14);
        OwnerCar ownerCar = ownerCarMapper.selectById(14);
        System.out.println(ownerCar);
    }
}
