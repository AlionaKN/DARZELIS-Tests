package tests;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basetest.BaseTest;
import generictest.GenericTestMethods;

public class TestEduDeleteKindergarten extends GenericTestMethods{


	
	@Test
	
	public void successfulKindergartenDeletion() {
		
		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/edu/darzeliai");
		addNewKindergarten();
		deleteKindergarten();
		
	}
}
