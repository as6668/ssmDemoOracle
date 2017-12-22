package com.service;

import java.util.List;
import java.util.Map;

import com.entity.carEntity;
import com.entity.shopEntity;

public interface ICarService {
	 void addCar(carEntity car);
	 void updateCar(carEntity car);
	 void deleteCar(int id);
	 List<carEntity> findAll();
	 List<Map<String, String>> findAllShopByCarName(String name);
	 shopEntity findByIdShop(int id);
	 carEntity findById(int id);
	 carEntity findByName(String name);
}
