package com.onesoft.exception;

public class Car {
	private String brand;
	private int price;
	private int color;
	private boolean isFuel;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public boolean isFuel() {
		return isFuel;
	}
	public void setFuel(boolean isFuel) {
		this.isFuel = isFuel;
	}
	public Car(String brand, int price, int color, boolean isFuel) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isFuel = isFuel;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", color=" + color + ", isFuel=" + isFuel + "]";
	}
	public void getInput() {
		
	}
	

}
