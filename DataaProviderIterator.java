package testNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataaProviderIterator {

	@Test(dataProvider = "logindata")
	public void login(Object[] a) throws InterruptedException {
		System.out.println(a[0] + " >>> " + a[1] + " >>> " + a[2] + " >>> " + a[3]);
	}

	@DataProvider(name = "logindata")
	public Iterator<Object[]> dataa() {

		List<Object[]> dataa = new ArrayList<>();
		
		dataa.add(new Object[] {"Prabha", "Shukla", "26 Years", "26 lakhs"});
		dataa.add(new Object[] {"Rajat", "Shukla", "20 Years", "20 lakhs"});
		dataa.add(new Object[] {"Prabhat", "Shukla", "23 Years", "25 lakhs"});
		dataa.add(new Object[] {"Papa", "Shukla", "52 Years", "30 lakhs"});
		dataa.add(new Object[] {"Mumma", "Shukla", "52 Years", "30 lakhs"});
		
		return dataa.iterator();
	}
}
