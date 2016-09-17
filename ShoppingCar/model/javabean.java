package com.model;

public class javabean {
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommodityClass() {
		return commodityClass;
	}
	public void setCommodityClass(String commodityClass) {
		this.commodityClass = commodityClass;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
	}
	public String getLaundryGuide() {
		return laundryGuide;
	}
	public void setLaundryGuide(String laundryGuide) {
		this.laundryGuide = laundryGuide;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPhto() {
		return phto;
	}
	public void setPhto(String phto) {
		this.phto = phto;
	}
	private String commodityClass;
	private float price;
	private String info;
	private String Material;
	private String laundryGuide;
	private String type;
	private int num;
	private String phto;
}
