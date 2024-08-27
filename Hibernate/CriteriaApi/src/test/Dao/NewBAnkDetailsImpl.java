package test.Dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import test.model.BankAccount;
import test.util.HibernateUtil;

public class NewBAnkDetailsImpl implements INewBankDetails {
	
	@Override
	public String NewBankDetails(long income) {
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		try {
			session=HibernateUtil.getSession();
			if(session!=null) {
				System.out.println("this is where selection happens");
				Query<BankAccount> query = session.createQuery("FROM test.model.BankAccount");
				
				
				
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
		
		
		return null;
	}

}
