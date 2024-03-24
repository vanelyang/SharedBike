package com.yang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.pojo.Location;
import com.yang.util.Result;

import java.util.List;

/**
 * @Author Yang
 * @Date 2024/3/18 9:39
 */
public interface LocationService extends IService<Location> {
    Result addLocation(List<Location> locationList);
}
