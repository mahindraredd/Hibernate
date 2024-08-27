package com.comp;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value ="Vote")
@PropertySource(value ="/com/commons/application.properties")
public class Election {
	@Value("${vote.info.name}")
	private String name;
	@Value("${vote.info.age}")
	private Integer age;
	private Date dov;
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public Date getDov() {
		return dov;
	}
	public void setDov(Date dov) {
		this.dov = dov;
	}
	@Override
	public String toString() {
		return "Election [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}
	static {
		System.out.println("Election.class is loading");
	}
	public Election()
	{
		System.out.println("Election object got created");
	}
	@PostConstruct
	public void myInit() {
		
		
	}
	public String eligible() {
		if(age<18)
			return name+" is not eligible to vote because you age is " +age+" which doesn't met the eligibilty";
		else
			return name+" is  eligible to vote because you age is " +age+" which  met the eligibilty";
	
	}
}
