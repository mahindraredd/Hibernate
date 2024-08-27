package com.comp;

import java.awt.RadialGradientPaint;
import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component(value="flipkart")
@Scope(scopeName = "singleton")
public class Flipkart {
	private Integer discount;
	
	private Courier courier;
	
	

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	@Autowired
	public Flipkart(@Qualifier("dtdc") Courier courier) {
		super();
		this.courier = courier;
		System.out.println("Flipkart object got created");
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
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
		
		return Arrays.toString(items)+"are purchased anad prices are "+courier.getClass().getName()+Arrays.toString(prices)+"with billing is"+bill; 
	}
	
	
}

