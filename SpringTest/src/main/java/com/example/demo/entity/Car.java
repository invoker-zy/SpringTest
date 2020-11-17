package com.example.demo.entity;

public class Car {
	private String brand;
	private String corp;
	private int privce;
	private int maxSpeed;
	
	public Car(String brand, String corp, int privce) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.privce = privce;
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", privce=" + privce + ", maxSpeed=" + maxSpeed + "]";
	}
	
}
