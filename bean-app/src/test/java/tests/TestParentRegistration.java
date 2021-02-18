package tests;

import java.io.IOException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import static org.junit.Assert.*;

import pages.AdminAddNewUserPage;

import org.junit.runners.MethodSorters;

import generictest.GenericTestMethods;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestParentRegistration extends GenericTestMethods {

	private AdminAddNewUserPage addNewUser = new AdminAddNewUserPage(driver);


	@Test

	public void successfulParentRegistrationByAdmin() throws IOException {
		
		registerParent();
		String successText = addNewUser.getSuccessText();
		assertEquals("No success message located", "Registracija sėkminga.", successText);

	}

//	@Test
//
//	public void unsuccessfulParentRegistrationByAdminWithEmptyFields() {
//
////		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/pradzia");
////		addNewUser.clickLinkUserList();
//		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/vartotojai");
//		adminUserList.clickbuttonAddNewUser();
//		addNewUser.inputFirstName("");
//		addNewUser.inputLastName("");
//		addNewUser.inputEmail(userEmail);
//		addNewUser.selectRole(1);
//		addNewUser.clickbuttonRegister();
//
//		String alertMessage = driver.switchTo().alert().getText();
//
//		assertEquals("No success message located", "Užpildykite visus laukus!", alertMessage);
//		driver.switchTo().alert().accept();
//
//	}
//
//	@Test
//
//	public void unsuccessfulParentRegistrationByAdminWithInvalidData() {
//
////	driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/pradzia");
////	addNewUser.clickLinkUserList();
//		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/vartotojai");
//		adminUserList.clickbuttonAddNewUser();
//		addNewUser.inputFirstName("A");
//		addNewUser.inputLastName("A2");
//		addNewUser.inputEmail(userEmail);
//		addNewUser.selectRole(1);
//		addNewUser.clickbuttonRegister();
//
//		String alertMessage = driver.switchTo().alert().getText();
//
//		assertEquals("No success message/or incorrect one",
//				"Registracija nesėkminga! Pasitikrinkite ar pažymėjote bei užpildėte laukus teisingai. ", alertMessage);
//		driver.switchTo().alert().accept();
//	}
}
