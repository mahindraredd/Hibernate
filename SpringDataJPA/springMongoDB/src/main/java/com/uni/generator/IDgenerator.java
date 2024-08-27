package com.uni.generator;

import java.util.UUID;

public class IDgenerator {
	public static String generateId() {
		return UUID.randomUUID().toString().replace("-","").substring(0, 10);
		
	}

}
