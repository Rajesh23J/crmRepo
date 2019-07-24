package com.qa.util;

import com.qa.basePage.BasePage;

public class TestUtil extends BasePage{
	public static long Page_TimeOut = 20;
	public static long Imp_Wait = 10;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	

}
