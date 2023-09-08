package com.sgtesting.Assignments_on_Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CretCust_CretProj_CretTask_Ass7 {
	public static WebDriver OBrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreateCustomer();
		CreateProject();
		 Createtask();

	}
	private static void launchBrowser()
	{
		try
		{
			OBrowser=new ChromeDriver();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			OBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			OBrowser.findElement(By.id("username")).sendKeys("admin");
			OBrowser.findElement(By.name("pwd")).sendKeys("manager");
			OBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			OBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void CreateCustomer()
	{
		try {
			OBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]")).click();
			Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]"));
			//Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("arif");
			Thread.sleep(2000);
			OBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("customer created successfully");
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void CreateProject()
	{
		try {
			OBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Actitime");
			Thread.sleep(2000);


			OBrowser.findElement(By.name("projectDescriptionField")).sendKeys("sg testing");
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Createtask()
	{
		try
		{
			
			OBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("123");
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")).sendKeys("xyz");
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//span[text()='Create Tasks']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
