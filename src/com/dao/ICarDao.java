package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.carEntity;
import com.entity.shopEntity;

public interface ICarDao {
 void addCar(carEntity car);
 void updateCar(carEntity car);
 void deleteCar(int id);
 List<carEntity> findAll();
 carEntity findById(int id);
 List<Map<String, String>> findAllShopByCarName(String name);
 shopEntity findByIdShop(int id);
 carEntity findByName(String name);
}
