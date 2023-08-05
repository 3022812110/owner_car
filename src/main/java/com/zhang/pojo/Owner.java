package com.zhang.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Owner {
    private Long id; // 唯一ID
    private String lastName; // 姓氏
    private String firstName; // 名字
    private Date birthDate; // 出生日期
    private List<Car> cars; // 拥有的车辆的唯一ID列表

}