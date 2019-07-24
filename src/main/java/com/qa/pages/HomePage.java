package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.basePage.BasePage;

public class HomePage extends BasePage{
	@FindBy(xpath="//td[contains(text(),'User: Rajesh R ' )]")
	WebElement userNameLabel;
	@FindBy(xpath="//*[@title='Contacts']")
	WebElement contactsLink;
	@FindBy(xpath="//td[contains(text(),'CRMPRO')]")
	WebElement logoText;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public boolean userNameTitle() {
		return userNameLabel.isDisplayed();
		
	}
	public WebElement imageLogo() {
		boolean img = logoText.isDisplayed();
		System.out.println(img);
		return logoText;
	}
	public ContactsPage contactsPageLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	

}
