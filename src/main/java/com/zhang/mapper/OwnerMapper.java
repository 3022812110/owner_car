package com.zhang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhang.pojo.Owner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OwnerMapper  extends BaseMapper<Owner>{

    List<Owner> selectAllOwnerWithCars();

    Owner selectOwnerWithCarsById(Long id);

    Owner selectById(Long id);

    List<Owner> selectAll();

    @Override
    int insert(Owner owner);

    void update(Owner owner);

    void deleteById(Long id);

}
