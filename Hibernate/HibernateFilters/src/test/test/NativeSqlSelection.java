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

public class NativeSqlSelection {

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
				org.hibernate.Filter filter= session.enableFilter("BANK_ACCOUNT_FILTER");
				
				filter.setParameter("accType", "Savings");
				
				NativeQuery<BankAccount> query=session.createNativeQuery("select * from BankAccount");
				query.addEntity(BankAccount.class);
				List<BankAccount> account=query.getResultList();
				account.forEach(System.out::println);
				session.disableFilter("BANK_ACCOUNT_FILTER");
				Query<BankAccount> query1=session.createQuery("from test.model.BankAccount");
				List<BankAccount> account1=query.getResultList();
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
