package com.comp;

import java.awt.RadialGradientPaint;
import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Integer discount;
	private Courier courier;
	
	public Flipkart(Integer discount, Courier courier, Integer amount) {
		super();
		this.discount = discount;
		this.courier = courier;
		this.amount = amount;
		System.out.println("flipkart objeccts got loaded");
	}

	public Flipkart() {
		super();
		System.out.println("Flipkart class is loading ");
	}

	
	private Integer amount;

	
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

