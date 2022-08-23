package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
           static ExtentTest test;

	public static void custom_sendkeys(WebElement element,String value,String fieldname) {
		try {
		          element.sendKeys(value);
		          test.log(Status.PASS,fieldname +"Value succesfully Send =="+value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
	}
	public static void custom_click(WebElement element,String fieldname) {
		
		try {
			element.click();
			test.log(Status.PASS, "clicked succesfully=="+fieldname);
			}catch(Exception e) {
				test.log(Status.FAIL,e.getMessage());
		}
		
	}
	
	//for example
	public static void custom_HandleDropDown(WebElement element,String text) {
		try {
		Select select=new Select(element);
		select.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	//for example
	public static void custom_HandleMouseOver_click(WebDriver driver,WebElement element) {
		try {
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
}


			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
	

