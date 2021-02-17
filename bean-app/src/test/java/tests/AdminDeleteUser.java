package tests;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import basetest.BaseTest;
import pages.AdminUserListPage;


public class AdminDeleteUser extends BaseTest{
	private AdminUserListPage adminUserList = new AdminUserListPage(driver);
	private ParentRegistration parentRegistration = new ParentRegistration();
	
	@Test
	public void successfulUserDeletionByAdmin () throws IOException {
		parentRegistration.successfulParentRegistrationByAdmin();
//		adminUserList.clickLinkUserList(); 
		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/vartotojai");
	
		
		List <WebElement> rows = driver.findElements(By.cssSelector("#root > div > div > table > tbody:nth-child(2) > tr" ));
		  
		  for(int i =0; i < rows.size(); i++) {
			  String tempName = rows.get(i).findElement(By.cssSelector("td:nth-child(4)")).getText();
			  if (tempName.equals(parentRegistration.userEmail)) {
				  rows.get(i).findElement(By.cssSelector("td:nth-child(7) > button")).click();
			  break;
			  }
			  
		  }
		  for(int i =0; i < rows.size(); i++) {
			  String tempNametwo = rows.get(i).findElement(By.cssSelector("td:nth-child(8) > div > div > div > div > h5")).getText();
			  if (tempNametwo.equals(parentRegistration.userEmail)) {
				  rows.get(i).findElement(By.cssSelector("td:nth-child(8) > div > div > div > div:nth-child(3)> button.btn.btn-danger")).click();
			  break;
			  }
	}
		  adminUserList.clickButtonLogout();
	}
}
