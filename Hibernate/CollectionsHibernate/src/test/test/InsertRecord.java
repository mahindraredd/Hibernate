package test.test;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import test.model.BankAccount;
import test.model.Card;
import test.model.Cheque;
import test.util.HibernateUtil;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		try {
			session=HibernateUtil.getSession();
			if(session!=null) {
				System.out.println("this is where selection happens");
				transaction=session.beginTransaction();
				Card c=new Card();
				c.setId(123);
				c.setAmount((float) 1000);
				c.setAmount((float) 2000);
				
				c.setCardNumber(4321);
				c.setMode("swipe");
				
				Cheque cq=new Cheque();
				cq.setAmount((float) 200);
				cq.setChequeNo(12345);
				cq.setId(123456);
				cq.setChequetype("salary");
				cq.setExpiryDate(LocalDate.of(24, 8, 10));
				session.save(cq);
				session.save(c);
				
			}
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			transaction.commit();
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
		
	}

}
