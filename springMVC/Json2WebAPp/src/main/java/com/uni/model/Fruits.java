package com.uni.model;

import lombok.Data;

@Data
public class Fruits {
//	fruit" : "Apple",
//	"size" : "Large",
//	"color" : "Red"
	private Integer id;
	private String name;
	private String lastname;
	private Boolean active;
	
	private Address address;
	
	private String[] languages;

}
