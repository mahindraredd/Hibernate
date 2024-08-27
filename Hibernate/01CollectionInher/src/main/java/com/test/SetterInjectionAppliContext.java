package com.test;

import java.io.IOException;

import javax.management.MBeanServerFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.comp.Student;
import com.comp.WishMessageGenerator;

public class SetterInjectionAppliContext {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileSystemResource rsc = new FileSystemResource("src/main/resources/Beans.xml");
		XmlBeanFactory factory=new XmlBeanFactory(rsc);
		System.in.read();
		WishMessageGenerator wmg= (WishMessageGenerator)factory.getBean("wmg");
		Student det=(Student) factory.getBean("std");
		System.out.println(wmg);
		System.out.println(det);
		
	}

}
