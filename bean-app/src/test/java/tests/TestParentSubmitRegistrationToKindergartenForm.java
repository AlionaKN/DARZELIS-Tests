package tests;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generictest.GenericTestMethods;
import pages.ParentAddKindergartenSubmitionFormPage;
import pages.ParentHomePage;

public class TestParentSubmitRegistrationToKindergartenForm extends GenericTestMethods{
	private ParentHomePage parentHomePage = new ParentHomePage(driver);
	private ParentAddKindergartenSubmitionFormPage submitFormToKindergarten = new ParentAddKindergartenSubmitionFormPage(driver);
	@Test
	
	public void successfulFormToKindergartenSubmition() {
		
		registerParent();
		login();
		addParentDetails();
		addChildDetails();
		WebElement element = parentHomePage.buttonRegisterToKindergartenForm;
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element).click().perform();
	    submitFormToKindergarten.selectChild(1);
	    submitFormToKindergarten.selectKindergarten1(1);
	    submitFormToKindergarten.selectKindergarten2(2);
	    submitFormToKindergarten.selectKindergarten3(3);
	    submitFormToKindergarten.selectKindergarten4(4);
	    submitFormToKindergarten.selectKindergarten5(5);
	    submitFormToKindergarten.clickButtonSubmit();
	    WebDriverWait wait = new WebDriverWait(driver, 5);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
	}
}
