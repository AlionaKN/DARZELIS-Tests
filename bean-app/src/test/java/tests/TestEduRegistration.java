package tests;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import basetest.BaseTest;
import generictest.GenericTestMethods;
import pages.AdminAddNewUserPage;
import pages.AdminUserListPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestEduRegistration extends GenericTestMethods {
	private AdminUserListPage adminUserList = new AdminUserListPage(driver);
	private AdminAddNewUserPage addNewUser = new AdminAddNewUserPage(driver);


	@Test
	public void successfulEduRegistrationByAdmin() {

		registerEdu();
		String successText = addNewUser.getSuccessText();
		assertEquals("No success message located", "Registracija sėkminga.", successText);

	}

	@Test

	public void unsuccessfulEduRegistrationByAdminWithEmptyFields() {

//		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/pradzia");
//		addNewUser.clickLinkUserList();
		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/vartotojai");
		adminUserList.clickbuttonAddNewUser();
		addNewUser.inputFirstName("");
		addNewUser.inputLastName("");
		addNewUser.inputEmail(userEmail);
		addNewUser.selectRole(2);
		addNewUser.clickbuttonRegister();

		String alertMessage = driver.switchTo().alert().getText();

		assertEquals("No success message located", "Užpildykite visus laukus!", alertMessage);
		driver.switchTo().alert().accept();

	}

	@Test

	public void unsuccessfulEduRegistrationByAdminWithInvalidData() {

//	driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/pradzia");
//	addNewUser.clickLinkUserList();
		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/vartotojai");
		adminUserList.clickbuttonAddNewUser();
		addNewUser.inputFirstName("A");
		addNewUser.inputLastName("A2");
		addNewUser.inputEmail(userEmail);
		addNewUser.selectRole(2);
		addNewUser.clickbuttonRegister();

		String alertMessage = driver.switchTo().alert().getText();

		assertEquals("No success message/or incorrect one",
				"Registracija nesėkminga! Pasitikrinkite ar pažymėjote bei užpildėte laukus teisingai. ", alertMessage);
		driver.switchTo().alert().accept();
	}
}
