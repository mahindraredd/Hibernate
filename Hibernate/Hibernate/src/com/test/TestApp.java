package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure().addAnnotatedClass(Student.class);
		SessionFactory sF=config.buildSessionFactory();
		Session session=sF.openSession();
		Student s=new Student();
		Transaction t=session.beginTransaction();
		
		
		s.setId(1);
		s.setName("mahi");
		s.setRole("ass");
		session.save(s);
		t.commit();
	}

}
