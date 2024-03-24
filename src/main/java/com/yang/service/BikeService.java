package com.yang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.pojo.Bike;
import com.yang.util.Result;

import java.util.List;

/**
 * @Author Yang
 * @Date 2024/3/18 9:39
 */
public interface BikeService extends IService<Bike> {
    Result addBikes(List<Bike> bikeList);
}
