package com.cosmic.cubes.test.regression;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshot 
{
@Test
public void screenshot()
{
	System.setProperty("webdriver.gecko.driver", "E:\\Selenium Web driver\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize(); 
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("https://www.google.com");
	 File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 try
	 {
	 FileUtils.copyFile(scr, new File("E:/error.png"));
	 }
	 catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
}
}
