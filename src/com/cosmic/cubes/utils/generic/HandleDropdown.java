package com.cosmic.cubes.utils.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown
{
public static void selectDDLByIndex(WebElement dd1,int index)
{
	Select sct= new Select(dd1);
	sct.selectByIndex(index);
}
public static void selectDDLByValue(WebElement dd1,String Value)
{
	Select sct= new Select(dd1);
	sct.selectByValue(Value);
}
public static void selectDDLByVisibleText(WebElement dd1,String text)
{
	Select sct= new Select(dd1);
	sct.selectByVisibleText(text);
}
public static boolean verifyDropdown(WebElement dd1)
{
	Select sct= new Select(dd1);
	boolean status=sct.isMultiple();
	return status;
}
public static void deselectDDLByIndex(WebElement dd1,int index)
{
	Select sct= new Select(dd1);
	try
	{
	sct.deselectByIndex(index);
	}
	catch(Exception e){
		System.out.println("Invalid Operation");
	}
}
public static void deselectDDLByValue(WebElement dd1,int Value)
{
	Select sct= new Select(dd1);
	try
	{
		sct.deselectByIndex(Value);
	
	}
	catch(Exception e){
		System.out.println("Invalid Operation");
	}
}
public static void deselectDDLByVisibleText(WebElement dd1,String text)
{
	Select sct= new Select(dd1);
	try
	{
	sct.deselectByVisibleText(text);
	}
	catch(Exception e){
		System.out.println("Invalid Operation");
	}
}
public static void deSelectAllOptions(WebElement dd1)
{
	Select sct=new Select(dd1);
	try
	{
	sct.deselectAll();
	}
	catch(Exception e){
		System.out.println("Invalid Operation");
	
}

}

}