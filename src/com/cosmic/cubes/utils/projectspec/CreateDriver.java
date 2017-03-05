package com.cosmic.cubes.utils.projectspec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cosmic.cubes.utils.generic.GetData;
import com.cosmic.cubes.utils.generic.GetData1;

public class CreateDriver {
	public static WebDriver getDriver()
	{
		WebDriver driver=null;
		String browserName=GetData1.fromExcel("E://Selenium Web driver/tdata.xlsx", "Sheet1",1,0);
		String URL=GetData1.fromExcel("E://Selenium Web driver/tdata.xlsx", "Sheet1" ,1, 1);
		if(browserName.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Web driver\\geckodriver-v0.11.1-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("gc"))
		{
			System.setProperty("webdriver.chrome.driver","./Browser_Server/chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		else
	
		{
			System.out.println("invalid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
	}

}
