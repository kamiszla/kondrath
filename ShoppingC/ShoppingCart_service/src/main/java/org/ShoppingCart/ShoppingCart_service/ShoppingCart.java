package org.ShoppingCart.ShoppingCart_service;


public interface ShoppingCart {
	public void add(ProductInterface product);
	public double chechout();
	public int getNum();
}
