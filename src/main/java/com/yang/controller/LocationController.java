package com.yang.controller;

import com.yang.pojo.Location;
import com.yang.service.LocationService;
import com.yang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Yang
 * @Date 2024/3/18 9:56
 */
@RestController
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/addLocations")
    public Result addLocation(@RequestBody List<Location> locationList) {
        return locationService.addLocation(locationList);
    }

}
