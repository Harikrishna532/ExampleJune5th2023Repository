package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
     private static WebDriver oBrowser = null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		UserName();
		Password();
		Submit();
		
	}
	private static void LaunchBrowser()
	{
		try
		{
			oBrowser = new ChromeDriver();
		}catch (Exception e)
		{
		   e.printStackTrace();	
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///C:/Users/Karthik/Downloads/xpath_and_sample_application%20(1)/Sample.html");
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void UserName()
	{
		try
		{
			oBrowser.findElement(By.id("uid1user1name1")).sendKeys("Hari");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("pwd1pass1word1")).sendKeys("Krishna");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("btn1submit1button1")).click();
			Thread.sleep(3000);
		}catch (Exception e)
		{
		    e.printStackTrace();
		}
	}
	
	private static void Password()
	{
		try
		{
			oBrowser.findElement(By.id("pwd1pass1word1")).sendKeys("Krishna");
			Thread.sleep(4000);
		}catch (Exception e)
		{
		    e.printStackTrace();
		}
	}
	
	private static void Submit()
	{
		try
		{
			oBrowser.findElement(By.id("btn1submit1button1")).click();
			Thread.sleep(2000);

			Thread.sleep(2000);
		}catch (Exception e)
		{
           e.printStackTrace();           
		}
	}
	

	

	
	

}
