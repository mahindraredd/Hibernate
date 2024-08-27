package test.test;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.annotations.Filter;
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

public class SelectionApp {

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
//				org.hibernate.Filter filter= session.enableFilter("BANK_ACCOUNT_FILTER");
//				
//				filter.setParameter("accType", "Savings");
//				BankAccount acc=new BankAccount();
//				acc.setAccNo(2L);
//				session.delete(acc);
//				transaction.commit();
			Query<BankAccount> query1=session.createQuery("from test.model.BankAccount");
			query1.setFirstResult(13);
			query1.setMaxResults(3);
				List<BankAccount> account1=query1.getResultList();
				
				account1.forEach(System.out::println);
				
		      
		       
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
