package com.zhang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhang.pojo.Owner;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OwnerService extends IService<Owner> {
    List<Owner> getAllOwners();

    Owner getOwnerById(Long id);

    void saveOwner(Owner owner);

    void updateOwner(Owner owner);

    void deleteOwner(Long id);

    List<Owner> getAllOwnerWithCars();

    Owner getOwnerWithCarsById(Long id);
}
