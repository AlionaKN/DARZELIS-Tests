package tests;

import java.io.IOException;
import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basetest.BaseTest;
import generictest.GenericTestMethods;
import pages.LoginPage;
import pages.ParentAddChildDetailsPage;
import pages.ParentHomePage;

public class TestParentAddChildDetails extends GenericTestMethods {

	private ParentHomePage parentHomePage = new ParentHomePage(driver);


	@Test

	public void successfulChildInfoAddition() throws IOException {
		registerParent();
		login();
		addParentDetails();
		WebElement element = parentHomePage.buttonChildForm;
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element).click().perform();
	    addChildDetails();
//	    parentHomePage.clickButtonLogout();
		// sugalvoti asserta
		
		
		
	}
}