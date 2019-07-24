package freeCrmTest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.basePage.BasePage;
import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;


public class HomePageTest extends BasePage{
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		contactsPage = new ContactsPage();
		testUtil  = new TestUtil();
		homePage = loginPage.loginDetails(prop.getProperty("username"), "password");
	}
	@Test
	public void userNameTitleTest() {
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.userNameTitle());
	}
	@Test
	public void imageLogoTest() {
		homePage.imageLogo();
	}
	@Test
	public void contactsPageLinkTest() {
		testUtil.switchToFrame();
		contactsPage = homePage.contactsPageLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
