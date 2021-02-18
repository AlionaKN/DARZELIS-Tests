package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EduHomePage extends AbstractPage{


	@FindBy (css = "#root > div > div > div > header > div > nav > ul > span")
	private WebElement successText;
	
	//buttons
	@FindBy (css = "#root > div > div > div > header > div > nav > ul > div > button")
	private WebElement buttonLogout;
	
	public EduHomePage(WebDriver driver) {
		super(driver);
	}
	public String getSuccessText () {
		return successText.getText();
	}
	public void clickButtonLogout () {
		buttonLogout.click();
	}
}
