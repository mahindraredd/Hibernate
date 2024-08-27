package test.util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import test.model.BankAccount;
import test.model.Card;
import test.model.Cheque;
import test.model.Payment;






public class HibernateUtil {
	private static SessionFactory sessionFactory=null;
	private static Session session=null;
	
	static {
		Configuration config=new Configuration();
		sessionFactory=config.configure().addAnnotatedClass(Payment.class).addAnnotatedClass(Card.class).addAnnotatedClass(Cheque.class).buildSessionFactory();
	}
	public static Session getSession() {
		if(session==null)
			session=sessionFactory.openSession();
		return session;	
	}
	public static void closeSession(Session session) {
		if(session!=null) {
			session.close();
		}
	}
	public static void closeSessionFactory() {
		
		if(sessionFactory!=null)
			sessionFactory.close();
	}
	
	
}
