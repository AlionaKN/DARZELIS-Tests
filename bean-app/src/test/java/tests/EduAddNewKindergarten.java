package tests;

import java.util.Random;

import org.junit.Test;

import basetest.BaseTest;
import pages.EduAddNewKindergartenPage;
import pages.EduKindergartenListPage;

public class EduAddNewKindergarten extends BaseTest {

	private EduKindergartenListPage kindergartenList = new EduKindergartenListPage(driver);
	private EduAddNewKindergartenPage addNewKindergarten = new EduAddNewKindergartenPage(driver);
	
	public String name = "DARZELIS " + new Random().nextInt(100);
	private String address = "Street 1";
	
	@Test
	
	public void successfulNewKindergartenAddition() {
		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/edu/darzeliai");
		kindergartenList.clickButtonAddNewKindergarten();
		addNewKindergarten.inputKindergartenName(name);
		addNewKindergarten.inputKindergartenAddress(address);
		addNewKindergarten.inputSpotsInFirstAgeGroup(new Random().nextInt(50));
		addNewKindergarten.inputSpotsInSecondAgeGroup(new Random().nextInt(50));
		addNewKindergarten.clickButtonRegister();
		driver.switchTo().alert().accept();
		
		// reiks asserto
		// reik skaiciaus generatoriaus be nulio
	}
	
	
}
