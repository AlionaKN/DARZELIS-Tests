package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import generictest.GenericTestMethods;
import pages.EduHomePage;


public class TestEduLogin extends GenericTestMethods{
	private EduHomePage eduHomePage = new EduHomePage(driver);

@Test

public void successfulEduLogin () {
	
	registerEdu();
	login();
	String successLogInText = eduHomePage.getSuccessText();
	assertTrue("Chart does not contain expected text", successLogInText.contains("Esate prisijungęs"));
	eduHomePage.clickButtonLogout();

	
}

}
