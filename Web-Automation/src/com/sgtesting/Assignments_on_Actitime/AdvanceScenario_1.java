package com.sgtesting.Assignments_on_Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario_1 {
	public static WebDriver o=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		login();
		minimize();
		CreateUser();  Logout();
		loginasuser1();  Logout1();
		loginasuser2();  Logout2();
		loginasuser3();  Logout3();
		loginasadmin();
		Modifyuser();     Logout4();
		loginasuser4(); 
		Logout5();
		loginasuser6(); Logout6();
		loginasuser7(); Logout7();
		loginasadmin1();
		Deleteuser();
		LogoutasAdmin();
		CloseApplication();
		
		
		
	}
	public static void LaunchBrowser()
	{
		try {
			o=new ChromeDriver();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void Navigate()
	{
		try {
			o.get("http://localhost:80/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			o.findElement(By.name("username")).sendKeys("admin");
			o.findElement(By.name("pwd")).sendKeys("manager");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void minimize()
	{
		try {
			o.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void CreateUser()
	{
		try {
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).sendKeys("demo1");
			o.findElement(By.name("lastName")).sendKeys("User1");
			o.findElement(By.name("email")).sendKeys("mani387171@gmail.com");
			o.findElement(By.name("username")).sendKeys("user1");
			o.findElement(By.name("password")).sendKeys("u1234");
			o.findElement(By.name("passwordCopy")).sendKeys("u1234");
			o.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).sendKeys("demo2");
			o.findElement(By.name("lastName")).sendKeys("User2");
			o.findElement(By.name("email")).sendKeys("mani3871@gmail.com");
			o.findElement(By.name("username")).sendKeys("user2");
			o.findElement(By.name("password")).sendKeys("u123");
			o.findElement(By.name("passwordCopy")).sendKeys("u123");
			o.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).sendKeys("demo3");
			o.findElement(By.name("lastName")).sendKeys("User3");
			o.findElement(By.name("email")).sendKeys("mani387@gmail.com");
			o.findElement(By.name("username")).sendKeys("user3");
			o.findElement(By.name("password")).sendKeys("u1239");
			o.findElement(By.name("passwordCopy")).sendKeys("u1239");
			o.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout1()
	{
		try {
			o.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser1()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user1");
			o.findElement(By.name("pwd")).sendKeys("u1234");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logout()
	{
		try {
			o.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser2()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user2");
			o.findElement(By.name("pwd")).sendKeys("u123");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logout2()
	{
		try {
			o.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser3()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user3");
			o.findElement(By.name("pwd")).sendKeys("u1239");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logout3()
	{
		try {
			o.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasadmin()
	{
		try {
			o.findElement(By.name("username")).sendKeys("admin");
			o.findElement(By.name("pwd")).sendKeys("manager");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Modifyuser()
	{
		try {
            o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
            Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			o.findElement(By.name("password")).sendKeys("mani");
			Thread.sleep(2000);
			o.findElement(By.name("passwordCopy")).sendKeys("mani");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();

			o.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("password")).sendKeys("shivu");
			Thread.sleep(2000);
			o.findElement(By.name("passwordCopy")).sendKeys("shivu");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();

            o.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
            Thread.sleep(2000);
			o.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			o.findElement(By.name("password")).sendKeys("suman");
			Thread.sleep(2000);
			o.findElement(By.name("passwordCopy")).sendKeys("suman");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout4()
	{
		try {
			o.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser4()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user1");
			o.findElement(By.name("pwd")).sendKeys("mani");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logout5()
	{
		try {
			o.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser6()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user2");
			o.findElement(By.name("pwd")).sendKeys("shivu");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logout6()
	{
		try {
			o.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser7()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user3");
			o.findElement(By.name("pwd")).sendKeys("suman");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Logout7()
	{
		try {
			o.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasadmin1()
	{
		try {
			o.findElement(By.name("username")).sendKeys("admin");
			o.findElement(By.name("pwd")).sendKeys("manager");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Deleteuser()
	{
		try {
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			o.switchTo().alert().accept();
			
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			o.switchTo().alert().accept();
			
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			o.switchTo().alert().accept();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LogoutasAdmin()
	{
		try {
			o.findElement(By.linkText("Logout")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void CloseApplication()
	{
		try {
			o.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	




}
