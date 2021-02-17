package tests;

import java.io.IOException;
import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basetest.BaseTest;
import pages.LoginPage;
import pages.ParentAddChildDetailsPage;
import pages.ParentHomePage;

public class ParentAddChildDetails extends BaseTest {
	private LoginPage loginPage = new LoginPage(driver);
	private ParentHomePage parentHomePage = new ParentHomePage(driver);
	private ParentAddChildDetailsPage addChildInfo = new ParentAddChildDetailsPage(driver);
	private ParentAddParentDetails addParentInfo = new ParentAddParentDetails();
	private String name = "Name";
	private String email = "test_" + new Random().nextInt(1000) + "@gmail.com";
	private String phoneNumber = String.format("+3706%07d", new Random().nextInt(10000000));
	private String childPersonCode = String.format("59%09d", new Random().nextInt(10000000));
	private String secondParentPersonCode = String.format("49%09d", new Random().nextInt(10000000));
	private String randomText = "InputText";

	@Test

	public void successfulChildInfoAddition() throws IOException {
//		loginPage.openLoginPage();
//		loginPage.inputEmail("test_668@gmail.com");
//		loginPage.inputPassword("Testas");
//		loginPage.clickButtonLogin();
		addParentInfo.successfulParentDetailsSubmition();
		 WebElement element = parentHomePage.buttonChildForm;
	     Actions actions = new Actions(driver);
	     actions.moveToElement(element).click().perform();
//		parentHomePage.clickButtonChildForm();
		addChildInfo.inputChildFirstName(name);
		addChildInfo.inputChildLastName(name);
		
//		addChildInfo.inputChildBirthDate("2014-03-21"); // sugalvoti kaip sugeneruoti
		// reikia sugalvot kaip random numberi sugeneruot be ne nuli
		addChildInfo.inputChildPersonCode(childPersonCode);
		addChildInfo.inputChildCity(randomText);
		addChildInfo.inputChildStreet(randomText);
		addChildInfo.inputChildHouseNumber(new Random().nextInt(100));
		addChildInfo.inputChildFlatNumber(new Random().nextInt(10));
		addChildInfo.checkAdopted();
		addChildInfo.checkAddSecondParent();
		addChildInfo.inputSecondParentFirstName(name);
		addChildInfo.inputSecondParentLastName(name);
		addChildInfo.inputSecondParentEmail(email);
		addChildInfo.inputSecondParentPhone(phoneNumber);
		addChildInfo.inputSecondParentPersonCode(secondParentPersonCode);
		addChildInfo.inputSecondParentCity(randomText);
		addChildInfo.inputSecondParentStreet(randomText);
		addChildInfo.inputSecondParentHouseNumber(new Random().nextInt(100));
		addChildInfo.inputSecondParentFlatNumber(new Random().nextInt(10));
		addChildInfo.inputSecondParentNumberOfKids(new Random().nextInt(10));
		addChildInfo.checkSecondParentStudying();
		addChildInfo.inputSecondParentStudyingInstitution(randomText);
		addChildInfo.checkSecondParentHasDisability();
		addChildInfo.checkSecondParentDeclaredResidenceSameAsLiving();
		addChildInfo.clickButtonSaveAndContinue();
		driver.switchTo().alert().accept();
		
		// sugalvoti asserta
		
		
		
	}
}