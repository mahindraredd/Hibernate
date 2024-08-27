package test.test;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.type.StandardBasicTypes;

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
			if(session!=null) {
				System.out.println("this is where selection happens");
				transaction=session.beginTransaction();
				BankAccount account = new BankAccount();
		        account.setHolderName("John wick");
		        account.setBalance(100000.0);
		        account.setType("Salary");

		        // Save the BankAccount object
		        session.save(account);
//				
				
				
				
				
				
				
				
			}
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
		

	}

}
