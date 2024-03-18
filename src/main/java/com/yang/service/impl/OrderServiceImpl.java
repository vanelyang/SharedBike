package com.yang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.mapper.OrderMapper;
import com.yang.pojo.Order;
import com.yang.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @Author Yang
 * @Date 2024/3/18 9:41
 */

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
}
