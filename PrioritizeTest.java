package testNG;

import org.testng.annotations.Test;

public class PrioritizeTest {

	@Test					// if priority is not specified then default priority will be 0
	public void SignUp() {
		System.out.println("Sign Up");
	}

	@Test (priority=1)
	public void LogIn() {
		System.out.println("LogIn");
	}

	@Test (priority=2)
	public void SearchFlight() {
		System.out.println("SearchFlight");
	}

	@Test (priority=3)
	public void BookTickets() {
		System.out.println("BookTickets");
	}

	@Test (priority=4)
	public void MakePayment() {
		System.out.println("MakePayment");
	}

	@Test (priority=5)
	public void DownloadTicket() {
		System.out.println("DownloadTicket");
	}
	
	@Test (priority=6)
	public void LogOut() {
		System.out.println("LogOut");
	}

}
