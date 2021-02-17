package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

import basetest.BaseTest;
import pages.ParentHomePage;
import pages.LoginPage;



public class ParentLogin extends BaseTest {

	private LoginPage loginPage = new LoginPage(driver);
	private ParentRegistration parentRegistration = new ParentRegistration();
	private ParentHomePage parentHomePage = new ParentHomePage(driver);
	
	@Test
	public void successfulParentLogin () throws IOException {
		
        parentRegistration.successfulParentRegistrationByAdmin();
		loginPage.openLoginPage();
		loginPage.inputEmail(parentRegistration.userEmail);
		loginPage.inputPassword(parentRegistration.userName);
		loginPage.clickButtonLogin();
		
		String successLogInText = parentHomePage.getSuccessText();
		assertTrue("Chart does not contain expected text", successLogInText.contains("Esate prisijungęs"));
//	parentHomePage.clickButtonEditParentForm();
	}

}
