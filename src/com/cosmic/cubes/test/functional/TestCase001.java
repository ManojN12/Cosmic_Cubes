package com.cosmic.cubes.test.functional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cosmic.cubes.ui.LoginPage;

public class TestCase001 {
	WebDriver driver;

	 @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.setProperty("webdriver.gecko.driver", "E:\\Selenium Web driver\\SeleniumProject\\Cosmic_Cubes\\Browser_Server\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize(); 
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.get("http://demo.actitime.com");
	  }

	
  @Test
  public void f()
  {
	  LoginPage lp= new LoginPage(driver);
	  lp.getUserNameTextBox().sendKeys("admin");
	  lp.getPasswordTextBox().sendKeys("manager");
	  lp.getLoginButton().click();
  }
  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }

}
