package test.test;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
//				
				Criteria cri=session.createCriteria(BankAccount.class);
				ProjectionList pl=Projections.projectionList();
				pl.add(Projections.property("accno"));
				pl.add(Projections.property("count"));
				cri.setProjection(pl);
				Criterion c1=Restrictions.ge("balance", 2.0);
				Criterion c2=Restrictions.le("balance", 1.0);
				cri.add(c1);
				cri.add(c2);
				
				
				Order order=Order.asc("count");
				cri.addOrder(order);
				List<Object[]> details=cri.list();
				details.forEach(row->{
					for(Object obj:row) {
						System.out.println(obj);
					}
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
