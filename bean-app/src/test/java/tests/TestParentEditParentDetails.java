package tests;

import java.io.IOException;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generictest.GenericTestMethods;
import pages.ParentHomePage;

public class TestParentEditParentDetails extends GenericTestMethods {
	private ParentHomePage parentHomePage = new ParentHomePage(driver);
	

	
	@Test
	
	public void successfulParentInfoEdit () throws IOException {
		
     registerParent();
     login();
     addParentDetails();
     WebElement element = driver.findElement(By.xpath("//*[@id=\"parentForm\"]"));
     Actions actions = new Actions(driver);
     actions.moveToElement(element).click().perform();
     editParentDetails();
     parentHomePage.clickButtonLogout();
    
		// ideti validacija, sugalvot kaip panaudot jau egzituojancius emailus kad neregistruot kiekviena syki
		
		
		
	}
}
