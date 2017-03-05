package com.cosmic.cubes.test.functional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.gecko.driver", "E:\\Selenium Web driver\\SeleniumProject\\Cosmic_Cubes\\Browser_Server\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com");
  }
  @Test
  public void testFacebook() throws InterruptedException
  {
	  driver.findElement(By.id("email")).sendKeys("manojn48@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Nivimanoj12@",Keys.ENTER);
	  Thread.sleep(5000);
	  String actual1=driver.getTitle();
	  String expected1="Facebook";
	  Assert.assertEquals(actual1, expected1);
	
	  
  }

  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }

}
