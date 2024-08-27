package com.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.comp.Election;



public class TestApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		 DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//		 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
//		 reader.loadBeanDefinitions("Beans.xml");
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println(Arrays.toString(factory.getBeanDefinitionNames()));
		 Election voter = (Election) factory.getBean(Election.class);
		 System.out.println(voter.getName());
		System.out.println( voter.eligible());
		 
	}

}
