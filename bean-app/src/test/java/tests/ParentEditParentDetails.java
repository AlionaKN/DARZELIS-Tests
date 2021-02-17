package tests;

import java.io.IOException;
import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basetest.BaseTest;
import pages.LoginPage;
import pages.ParentEditParentDetailsPage;
import pages.ParentHomePage;

public class ParentEditParentDetails extends BaseTest
{
//	private ParentLogin parentLogin = new ParentLogin();
	private ParentHomePage parentHomePage = new ParentHomePage(driver);
	private ParentEditParentDetailsPage editParentInfoPage = new ParentEditParentDetailsPage(driver);
	private ParentAddParentDetails addParentInfo = new ParentAddParentDetails();

	
	@Test
	
	public void successfulParentInfoEdit () throws IOException {
		
     addParentInfo.successfulParentDetailsSubmition();
     WebElement element = driver.findElement(By.xpath("//*[@id=\"parentForm\"]"));
     Actions actions = new Actions(driver);
     actions.moveToElement(element).click().perform();
//     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"parentForm\"]"))).click();
//     parentHomePage.clickButtonEditParentForm();
     editParentInfoPage.inputFirstName("Updated" + addParentInfo.parentName);
     editParentInfoPage.inputEmail("Updated" + addParentInfo.parentEmail);
     editParentInfoPage.inputNumberOfKids(2);
     editParentInfoPage.unCheckHasaDisability();
     editParentInfoPage.clickButtonUpdate();
     WebDriverWait wait = new WebDriverWait(driver, 5);
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
     alert.accept();
     
    


		
		// ideti validacija, sugalvot kaip panaudot jau egzituojancius emailus kad neregistruot kiekviena syki
		
		
		
	}
}
