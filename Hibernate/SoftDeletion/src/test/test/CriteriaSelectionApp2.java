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

public class CriteriaSelectionApp2 {

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
				
				Criteria cri=session.createCriteria(BankAccount.class);
				List<BankAccount> Details=cri.list();
				Details.forEach(System.out::println);
				session.disableFilter("BANK_ACCOUNT_FILTER");
				Criteria cri1=session.createCriteria(BankAccount.class);
				List<BankAccount> Details1=cri.list();
				Details1.forEach(System.out::println);
				
		      
		       
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
