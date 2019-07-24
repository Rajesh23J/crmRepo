package freeCrmTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.basePage.BasePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends BasePage {
	LoginPage loginPage;
	BasePage basePage;
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	@Test
	public void loginPageTitleTest() {
		String title = loginPage.loginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	@Test 
	public void imageTitleTest() {
		loginPage.imageTitle();
	}
	@Test
	public void loginDetailsTest() {
		loginPage.loginDetails(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	

}
