package tests;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basetest.BaseTest;
import pages.EduEditKindergartenDetailsPage;


public class EduEditKindergartenDetails extends BaseTest {

	private EduAddNewKindergarten addNewKindergarten = new EduAddNewKindergarten();
	
	private EduEditKindergartenDetailsPage editKindergarten = new EduEditKindergartenDetailsPage(driver);
	String updatedName = "updated " + addNewKindergarten.name;
	String updatedEmail = "updated";
	@Test
	
	public void successfulKindergartenDetailsEdit () {
		
//		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/edu/darzeliai"); // kai bus sutvarkytas puslapis tobuitni
		//reikia sutvarkyt kad registruot ir tada redaguot
		
		addNewKindergarten.successfulNewKindergartenAddition();
		List<WebElement> rows = driver
				.findElements(By.cssSelector("#root > div > div > table > tbody:nth-child(2) > tr"));

		for (int i = 0; i < rows.size(); i++) {
			String tempName = rows.get(i).findElement(By.cssSelector("td:nth-child(2)")).getText();
			if (tempName.equals(addNewKindergarten.name)) { //reiks patobulint kad prideti sukurta darzeli
				rows.get(i).findElement(By.cssSelector("td:nth-child(6) > a")).click();
				break;
			}

		}
		editKindergarten.inputKindergartenName(updatedName); 
		editKindergarten.inputSpotsInFirstAgeGroup(new Random().nextInt(50));
		// reikia generatoriaus be nulio
		editKindergarten.clickButtonRegister();
		
	}
	
	
	
}
