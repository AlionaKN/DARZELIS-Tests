package tests;

import java.io.IOException;
import java.util.Random;

import org.junit.FixMethodOrder;
import org.junit.Test;
import static org.junit.Assert.*;

import basetest.BaseTest;
import pages.AdminAddNewUserPage;
import pages.AdminUserListPage;
import utilities.FileWriterUtils;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ParentRegistration extends BaseTest {
	private AdminUserListPage adminUserList = new AdminUserListPage(driver);
	private AdminAddNewUserPage addNewUser = new AdminAddNewUserPage(driver);
	public String userName = "Testas";
	public String userEmail = "test_" + new Random().nextInt(1000) + "@gmail.com";

	@Test

	public void successfulParentRegistrationByAdmin() throws IOException {

//		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/pradzia");
//		addNewUser.clickLinkUserList();
		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/vartotojai");
		adminUserList.clickbuttonAddNewUser();
		addNewUser.inputFirstName(userName);
		addNewUser.inputLastName(userName);
		addNewUser.inputEmail(userEmail);
		FileWriterUtils.writeToFile(userEmail);
		addNewUser.selectRole(1);
		addNewUser.clickbuttonRegister();
		String successText = addNewUser.getSuccessText();
		assertEquals("No success message located", "Registracija sėkminga.", successText);

	}

	@Test

	public void unsuccessfulParentRegistrationByAdminWithEmptyFields() {

//		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/pradzia");
//		addNewUser.clickLinkUserList();
		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/vartotojai");
		adminUserList.clickbuttonAddNewUser();
		addNewUser.inputFirstName("");
		addNewUser.inputLastName("");
		addNewUser.inputEmail(userEmail);
		addNewUser.selectRole(1);
		addNewUser.clickbuttonRegister();

		String alertMessage = driver.switchTo().alert().getText();

		assertEquals("No success message located", "Užpildykite visus laukus!", alertMessage);
		driver.switchTo().alert().accept();

	}

	@Test

	public void unsuccessfulParentRegistrationByAdminWithInvalidData() {

//	driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/pradzia");
//	addNewUser.clickLinkUserList();
		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/vartotojai");
		adminUserList.clickbuttonAddNewUser();
		addNewUser.inputFirstName("A");
		addNewUser.inputLastName("A2");
		addNewUser.inputEmail(userEmail);
		addNewUser.selectRole(1);
		addNewUser.clickbuttonRegister();

		String alertMessage = driver.switchTo().alert().getText();

		assertEquals("No success message/or incorrect one",
				"Registracija nesėkminga! Pasitikrinkite ar pažymėjote bei užpildėte laukus teisingai. ", alertMessage);
		driver.switchTo().alert().accept();
	}
}
