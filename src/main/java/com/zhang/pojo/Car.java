package com.zhang.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    private int id; // 唯一ID
    private String number; // 车牌号
    private int year; // 制造年份
    private String brand; // 品牌
    private String model; // 型号

}