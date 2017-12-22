package com.entity;

public class shopEntity {
private int id ;
private String	name; 
private String address; 
private String phoneNo;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public shopEntity(int id, String name, String address, String phoneNo) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.phoneNo = phoneNo;
}
public shopEntity(String name, String address, String phoneNo) {
	super();
	this.name = name;
	this.address = address;
	this.phoneNo = phoneNo;
}
public shopEntity() {
	super();
	// TODO Auto-generated constructor stub
}



}
