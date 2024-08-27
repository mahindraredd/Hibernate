package test.test;



import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

import test.model.BankAccount;
import test.util.HibernateUtil;

public class UpdateApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		BankAccount acc=null;
		boolean flag=false;
		Long id=2L;
		try {
			session=HibernateUtil.getSession();
			acc=session.get(BankAccount.class, id,LockMode.UPGRADE_NOWAIT);
			System.out.println("account befor modification"+acc);
			transaction=session.beginTransaction();
			if(acc!=null) {
				Thread.sleep(30000);
				acc.setBalance(acc.getBalance()-10000000);
				session.update(acc);
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
