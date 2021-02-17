package tests;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basetest.BaseTest;

public class EduDeleteKindergarten extends BaseTest{

	EduAddNewKindergarten addNewKindergarten = new EduAddNewKindergarten();
	
	@Test
	
	public void successfulKindergartenDeletion() {
		
		addNewKindergarten.successfulNewKindergartenAddition();
		List<WebElement> rows = driver
				.findElements(By.cssSelector("#root > div > div > table > tbody:nth-child(2) > tr"));

		for (int i = 0; i < rows.size(); i++) {
			String tempName = rows.get(i).findElement(By.cssSelector("td:nth-child(2)")).getText();
			if (tempName.equals(addNewKindergarten.name)) { 
				rows.get(i).findElement(By.cssSelector("td:nth-child(7)")).click();
				break;
			}

		}
		for(int i =0; i < rows.size(); i++) {
			  String tempNametwo = rows.get(i).findElement(By.cssSelector("td:nth-child(8) > div > div > div > div > h5")).getText();
			  if (tempNametwo.equals(addNewKindergarten.name)) {
				  rows.get(i).findElement(By.cssSelector("td:nth-child(8) > div > div > div > div:nth-child(3)> button.btn.btn-danger")).click();
			  break;
			  }
	}
	}
}
