package com.yang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.mapper.BikeMapper;
import com.yang.pojo.Bike;
import com.yang.service.BikeService;
import com.yang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Yang
 * @Date 2024/3/18 9:40
 */
@Service
public class BikeServiceImpl extends ServiceImpl<BikeMapper, Bike> implements BikeService {

    @Autowired
    private BikeService bikeService;

    @Override
    public Result addBikes(List<Bike> bikeList) {

        boolean b = saveBatch(bikeList);
        if (!b) {
            return Result.fail();
        }
        return Result.ok();
    }
}
