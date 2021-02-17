package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EduKindergartenListPage extends AbstractPage {

	//buttons
	@FindBy (linkText = "Pridėti naują darželį")
	private WebElement clickButtonAddNewKindergarten;
	
	public EduKindergartenListPage(WebDriver driver) {
		super(driver);
	}
    
	public void clickButtonAddNewKindergarten() {
		clickButtonAddNewKindergarten.click();
	}
}
