package com.zhang.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhang.mapper.OwnerCarMapper;
import com.zhang.pojo.OwnerCar;
import com.zhang.service.OwnerCarService;
import org.springframework.stereotype.Service;

@Service
public class OwnerCarServiceImpl  extends ServiceImpl<OwnerCarMapper, OwnerCar> implements OwnerCarService {
}
