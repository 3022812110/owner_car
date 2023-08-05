package com.zhang;

import com.zhang.mapper.CarMapper;
import com.zhang.mapper.OwnerMapper;
import com.zhang.pojo.Owner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import java.util.List;

@SpringBootTest

class OwnerTest {
    @Autowired
    private OwnerMapper ownerMapper;
    @Autowired
    private CarMapper carMapper;

    @Test
    void contextLoads() {
    }

    //find all
    @Test
    void selectAll(){
        List<Owner> owners = ownerMapper.selectAll();
        for (Owner owner :owners){
            System.out.println(owner);
        }
    }

    //Find by ID
    @Test
    void selectById(){
        Long id =1l;
        Owner owner = ownerMapper.selectById(id);
        System.out.println(owner);
    }

    //Find all owners and cars
    @Test
     void SelectAllOwnerWithCars() {
        List<Owner> owners = ownerMapper.selectAllOwnerWithCars();
        for (Owner owner : owners) {
            System.out.println(owner);
        }
    }

    //Find owner and car by ID
    @Test
    void SelectOwnerWithCarsById(){
        Long id = 2l;
        Owner owner = ownerMapper.selectOwnerWithCarsById(id);
            System.out.println(owner);

    }

    //Increase
    @Test
    void insert(){
        Owner owner = new Owner();
        owner.setLastName("Shy");
        owner.setFirstName("Shy");
        owner.setBirthDate(new Date());
        ownerMapper.insert(owner);
        System.out.println(owner);
    }

    //delete
    @Test
    void deleteById(){
        Long id =6l;
        ownerMapper.deleteById(id);
        Owner owner = ownerMapper.selectById(id);
        System.out.println(owner);
    }

    //Revise
    @Test
    void updateById(){
        Owner owner = ownerMapper.selectById(1l);
        owner.setFirstName("Joh");
        owner.setLastName("Joh");
        ownerMapper.update(owner);
        System.out.println(owner);
    }

















}
