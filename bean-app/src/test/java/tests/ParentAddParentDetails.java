package tests;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basetest.BaseTest;
import pages.LoginPage;
import pages.ParentAddParentDetailsPage;
import pages.ParentHomePage;

public class ParentAddParentDetails extends BaseTest{

	private LoginPage loginPage = new LoginPage(driver);
	private ParentLogin parentLogin = new ParentLogin();
	private ParentHomePage parentHomePage = new ParentHomePage(driver);
	private ParentAddParentDetailsPage addParentInfo = new ParentAddParentDetailsPage(driver);
	public String parentName = "Name";
	public String parentEmail = "test_" + new Random().nextInt(1000) + "@gmail.com";
	private String phoneNumber = String.format("+3706%07d", new Random().nextInt(10000000));
	private String personalCode = String.format("49%09d", new Random().nextInt(10000000));
	private String randomText = "InputText";
	
	@Test
	
	public void successfulParentDetailsSubmition () throws IOException {
		
		parentLogin.successfulParentLogin();
		parentHomePage.clickButtonParentForm();
		addParentInfo.inputFirstName(parentName);
		addParentInfo.inputLastName(parentName);
		addParentInfo.inputEmail(parentEmail);
		addParentInfo.inputPhone(phoneNumber);
		addParentInfo.inputPersonalCode(personalCode);
		addParentInfo.inputCity(randomText);
		addParentInfo.inputStreet(randomText);
		addParentInfo.inputHouseNumber(11);
		addParentInfo.inputFlatNumber(4);
		addParentInfo.inputNumberOfKids(3);
		addParentInfo.checkStudying();
		addParentInfo.inputStudyingInstitution("randomText");
		addParentInfo.checkHasaDisability();
		addParentInfo.checkDeclaredResidenceSameAsLiving();
		addParentInfo.clickButtonContinue();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

		
		// ideti validacija, sugalvot kaip panaudot jau egzituojancius emailus kad neregistruot kiekviena syki
		
		
		
	}
}
