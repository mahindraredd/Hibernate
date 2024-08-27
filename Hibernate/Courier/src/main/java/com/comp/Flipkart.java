package com.comp;

import java.awt.RadialGradientPaint;
import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Integer discount;
	private Courier courier;
	
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	
	public void setAmount(Integer amount) {
		this.amount = amount;
		System.out.println("Delivary of the courier service is "+courier);
	}
	private Integer amount;

	public Flipkart(Courier courier ) {
		this.courier=courier;
		System.out.println("flipkart courier services");
	}
	public String doShopping(String[] items,float[] prices) {
		System.out.println("shopping by flipkart ");
		System.out.println(courier.getClass().getName());
		System.out.println("Discount amount is "+discount);
		int oid=0;
		float bill=0.0f;
		Random random=null;
		for (float price: prices) {
			bill+=price;
		}
		
		return Arrays.toString(items)+"are purchased anad prices are "+Arrays.toString(prices)+"with billing is"+bill; 
	}
	
	
}

