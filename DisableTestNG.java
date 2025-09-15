package testNG;

import org.testng.annotations.Test;

public class DisableTestNG {

	@Test					// if priority is not specified then default priority will be 0
	public void SignUp() {
		System.out.println("Sign Up");
	}

	@Test 
	public void LogIn() {
		System.out.println("LogIn");
	}

	@Test
	public void SearchFlight() {
		System.out.println("SearchFlight");
	}

	@Test 
	public void BookTickets() {
		System.out.println("BookTickets");
	}

	@Test 
	public void MakePayment() {
		System.out.println("MakePayment");
	}

	@Test 
	public void DownloadTicket() {
		System.out.println("DownloadTicket");
	}
	
	@Test 
	public void LogOut() {
		System.out.println("LogOut");
	}

}
