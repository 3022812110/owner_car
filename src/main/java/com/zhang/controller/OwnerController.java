package com.zhang.controller;

import com.zhang.pojo.Owner;
import com.zhang.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {
    @Autowired
    private OwnerService ownerService;

    //Find all owners/Найти всех владельцев
    @GetMapping("/")
    public List<Owner> getAllOwners() {
        return ownerService.getAllOwners();
    }

    //Find car owner by ID/Найти владельца автомобиля по ID
    @GetMapping("/{id}")
    public Owner getOwnerById(@PathVariable Long id) {
        return ownerService.getOwnerById(id);
    }

    //Increase/Увеличивать
    @PostMapping("/")
    public void addOwner(@RequestBody Owner owner) {
        ownerService.saveOwner(owner);
    }

    //Revise/Исправлять
    @PutMapping("/{id}")
    public void updateOwner(@PathVariable Long id, @RequestBody Owner owner) {
        owner.setId(id);
        ownerService.updateOwner(owner);
    }

    //Delete/удалить
    @DeleteMapping("/{id}")
    public void deleteOwner(@PathVariable Long id) {
        ownerService.deleteOwner(id);
    }

    //Find all car owners with cars/Найти всех автовладельцев с автомобилями
    @GetMapping("/withCars")
    public List<Owner> getAllOwnerWithCars() {
        return ownerService.getAllOwnerWithCars();
    }

    //Find car owner and car based on ID/Найти владельца автомобиля и автомобиль по ID
    @GetMapping("/withCars/{id}")
    public Owner getOwnerWithCarsById(@PathVariable Long id) {
        return ownerService.getOwnerWithCarsById(id);
    }


}
