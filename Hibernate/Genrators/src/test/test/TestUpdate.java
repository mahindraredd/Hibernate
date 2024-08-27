package test.test;

import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import test.model.Student;
import test.util.HibernateUtil;

public class TestUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		try {
			session=HibernateUtil.getSession();
			if(session!=null)
				System.out.println("this is where ");
				transaction=session.beginTransaction();
			if(transaction!=null) {
				
				Student s=new Student();
				System.out.println("flag value"+flag);
				s.setId("universe");
				s.setName("mahi");
				s.setRole("Ceo");
				session.save(s);
				flag=true;
				System.out.println("flag value"+flag);
				
			}
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(flag) {
				System.in.read();
				transaction.commit();
				System.out.println("Object updated to Database");	
			}
			else {
				transaction.rollback();
				System.out.print("Object is not updated to Database");
			}
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
		
		
	}

}
