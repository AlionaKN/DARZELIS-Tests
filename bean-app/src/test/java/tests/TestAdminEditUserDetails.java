package tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basetest.BaseTest;
import pages.AdminEditUserPage;
import pages.AdminUserListPage;
import pages.ParentHomePage;
import pages.LoginPage;

public class TestAdminEditUserDetails extends BaseTest {
	private AdminUserListPage adminUserList = new AdminUserListPage(driver);
	private AdminEditUserPage adminEditUser = new AdminEditUserPage(driver);
	private LoginPage loginPage = new LoginPage(driver);
	private ParentHomePage parentHomePage = new ParentHomePage(driver);
	private TestParentRegistration parentRegistration = new TestParentRegistration();
	String updatedName = "updated" + parentRegistration.userName;
	String updatedEmail = "updated" + parentRegistration.userEmail;
	@Test

	public void successfulUserEditionByAdmin() throws IOException {
		parentRegistration.successfulParentRegistrationByAdmin();
		adminUserList.clickLinkUserList();

		List<WebElement> rows = driver
				.findElements(By.cssSelector("#root > div > div > table > tbody:nth-child(2) > tr"));

		for (int i = 0; i < rows.size(); i++) {
			String tempName = rows.get(i).findElement(By.cssSelector("td:nth-child(4)")).getText();
			if (tempName.equals(parentRegistration.userEmail)) {
				rows.get(i).findElement(By.cssSelector("td:nth-child(6) > a")).click();
				break;
			}

		}
		adminEditUser.editFirstName(updatedName);
		adminEditUser.editEmail(updatedEmail);
		adminEditUser.clickButtonSave();
		loginPage.openLoginPage();
		loginPage.inputEmail(updatedEmail);
		loginPage.inputPassword(parentRegistration.userName);
		loginPage.clickButtonLogin();

		String successLogInText = parentHomePage.getSuccessText();
		assertTrue("Chart does not contain expected text", successLogInText.contains("Esate prisijungęs"));
		parentHomePage.clickButtonLogout();
	}
}