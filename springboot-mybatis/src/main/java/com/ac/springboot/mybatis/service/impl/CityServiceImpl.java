package com.ac.springboot.mybatis.service.impl;

import com.ac.springboot.mybatis.dao.CityDao;
import com.ac.springboot.mybatis.domain.City;
import com.ac.springboot.mybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  @Description: CityServic实现
 *  @author: zhangyadong
 *  @Date: 2019/11/16 15:20
 *  @version: V1.0
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
