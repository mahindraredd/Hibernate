package com.test;

import java.io.IOException;

import javax.management.MBeanServerFactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.comp.WishMessageGenerator;

public class SetterInjectionAppliContext {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reaader=null;
		factory= new DefaultListableBeanFactory();
		reaader=new XmlBeanDefinitionReader(factory);
		reaader.loadBeanDefinitions("Beans.xml");
		factory.getBean("wmg");
		
	}

}
