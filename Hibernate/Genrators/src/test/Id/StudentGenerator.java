package test.Id;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class StudentGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor arg0, Object arg1) throws HibernateException {
		// TODO Auto-generated method stub
		System.out.println("StudentGenerator.generator()");
		String id="Ind";
		
		String date =new SimpleDateFormat("yyyy-mm-dd").format(new Date());
		String pre1 ="universin";
		String pre2;
		return id;
	}

}
