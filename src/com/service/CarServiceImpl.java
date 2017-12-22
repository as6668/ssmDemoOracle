package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ICarDao;
import com.entity.carEntity;
import com.entity.shopEntity;
@Service
public class CarServiceImpl implements ICarService{
@Autowired
private ICarDao cardao; 

	@Override
	public void addCar(carEntity car) {
		// TODO Auto-generated method stub
		cardao.addCar(car);
	}

	@Override
	public void updateCar(carEntity car) {
		// TODO Auto-generated method stub
		cardao.updateCar(car);
	}

	@Override
	public void deleteCar(int id) {
		// TODO Auto-generated method stub
		cardao.deleteCar(id);
	}

	@Override
	public List<carEntity> findAll() {
		// TODO Auto-generated method stub
		return cardao.findAll();
	}

	@Override
	public List<Map<String, String>> findAllShopByCarName(String name) {
		// TODO Auto-generated method stub
		return cardao.findAllShopByCarName(name);
	}

	@Override
	public shopEntity findByIdShop(int id) {
		// TODO Auto-generated method stub
		return cardao.findByIdShop(id);
	}

	@Override
	public carEntity findById(int id) {
		// TODO Auto-generated method stub
		return cardao.findById(id);
	}

	@Override
	public carEntity findByName(String name) {
		// TODO Auto-generated method stub
		return cardao.findByName(name);
	}

}
