package test.test;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
				NativeQuery<BankAccount> nq=session.getNamedNativeQuery("sql");
				List<BankAccount> details=nq.getResultList();
				details.forEach(System.out::println);
				
				
				//NativeQuery<Long[]> nativeQuery=session.createSQLQuery("SELECT balance FROM BANKACCOUNt Where type=:id");
//				nativeQuery.setParameter("id", "savings");
//				nativeQuery.addScalar("balance",StandardBasicTypes.LONG);
//				
//				nativeQuery.addEntity(BankAccount.class);
//				List<Object[]> details=nativeQuery.getResultList();
//				details.forEach(row->{
//					for(Object obj:row) {
//						System.out.println(obj+"\t");
					//}
				//});
				
				
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
