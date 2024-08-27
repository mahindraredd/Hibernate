package com.uni.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Address {
	@NonNull
	private String city;
	@NonNull
	private String town;
	@NonNull
	private String home;

}
