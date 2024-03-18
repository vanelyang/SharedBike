package com.yang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.mapper.BikeMapper;
import com.yang.pojo.Bike;
import com.yang.service.BikeService;
import org.springframework.stereotype.Service;

/**
 * @Author Yang
 * @Date 2024/3/18 9:40
 */
@Service
public class BikeServiceImpl extends ServiceImpl<BikeMapper, Bike> implements BikeService {
}
