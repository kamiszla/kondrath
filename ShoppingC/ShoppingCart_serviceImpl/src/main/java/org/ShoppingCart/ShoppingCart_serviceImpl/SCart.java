package org.ShoppingCart.ShoppingCart_serviceImpl;

import java.util.ArrayList;

import org.ShoppingCart.ShoppingCart_service.ProductInterface;
import org.ShoppingCart.ShoppingCart_service.ShoppingCart;

public class SCart implements ShoppingCart {

	private ArrayList<ProductInterface> cartItems;
	
	public SCart(){
		cartItems=new ArrayList<ProductInterface>();
	}
	
	public void add(ProductInterface product) {
		cartItems.add(product);
	}

	public double chechout() {
		double sum = 0;
		for(ProductInterface item : cartItems){
			sum += item.getPrice();
		}
		return sum;
	}

	public int getNum() {		
		return cartItems.size();
	}

}
