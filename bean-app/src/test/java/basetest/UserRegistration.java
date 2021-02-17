//package basetest;
//
//import java.util.Random;
//
//import pages.AdminUserListPage;
//
//public class UserRegistration extends BaseTest {
//	private AdminUserListPage addNewUser = new AdminUserListPage(driver);
//	public String userName = "Testas";
//	public String userEmail = "test_" + new Random().nextInt(1000) + "@gmail.com";
//	
//	
//public void fillInUserDetailsWithSelectedRole(int role) {
////		
////		driver.get("http://akademijait.vtmc.lt:8181/bean-app/admin/registracija");
//////		addNewUser.clickLinkUserList();
//////		addNewUser.clickbuttonAddNewUser();
////		addNewUser.inputFirstName(userName);
////		addNewUser.inputLastName(userName);
////		addNewUser.inputEmail(userEmail);
////		addNewUser.selectRole(role);
////		addNewUser.clickbuttonRegister();
////}
////}