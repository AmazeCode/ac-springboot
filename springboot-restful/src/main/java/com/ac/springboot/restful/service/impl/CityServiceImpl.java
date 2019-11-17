package com.ac.springboot.restful.service.impl;

import com.ac.springboot.restful.dao.CityDao;
import com.ac.springboot.restful.domain.City;
import com.ac.springboot.restful.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *  @Description: TODO
 *  @author: zhangyadong
 *  @Date: 2019/11/15 17:21
 *  @version: V1.0
 */
@Service
public class CityServiceImpl implements CityService {


    @Autowired//没有标注Bean的类使用@Resource
    private CityDao cityDao;

    @Override
    public City findCityById(Long id) {
        return cityDao.findById(id);
    }

    @Override
    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    @Transactional
    @Override
    public void saveCity(City city) {
        cityDao.saveCity(city);
    }

    @Transactional
    @Override
    public void updateCity(City city) {
        cityDao.updateCity(city);
    }

    @Transactional
    @Override
    public void deleteCity(Long id) {
        cityDao.deleteCity(id);
    }
}
