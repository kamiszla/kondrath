package org.ShoppingCart.ShoppingCart_serviceImpl;

import org.ShoppingCart.ShoppingCart_service.ProductInterface;

public class Sugar implements ProductInterface {
	
	private String name;
	private double price;
	
	public Sugar (String name, double price){
		this.name = name;
		this.price = price;
	}
	
	
	public void setName(String name) {
		name = this.name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		price = this.price;
	}

	public double getPrice() {
		return price;
	}

}
