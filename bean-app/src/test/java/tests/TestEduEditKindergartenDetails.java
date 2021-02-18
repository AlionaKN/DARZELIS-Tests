package tests;



import org.junit.Test;

import generictest.GenericTestMethods;


public class TestEduEditKindergartenDetails extends GenericTestMethods {
	
	@Test
	
	public void successfulKindergartenDetailsEdit () {
		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/edu/darzeliai");
		addNewKindergarten();
		editKindergartenDetails();
		
	}
	
}
