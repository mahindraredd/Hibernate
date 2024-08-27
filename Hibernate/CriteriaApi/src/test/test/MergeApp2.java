package test.test;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import test.model.BankAccount;
import test.util.HibernateUtil;

public class MergeApp2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		BankAccount acc=null;
		BankAccount acc1=null;
		
		boolean flag=false;
		Long id=2L;
		try {
			session=HibernateUtil.getSession();
			acc=session.get(BankAccount.class, id);
			System.out.println("account befor modification"+acc);
			transaction=session.beginTransaction();
			if(acc!=null) {
				acc.setBalance(acc.getBalance()+100000000);
				session.save(acc);
				acc1=(BankAccount) session.merge(acc);
				System.out.println("after merging in L1cache "+acc1);
				flag=true;
				
			}
			else {
				System.out.println("Record not available for given id");
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
				System.out.println("account opening date"+acc.getOpeningDate());
				System.out.println("account updated date"+acc.getLastUpdated());
				System.out.println("account version"+acc.getCount());
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
