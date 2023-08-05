package com.zhang.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhang.mapper.OwnerMapper;
import com.zhang.pojo.Owner;
import com.zhang.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl extends ServiceImpl<OwnerMapper, Owner>implements OwnerService {

    @Autowired
    private OwnerMapper ownerMapper;

    public List<Owner> getAllOwners() {
        return ownerMapper.selectAll();
    }

    public Owner getOwnerById(Long id) {
        return ownerMapper.selectById(id);
    }

    public void saveOwner(Owner owner) {
        ownerMapper.insert(owner);
    }

    public void updateOwner(Owner owner) {
        ownerMapper.update(owner);
    }

    public void deleteOwner(Long id) {
        ownerMapper.deleteById(id);
    }

    public List<Owner> getAllOwnerWithCars() {
        return ownerMapper.selectAllOwnerWithCars();
    }

    public Owner getOwnerWithCarsById(Long id) {
        return ownerMapper.selectOwnerWithCarsById(id);
    }
}
