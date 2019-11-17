package com.ac.springboot.mybatis.controller;

import com.ac.springboot.mybatis.domain.City;
import com.ac.springboot.mybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @Description: 控制层
 *  @author: zhangyadong
 *  @Date: 2019/11/16 15:08
 *  @version: V1.0
 */
@RestController
public class MybatisRestController {

    @Autowired
    private CityService cityService;

    /**
     * @Description 根据城市名称。获取城市信息
     * @params [cityName]
     * @return com.ac.springboot.mybatis.domain.City
     * @author zhangyadong
     * @date 2019/11/16 15:34
     */
    @RequestMapping(value="/api/city/{cityName}",method = RequestMethod.GET)
    public City findOneCity(@PathVariable("cityName")String cityName){
        return cityService.findCityByName(cityName);
    }
}
