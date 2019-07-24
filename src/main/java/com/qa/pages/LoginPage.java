package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.basePage.BasePage;

public class LoginPage extends BasePage{
	@FindBy(xpath="//div/input[@name='username']")
	WebElement username;
	@FindBy(xpath="//div/input[@name='password']")
	WebElement password;
	@FindBy(xpath="//div/input[@type='submit']")
	WebElement sumitBtm;
	@FindBy(xpath="//*[@class='img-responsive']")
	WebElement crmLogo;
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String loginPageTitle() {
		 return driver.getTitle();	
	}
	public void imageTitle() {
		boolean img = crmLogo.isDisplayed();
		System.out.println(img);
		
	}
	public HomePage loginDetails(String un,String pass) {
		username.sendKeys(un);
		password.sendKeys(pass);
		sumitBtm.click();
		
		return new HomePage();
	}
	
	

}
