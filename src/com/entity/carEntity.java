package com.entity;

import java.sql.Date;

public class carEntity {
	private int id;
	private String name;
	private String color;
	private int price;
	private Date time;
	private int shopid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

	public carEntity(int id, String name, String color, int price, Date time, int shopid) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.time = time;
		this.shopid = shopid;
	}

	public carEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public carEntity(String name, String color, int price, Date time, int shopid) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.time = time;
		this.shopid = shopid;
	}

}
