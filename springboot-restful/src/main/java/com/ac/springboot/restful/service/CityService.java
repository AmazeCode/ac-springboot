package com.ac.springboot.restful.service;

import com.ac.springboot.restful.domain.City;

import java.util.List;

/**
 * @Description: TODO
 * @author: zhangyadong
 * @Date: 2019/11/15 17:21
 * @version: V1.0
 */
public interface CityService {

    /**
     * @Description 根据id获取城市信息
     * @params [id]
     * @return com.ac.springboot.restful.domain.City
     * @author zhangyadong
     * @date 2019/11/15 17:28
     */
    City findCityById(Long id);

    /**
     * @Description 获取城市信息
     * @params []
     * @return java.util.List<com.ac.springboot.restful.domain.City>
     * @author zhangyadong
     * @date 2019/11/15 17:29
     */
    List<City> findAllCity();

    /**
     * @Description 保存城市信息
     * @params [city]
     * @return void
     * @author zhangyadong
     * @date 2019/11/15 17:30
     */
    void saveCity(City city);

    /**
     * @Description 更新城市信息
     * @params [city]
     * @return void
     * @author zhangyadong
     * @date 2019/11/15 17:30
     */
    void updateCity(City city);

    /**
     * @Description 删除城市信息
     * @params [id]
     * @return void
     * @author zhangyadong
     * @date 2019/11/15 17:31
     */
    void deleteCity(Long id);
}
