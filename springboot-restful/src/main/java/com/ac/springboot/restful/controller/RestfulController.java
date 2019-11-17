package com.ac.springboot.restful.controller;

import com.ac.springboot.restful.domain.City;
import com.ac.springboot.restful.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  @Description: TODO
 *  @author: zhangyadong
 *  @Date: 2019/11/15 17:03
 *  @version: V1.0
 */
@RestController
public class RestfulController {

    @Autowired
    private CityService cityService;

    /**
     * 查询()
     */
    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public List<City> findAllCity() {
        return cityService.findAllCity();
    }

    /**
     * 创建(实体)
     */
    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        cityService.saveCity(city);
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    /**
     * 删除（参数{id}）
     */
    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }
}
