package test.test;

import test.Dao.INewBankDetails;
import test.Dao.NewBAnkDetailsImpl;

public class InsertApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INewBankDetails daoImpl=new NewBAnkDetailsImpl();
		String result=daoImpl.NewBankDetails(2000000000);
		System.out.println(result);

	}

}
