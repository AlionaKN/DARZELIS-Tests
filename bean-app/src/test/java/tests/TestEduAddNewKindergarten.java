package tests;



import org.junit.Test;

import generictest.GenericTestMethods;

public class TestEduAddNewKindergarten extends GenericTestMethods {
	
	@Test
	
	public void successfulNewKindergartenAddition() {
		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/edu/darzeliai");
		addNewKindergarten();
		
		// reiks asserto

	}
	
	
}
