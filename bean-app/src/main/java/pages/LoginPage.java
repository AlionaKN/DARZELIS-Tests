package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

	@FindBy (id = "InputEmail")
	private WebElement inputEmail;
	
	@FindBy (id = "InputPassword")
	private WebElement inputPassword;
	
	@FindBy (xpath = "//*[@type=\"submit\"]")
	private WebElement buttonLogin;
	
	private String loginUrl = "http://akademijait.vtmc.lt:8181/bean-app/";

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void openLoginPage () {
		driver.get(loginUrl);
	}
	public void inputEmail (String email) {
    	inputEmail.sendKeys(email);
    }
	public void inputPassword (String password) {
    	inputPassword.sendKeys(password);
    }
    
	public void clickButtonLogin () {
		buttonLogin.click();
	}
	
	
}
