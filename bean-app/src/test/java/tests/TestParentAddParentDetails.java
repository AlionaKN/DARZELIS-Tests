package tests;

import java.io.IOException;


import org.junit.Test;

import generictest.GenericTestMethods;
import pages.ParentHomePage;


public class TestParentAddParentDetails extends GenericTestMethods{
	private ParentHomePage parentHomePage = new ParentHomePage(driver);

	@Test
	
	public void successfulParentDetailsSubmition () throws IOException {
		
		registerParent();
		login();
		addParentDetails();
        parentHomePage.clickButtonLogout();

		
		// ideti validacija, sugalvot kaip panaudot jau egzituojancius emailus kad neregistruot kiekviena syki
		
		
		
	}
}
