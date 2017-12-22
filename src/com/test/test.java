package com.test;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.carEntity;
import com.entity.shopEntity;
import com.service.CarServiceImpl;

public class test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		CarServiceImpl bean = (CarServiceImpl) ac.getBean("carServiceImpl");
//		carEntity	a=new carEntity(2,"123", "red", 123456, new Date(System.nanoTime()), 1);
		//bean.addCar(a);
		//bean.updateCar(a);
		//System.out.println("ok");
//		List<carEntity> findAll = bean.findAll();
//		
//		for (carEntity carEntity : findAll) {
//			System.out.println(carEntity.getName());
//		}
		List<Map<String, String>> findAllShopByCarName = bean.findAllShopByCarName("%法%");
		for (Map map : findAllShopByCarName) {
			if (map!=null) {
				System.out.println(map.get("CNAME"));
				System.out.println(map.get("SNAME"));
	}	
}
//		carEntity findByName = bean.findByName("拉利");
//		if (findByName!=null) {
//			System.out.println("no ok");
//		} else {
//			System.out.println("ok");
//		}
//	
	}
}
