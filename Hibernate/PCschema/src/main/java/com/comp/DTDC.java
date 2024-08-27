package com.comp;

public class DTDC implements Courier {
	static{
		System.out.println("Dtdc couriere is .class is loading");
	}
	@Override
	public void serice(int id) {
		System.out.println("dtdc charges"+id);

	}
	@Override
	public String toString() {
		return "DTDC ";
	}

}
