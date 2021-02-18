package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParentHomePage extends AbstractPage {

	@FindBy (css = "#root > div > div > div > header > div > nav > ul > span")
	private WebElement successText;
	
	@FindBy (css = "#root > div > div > div > header > div > nav > ul > div > button")
	private WebElement buttonLogout;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div/div/div[2]/div[1]/a")
	private WebElement buttonParentForm;
	
	@FindBy (css = "#parentForm")
	private WebElement buttonEditParentForm;
	
	@FindBy (id = "childForm")
	public WebElement buttonChildForm;
	
	@FindBy (id = "mainRegForm")
	public WebElement buttonRegisterToKindergartenForm;
	
	public ParentHomePage(WebDriver driver) {
		super(driver);
	}
	public String getSuccessText () {
		return successText.getText();
	}
	public void clickButtonLogout() {
		buttonLogout.click();
	}
	public void clickButtonParentForm() {
		buttonParentForm.click();
	}
	public void clickButtonEditParentForm() {
		buttonEditParentForm.click();
	}
	public void clickButtonChildForm() {
		buttonChildForm.click();
	}
	public void clickButtonRegisterToKindergartenForm() {
		buttonRegisterToKindergartenForm.click();
	}
}
