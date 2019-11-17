package com.ac.springboot.mybatis.service;

import com.ac.springboot.mybatis.domain.City;

/**
 *  @Description: 城市SERVICE
 *  @author: zhangyadong
 *  @Date: 2019/11/16 15:18
 *  @version: V1.0
 */
public interface CityService {

    /**
     * @Description 根据城市名称获取城市信息
     * @params [cityName]
     * @return com.ac.springboot.mybatis.domain.City
     * @author zhangyadong
     * @date 2019/11/16 15:27
     */
    City findCityByName(String cityName);
}
