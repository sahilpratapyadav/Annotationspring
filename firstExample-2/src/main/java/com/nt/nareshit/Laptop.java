package com.nt.nareshit;

import org.springframework.stereotype.Component;

@Component(value="lap1")
public class Laptop {
	private int lid;
	private String brand;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void proc() {
		System.out.println("laptop  in proccess");
	}
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	

}
