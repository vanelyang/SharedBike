package com.yang.controller;

import com.yang.pojo.Bike;
import com.yang.service.BikeService;
import com.yang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Yang
 * @Date 2024/3/18 9:56
 */
@RestController
@RequestMapping("/bikes")
public class BikeController {

    @Autowired
    private BikeService bikeService;

    @PostMapping("/addBikes")
    public Result addBikes(@RequestBody List<Bike> bikeList){
        return bikeService.addBikes(bikeList);
    }

}
