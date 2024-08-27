package com.comp;

import org.springframework.stereotype.Component;

@Component(value = "bDart")
public class BLUEDART implements Courier {
	
	@Override
	public void serice(int id) {
		System.out.println("Bluedart is doing the courier service of the order"+id);

	}

	@Override
	public String toString() {
		return "BLUEDART ";
	}

}
