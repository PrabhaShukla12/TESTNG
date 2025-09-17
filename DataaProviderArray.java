package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataaProvider2 {

	@Test(dataProvider = "logindata")
	public void login(Object[] a) throws InterruptedException {
		System.out.println(a[0]+ ">>>"+ a[1]+ ">>>" + a[2]);
		}

	@DataProvider(name = "logindata")
	public Object[][] dataa() {
		Object[][] data = new Object [3][3];

		data[0][0] = "Admin";
		data[0][1] = 234;
		data[0][2] = "Come Here";
		
		data[1][0] = "Prabha";
		data[1][1] = 123;
		data[1][2] = "Dream Job";
		
		data[2][0] = "Mumma";
		data[2][1] = 4567;
		data[2][2] = "I love you !";
		
		return data;
	}
}
