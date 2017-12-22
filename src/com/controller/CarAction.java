package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.entity.carEntity;
import com.entity.shopEntity;
import com.service.CarServiceImpl;

@Controller
@RequestMapping(value="car")
public class CarAction {
	@Autowired
	private CarServiceImpl carSer;
	@RequestMapping(value="findByCName")
	ModelAndView findByCName(String cname, ModelAndView model){
		
		List<Map<String, String>> list = carSer.findAllShopByCarName("%"+cname+"%");
		model.addObject("list",list);
		model.setViewName("index");
		return model;
		
	}
	@RequestMapping(value="findAll")
	ModelAndView findAll( ModelAndView model){
		
		List<carEntity> findAll = carSer.findAll();
		model.addObject("clist",findAll);
		model.setViewName("index");
		return model;
		
	}
	@RequestMapping(value="findShopId")
	ModelAndView findShopId(int shopid, ModelAndView model){
		shopEntity findByIdShop = carSer.findByIdShop(shopid);
		model.addObject("shop", findByIdShop);
		model.setViewName("index2");
		return model;
		
	}
	@RequestMapping(value="findByCarId")
	ModelAndView findByCarId(int id, ModelAndView model){
		carEntity car=carSer.findById(id);
		model.addObject("car", car);
		model.setViewName("update");
		return model;
		
	}
	@RequestMapping(value="updateCar")
	ModelAndView updateCar(HttpServletRequest req, ModelAndView model){
		carEntity car=new carEntity(
				Integer.valueOf(req.getParameter("id")),
				req.getParameter("name"),
				req.getParameter("color"),
				Integer.valueOf(req.getParameter("price")),
			java.sql.Date.valueOf(req.getParameter("time")),
			Integer.valueOf(req.getParameter("shopid")));
		carSer.updateCar(car);
		model.setViewName("redirect:/car/findAll.do");
		return model;
		
	}
	@RequestMapping(value="addCar")
	ModelAndView addCar(HttpServletRequest req, ModelAndView model){
		carEntity car=new carEntity(
				req.getParameter("name"),
				req.getParameter("color"),
				Integer.valueOf(req.getParameter("price")),
				java.sql.Date.valueOf(req.getParameter("time")),1);
		carSer.addCar(car);
		model.setViewName("redirect:/car/findAll.do");
		return model;
		
	}
	@RequestMapping(value="findByName")
	@ResponseBody
  String findByName(String name) {
		
		carEntity findByName = carSer.findByName(name);
		if(findByName==null){
		
			return "1";
		}else {
		
			return "0";
		}
		
		
	}
	@RequestMapping(value="deleteCar")
	ModelAndView deleteCar(int id, ModelAndView model){
		carSer.deleteCar(id);
	
		model.setViewName("redirect:/car/findAll.do");
		return model;
		
	}

}
