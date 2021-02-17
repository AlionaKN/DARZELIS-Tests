package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import basetest.BaseTest;
import pages.EduHomePage;
import pages.LoginPage;

public class EduLogin extends BaseTest{
	private LoginPage loginPage = new LoginPage(driver);
	private EduRegistration eduRegistration = new EduRegistration();
	private EduHomePage eduHomePage = new EduHomePage(driver);

@Test

public void successfulEduLogin () {
	
	eduRegistration.successfulEduRegistrationByAdmin();
	loginPage.openLoginPage();
	loginPage.inputEmail(eduRegistration.userEmail);
	loginPage.inputPassword(eduRegistration.userName);
	loginPage.clickButtonLogin();
	String successLogInText = eduHomePage.getSuccessText();
	assertTrue("Chart does not contain expected text", successLogInText.contains("Esate prisijungęs"));

	
}

}
