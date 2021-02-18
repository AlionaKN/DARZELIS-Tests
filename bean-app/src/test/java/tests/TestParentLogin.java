package tests;

import org.junit.Test;

import generictest.GenericTestMethods;

import static org.junit.Assert.*;

import java.io.IOException;

import pages.ParentHomePage;




public class TestParentLogin extends GenericTestMethods {


	private ParentHomePage parentHomePage = new ParentHomePage(driver);
	
	@Test
	public void successfulParentLogin () throws IOException {
		
		registerParent();
		login();
		String successLogInText = parentHomePage.getSuccessText();
		assertTrue("Chart does not contain expected text", successLogInText.contains("Esate prisijungęs"));
		parentHomePage.clickButtonLogout();
	}

}
