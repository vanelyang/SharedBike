package com.yang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.mapper.LocationMapper;
import com.yang.pojo.Location;
import com.yang.service.LocationService;
import org.springframework.stereotype.Service;

/**
 * @Author Yang
 * @Date 2024/3/18 9:40
 */

@Service
public class LocationServiceImpl extends ServiceImpl<LocationMapper, Location> implements LocationService {
}
