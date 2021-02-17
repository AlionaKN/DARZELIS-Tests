package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminEditUserPage extends AbstractPage {

	//inputFields
	@FindBy (xpath = "//*[@name=\"firstname\"]")
	private WebElement inputFirstName;
	
	@FindBy (xpath = "//*[@name=\"email\"]")
	private WebElement inputEmail;
	
	//buttons
	@FindBy (xpath = "//*[@class=\"btn btn-success\"]")
	private WebElement buttonSave;
	
	
	public AdminEditUserPage(WebDriver driver) {
		super(driver);
	}
    public void editFirstName(String firstName) {
    	inputFirstName.clear();
    	inputFirstName.sendKeys(firstName);
    }
    public void editEmail(String email) {
    	inputEmail.clear();
    	inputEmail.sendKeys(email);
    }
    public void clickButtonSave() {
    	buttonSave.click();
    }
}
