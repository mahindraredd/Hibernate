package com.uni.bo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CaronaVaccine implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long regNo;
	private String Name;
	private Integer price;
	private String companyName;
	private Integer doses;
	public CaronaVaccine(Long regNo, String name, Integer price, String companyName, Integer doses) {
		super();
		this.regNo = regNo;
		Name = name;
		this.price = price;
		this.companyName = companyName;
		this.doses = doses;
	}
	public CaronaVaccine() {
		
	}
	public Long getRegNo() {
		return regNo;
	}
	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getDoses() {
		return doses;
	}
	public void setDoses(Integer doses) {
		this.doses = doses;
	}
	@Override
	public String toString() {
		return "CaronaVaccine [regNo=" + regNo + ", Name=" + Name + ", price=" + price + ", companyName=" + companyName
				+ ", doses=" + doses + "]";
	}
	

}
