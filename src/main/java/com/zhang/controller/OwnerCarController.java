package com.zhang.controller;

import com.zhang.pojo.OwnerCar;
import com.zhang.service.OwnerCarService;
import com.zhang.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ownerandcar")
public class OwnerCarController {
    @Autowired
    private OwnerCarService ownerCarService;

    //Find information about all cars and owners
    @GetMapping("/")
    public List<OwnerCar> getAllOwnerCars(){
       return ownerCarService.list();
    }

    //Find car and owner by ID
    @GetMapping("/{id}")
    public OwnerCar getOwnerCars(@PathVariable int id){
        return ownerCarService.getById(id);
    }

    //Increase
    @PostMapping("/")
    public void addOwnerCars(@RequestBody OwnerCar ownerCar){
         ownerCarService.save(ownerCar);
    }

    //Revise
    @PutMapping("/{id}")
    public void updateOwnerCars(@PathVariable int id, @RequestBody OwnerCar ownerCar){
        ownerCar.setId(id);
        ownerCarService.updateById(ownerCar);
    }

    //Delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        ownerCarService.removeById(id);
    }


}
