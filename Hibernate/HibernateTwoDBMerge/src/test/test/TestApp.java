package test.test;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import test.model.BankAccount;
import test.util.HibernateUtil;

public class TestApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		try {
			session=HibernateUtil.getSession();
			if(session!=null)
				System.out.println("this is where transaction happens");
				transaction=session.beginTransaction();
			if(transaction!=null) {
				BankAccount acc=new BankAccount();
				acc.setBalance(222222.0);
				acc.setHolderName("mahi");
				acc.setType("savings");
				session.save(acc);
				flag=true;
				
				
				
				
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
