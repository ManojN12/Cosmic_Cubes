package com.cosmic.cubes.test.regression;

import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

import com.cosmic.cubes.ui.LoginPage;
import com.cosmic.cubes.utils.projectspec.CreateDriver;

//step1

public class TestLoginSC_01
{
	//step2
	WebDriver driver;
	//step3
	LoginPage login;
	
	//step4

	@BeforeMethod
	public void setUp()
	{
		driver= CreateDriver.getDriver();
		login=new LoginPage(driver);
	}
	//step5
	@Test
	public void testInvalidLoginTC_05()
	{
		login.waitForLoginPage();
		login.getUserNameTextBox().sendKeys("admin");
		login.getPasswordTextBox().sendKeys("34dgg");
		login.getLoginButton().click();
		String actualerrmsg=login.getErrorMessageText().getText();
		String expectederrmsg="Username or Password is invalid. Please try again.";
		Assert.assertEquals(actualerrmsg, expectederrmsg);
	}
	//step6
@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
	