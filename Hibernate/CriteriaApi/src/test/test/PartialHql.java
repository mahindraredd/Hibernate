package test.test;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import test.model.BankAccount;
import test.util.HibernateUtil;

public class PartialHql {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		try {
			session=HibernateUtil.getSession();
			if(session!=null) {
				System.out.println("this is where selection happens");
				Query<Object[]> query = session.createQuery("SELECT accNo,holderName FROM test.model.BankAccount WHERE accNo IN(:id1,:id2)");
				query.setParameter("id1", 1L);
				query.setParameter("id2", 2L);
				List<Object[]> details = query.list();
				System.out.println("account number\t holder Name");
				details.forEach(row->{
					for(Object object:row) {
						System.out.print(object);
					}
					System.out.println();
				});
				
				
				
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
