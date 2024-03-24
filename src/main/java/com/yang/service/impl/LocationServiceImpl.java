package com.yang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.mapper.LocationMapper;
import com.yang.pojo.Location;
import com.yang.service.LocationService;
import com.yang.util.Result;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Yang
 * @Date 2024/3/18 9:40
 */

@Service
public class LocationServiceImpl extends ServiceImpl<LocationMapper, Location> implements LocationService {

    @Override
    public Result addLocation(List<Location> locationList) {

        boolean b = saveBatch(locationList);
        if (!b){
            return Result.fail();
        }

        return Result.ok();
    }
}
