package com.uni.customerDTO;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class CustomerDTO {
	@org.springframework.data.annotation.Id
	private String Id;
	@NonNull
	private String name;
	@NonNull
	private String address;
	@NonNull
	private Integer age;

}
