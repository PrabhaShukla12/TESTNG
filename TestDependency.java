package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestDependency {
	static String TrackNo = null;

	@Test
	public void CreateShipment() {
		int a= (5/0);
		System.out.println("CreateShipment");
		TrackNo = "GT675K";
	}

	@Test(dependsOnMethods = {"CreateShipment"}, alwaysRun= true)
	public void TrackShipment() throws Exception {
		if (TrackNo != null)
			System.out.println("TrackShipment");
		else
			throw new Exception("TrackNo is invalid");
	}

	@Test (dependsOnMethods = {"CreateShipment", "TrackShipment"}, ignoreMissingDependencies= true)
	public void CancelShipment() throws Exception {
		if (TrackNo != null)
			System.out.println("CancelShipment");
		else
			throw new Exception("TrackNo is invalid");
	}

}
