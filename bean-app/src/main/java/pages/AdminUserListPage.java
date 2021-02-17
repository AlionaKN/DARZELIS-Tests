package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AdminUserListPage extends AbstractPage{
	
// links
	@FindBy (linkText = "Vartotojų sąrašas")
	private WebElement linkUserList;

	
// buttons	
	@FindBy (css = "a.btn")
	private WebElement buttonAddNewUser;
	
	@FindBy (css = "#root > div > div > div.fixed-top.d-flex.justify-content-end.mt-3.mr-5 > button")
	private WebElement buttonLogout;
	
	List <WebElement> rows = driver.findElements(By.cssSelector("#root > div > div > table > tbody:nth-child(2) > tr" ));
	
	public AdminUserListPage(WebDriver driver) {
		super(driver);
	}
    public void clickLinkUserList () {
    	linkUserList.click();
    }
    public void clickbuttonAddNewUser () {
    	buttonAddNewUser.click();
    }
    
    public void clickButtonLogout() {
    	buttonLogout.click();
    }
    
//    public void clickButtonDelete(String email) {
//    	for(int i =0; i < rows.size(); i++) {
//			  String tempName = rows.get(i).findElement(By.cssSelector("td:nth-child(4)")).getText();
//			  if (tempName.equals(email)) {
//				  rows.get(i).findElement(By.cssSelector("td:nth-child(7) > button")).click();
//			  break;
//			  }
//			  
//		  }
//    }
//    public void clickButtonConfirmDelete(String email) {
//    	for(int i =0; i < rows.size(); i++) {
//			  String tempNametwo = rows.get(i).findElement(By.cssSelector("td:nth-child(8) > div > div > div > div > h5")).getText();
//			  if (tempNametwo.equals(email)) {
//				  rows.get(i).findElement(By.cssSelector("td:nth-child(8) > div > div > div > div:nth-child(3)> button.btn.btn-danger")).click();
//			  break;
//			  }
//	}
//    }
}
