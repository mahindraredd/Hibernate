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
import test.model.Payment;
import test.util.HibernateUtil;

public class SelectRecord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		try {
			session=HibernateUtil.getSession();
			if(session!=null) {
				Query<Payment> query = session.createQuery("from test.model.Payment");
				List<Payment> list = query.getResultList();
				list.forEach(System.out::println);
				Query<Card> query1 = session.createQuery("from test.model.Card");
				List<Card> list1 = query1.getResultList();
				list1.forEach(System.out::println);
				Query<Cheque> query2 = session.createQuery("from test.model.Cheque");
				List<Cheque> list2 = query2.getResultList();
				list2.forEach(System.out::println);
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
