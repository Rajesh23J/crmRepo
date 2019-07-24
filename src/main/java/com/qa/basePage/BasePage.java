package com.qa.basePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.TestUtil;

public class BasePage {
	public static Properties prop;
	public static WebDriver driver;
	public BasePage() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\ABC\\Music\\Java\\FreeCrmAutomation\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();	
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\ChromeDriver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Imp_Wait, TimeUnit.SECONDS);
		
	}

}
