package generictest;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basetest.BaseTest;
import pages.AdminAddNewUserPage;
import pages.AdminUserListPage;
import pages.EduAddNewKindergartenPage;
import pages.EduEditKindergartenDetailsPage;
import pages.EduKindergartenListPage;
import pages.LoginPage;
import pages.ParentAddChildDetailsPage;
import pages.ParentAddParentDetailsPage;
import pages.ParentEditParentDetailsPage;
import pages.ParentHomePage;

import utilities.FileWriterUtils;

public class GenericTestMethods extends BaseTest {

	public AdminUserListPage adminUserList = new AdminUserListPage(driver);
	private AdminAddNewUserPage addNewUser = new AdminAddNewUserPage(driver);
	private LoginPage loginPage = new LoginPage(driver);
	private ParentHomePage parentHomePage = new ParentHomePage(driver);
	private ParentAddParentDetailsPage addParentInfo = new ParentAddParentDetailsPage(driver);
	private ParentEditParentDetailsPage editParentInfoPage = new ParentEditParentDetailsPage(driver);
	private ParentAddChildDetailsPage addChildInfo = new ParentAddChildDetailsPage(driver);
	private EduKindergartenListPage kindergartenList = new EduKindergartenListPage(driver);
	private EduAddNewKindergartenPage addNewKindergarten = new EduAddNewKindergartenPage(driver);
	private EduEditKindergartenDetailsPage editKindergarten = new EduEditKindergartenDetailsPage(driver);
	public String userName = "Testas";
	public String userEmail = "test_" + new Random().nextInt(10000) + "@gmail.com";
	public String parentName = userName + "Tevas";
	private String childName = userName + "Vaikas";
	private String phoneNumber = String.format("+3706%07d", new Random().nextInt(10000000));
	private String childPersonCode = String.format("59%09d", new Random().nextInt(10000000));
	private String randomText = "InputText";
	private String kindergartenName = "DARZELIS " + new Random().nextInt(1000);
	private String kindergartenAddress = "Gatve 1";
	private String updatedKindergartenName = "updated " + kindergartenName;
	private String updated = "Updated";
	
	
	public void registerParent() {

		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/vartotojai");
		adminUserList.clickbuttonAddNewUser();
		addNewUser.inputFirstName(userName);
		addNewUser.inputLastName(userName);
		addNewUser.inputEmail(userEmail);
//		FileWriterUtils.writeToFile(userEmail);
		addNewUser.selectRole(1);
		addNewUser.clickbuttonRegister();
	}
	public void registerEdu() {

		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/vartotojai");
		adminUserList.clickbuttonAddNewUser();
		addNewUser.inputFirstName(userName);
		addNewUser.inputLastName(userName);
		addNewUser.inputEmail(userEmail);
//		FileWriterUtils.writeToFile(userEmail);
		addNewUser.selectRole(2);
		addNewUser.clickbuttonRegister();
	}
	
	public void login() {
		loginPage.openLoginPage();
		loginPage.inputEmail(userEmail);
		loginPage.inputPassword(userName);
		loginPage.clickButtonLogin();
	}
	public void addParentDetails() {
		
	
		parentHomePage.clickButtonParentForm();
		addParentInfo.inputFirstName(parentName);
		addParentInfo.inputLastName(parentName);
		addParentInfo.inputEmail(userEmail);
		addParentInfo.inputPhone(phoneNumber);
		addParentInfo.inputPersonalCode(String.format("49%09d", new Random().nextInt(10000000)));
		addParentInfo.inputCity(randomText);
		addParentInfo.inputStreet(randomText);
		addParentInfo.inputHouseNumber(new Random().nextInt(100) + 1);
		addParentInfo.inputFlatNumber(new Random().nextInt(50) + 1);
		addParentInfo.inputNumberOfKids(new Random().nextInt(10) + 1);
		addParentInfo.checkStudying();
		addParentInfo.inputStudyingInstitution("randomText");
		addParentInfo.checkHasaDisability();
		addParentInfo.checkDeclaredResidenceSameAsLiving();
		addParentInfo.clickButtonContinue();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
	}
	public void editParentDetails() {
		
	
		editParentInfoPage.inputFirstName(updated + parentName);
	     editParentInfoPage.inputEmail(updated + userEmail);
	     editParentInfoPage.inputNumberOfKids(new Random().nextInt(10) + 1);
	     editParentInfoPage.unCheckHasaDisability();
	     editParentInfoPage.clickButtonUpdate();
	     WebDriverWait wait = new WebDriverWait(driver, 5);
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        alert.accept();
	}
	
	public void addChildDetails() {
		

		addChildInfo.inputChildFirstName(childName);
		addChildInfo.inputChildLastName(childName);
		
//		addChildInfo.inputChildBirthDate("2014-03-21"); // sugalvoti kaip sugeneruoti
		addChildInfo.inputChildPersonCode(childPersonCode);
		addChildInfo.inputChildCity(randomText);
		addChildInfo.inputChildStreet(randomText);
		addChildInfo.inputChildHouseNumber(new Random().nextInt(100) + 1);
		addChildInfo.inputChildFlatNumber(new Random().nextInt(50) + 1);
		addChildInfo.checkAdopted();
		addChildInfo.checkAddSecondParent();
		addChildInfo.inputSecondParentFirstName(parentName);
		addChildInfo.inputSecondParentLastName(parentName);
		addChildInfo.inputSecondParentEmail(userEmail);
		addChildInfo.inputSecondParentPhone(phoneNumber);
		addChildInfo.inputSecondParentPersonCode(String.format("49%09d", new Random().nextInt(10000000)));
		addChildInfo.inputSecondParentCity(randomText);
		addChildInfo.inputSecondParentStreet(randomText);
		addChildInfo.inputSecondParentHouseNumber(new Random().nextInt(100) + 1);
		addChildInfo.inputSecondParentFlatNumber(new Random().nextInt(50) + 1);
		addChildInfo.inputSecondParentNumberOfKids(new Random().nextInt(10) + 1);
		addChildInfo.checkSecondParentStudying();
		addChildInfo.inputSecondParentStudyingInstitution(randomText);
		addChildInfo.checkSecondParentHasDisability();
		addChildInfo.checkSecondParentDeclaredResidenceSameAsLiving();
		addChildInfo.clickButtonSaveAndContinue();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
	}
	public void addNewKindergarten() {
		
		
		kindergartenList.clickButtonAddNewKindergarten();
		addNewKindergarten.inputKindergartenName(kindergartenName);
		addNewKindergarten.inputKindergartenAddress(kindergartenAddress);
		addNewKindergarten.inputSpotsInFirstAgeGroup(new Random().nextInt(50));
		addNewKindergarten.inputSpotsInSecondAgeGroup(new Random().nextInt(50));
		addNewKindergarten.clickButtonRegister();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
	}
	public void editKindergartenDetails() {
		List<WebElement> rows = driver
				.findElements(By.cssSelector("#root > div > div > table > tbody:nth-child(2) > tr"));

		for (int i = 0; i < rows.size(); i++) {
			String tempName = rows.get(i).findElement(By.cssSelector("td:nth-child(2)")).getText();
			if (tempName.equals(kindergartenName)) { 
				rows.get(i).findElement(By.cssSelector("td:nth-child(6) > a")).click();
				break;
			}

		}
		editKindergarten.inputKindergartenName(updatedKindergartenName); 
		editKindergarten.inputSpotsInFirstAgeGroup(new Random().nextInt(50));
		editKindergarten.clickButtonRegister();
	}
	public void deleteKindergarten() {
		List<WebElement> rows = driver
				.findElements(By.cssSelector("#root > div > div > table > tbody:nth-child(2) > tr"));

		for (int i = 0; i < rows.size(); i++) {
			String tempName = rows.get(i).findElement(By.cssSelector("td:nth-child(2)")).getText();
			if (tempName.equals(kindergartenName)) { 
				rows.get(i).findElement(By.cssSelector("td:nth-child(7)")).click();
				break;
			}

		}
		for(int i =0; i < rows.size(); i++) {
			  String tempNametwo = rows.get(i).findElement(By.cssSelector("td:nth-child(8) > div > div > div > div > h5")).getText();
			  if (tempNametwo.equals(kindergartenName)) {
				  rows.get(i).findElement(By.cssSelector("td:nth-child(8) > div > div > div > div:nth-child(3)> button.btn.btn-danger")).click();
			  break;
			  }
	}
	}
	public void addSubmitionToKindergartenForm() {
		
	}
}
