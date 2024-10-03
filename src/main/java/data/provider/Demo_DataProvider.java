package data.provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_DataProvider {
	
	@DataProvider(name = "credentials")
	public Object[][] getData(){
		
		Object[][] data=new Object[2][2];
		
		data[0][0] = "donhere";
		data[0][1] = "don@123";
		
		data[1][0] = "Chandra";
		data[1][1] = "Chandra@123";
		
		return data;
		
	}
	
	@Test(dataProvider = "credentials")
	public void test(String un,String pass) {
		System.out.println(un);
		System.out.println(pass);
	}

}
