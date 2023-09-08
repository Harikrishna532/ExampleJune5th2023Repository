package com.sgtesting.Assignments_on_Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario_2 {
	public static WebDriver s=null;
	public static void main(String[] args) {
		LaunchBroweser(); 
		Navigate();
		login();  
		minimize();
		CreateUser1();
		Logoutasadmin();
		Loginasuser1();
		Createuser2();
		LogoutasUser1();
		Loginasuser2(); 
		Createuser3();
		LogoutasUser2();
		Loginasuser3();
		Loginasuser20(); 
		Modifypassforuser3();
		LogoutasUser22();
		Loginasuser30();
		LogoutasUser30(); 
		Loginasuser10();
		Modifyuserpassforuser2();
		LogoutasUser10();
		Loginasuser21();
		Logout();  
		loginad();
		Modifyuser1(); 
		Logoutasadmin1();
		Loginasuser11();
		LogoutasUser11();
		Loginasuser22();
		deleteUser3();
		logout_f();
		loginUser_g();
		DeleteUser2();
		logout_h();
		login_i();
		DeleteUser1();
		logout_j();
		close();
	}
	private static void LaunchBroweser()
	{
		try {
			s=new ChromeDriver();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try {
			s.get("http://localhost:80/login.do");
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			s.findElement(By.name("username")).sendKeys("admin");
			s.findElement(By.name("pwd")).sendKeys("manager");
			s.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void minimize()
	{
		try {
			s.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void CreateUser1()
	{
		try {
			s.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			s.findElement(By.name("firstName")).sendKeys("demo1");
			s.findElement(By.name("lastName")).sendKeys("User1");
			s.findElement(By.name("email")).sendKeys("mani387171@gmail.com");
			s.findElement(By.name("username")).sendKeys("user1");
			s.findElement(By.name("password")).sendKeys("u1234");
			s.findElement(By.name("passwordCopy")).sendKeys("u1234");
			Thread.sleep(2000);
			s.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	private static void Logoutasadmin()
	{
		try {
			s.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Loginasuser1()
	{
		try {

			s.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			s.findElement(By.name("pwd")).sendKeys("u1234");
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Createuser2()
	{
		try {

			s.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			s.findElement(By.name("firstName")).sendKeys("demo2");
			s.findElement(By.name("lastName")).sendKeys("User2");
			s.findElement(By.name("email")).sendKeys("mani3871@gmail.com");
			s.findElement(By.name("username")).sendKeys("user2");
			s.findElement(By.name("password")).sendKeys("u12345");
			s.findElement(By.name("passwordCopy")).sendKeys("u12345");
			s.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LogoutasUser1()
	{
		try {
			s.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Loginasuser2()
	{
		try {

			s.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			s.findElement(By.name("pwd")).sendKeys("u12345");
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Createuser3()
	{
		try {

			s.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			s.findElement(By.name("firstName")).sendKeys("demo3");
			s.findElement(By.name("lastName")).sendKeys("User3");
			s.findElement(By.name("email")).sendKeys("mani38@gmail.com");
			s.findElement(By.name("username")).sendKeys("user3");
			s.findElement(By.name("password")).sendKeys("u2468");
			s.findElement(By.name("passwordCopy")).sendKeys("u2468");
			s.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void LogoutasUser2()
	{
		try {
			s.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Loginasuser3()
	{
		try {

			s.findElement(By.xpath("//input[@id='username']")).sendKeys("user3");
			Thread.sleep(2000);
			s.findElement(By.xpath("//input[@name='pwd']")).sendKeys("u2468");
			Thread.sleep(2000);
			s.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@*='logout']")).click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void Loginasuser20()
	{
		try {

			s.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			s.findElement(By.name("pwd")).sendKeys("u12345");
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Modifypassforuser3()
	{
		try {
			s.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			s.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			s.findElement(By.name("password")).sendKeys("mani");
			Thread.sleep(2000);
			s.findElement(By.name("passwordCopy")).sendKeys("mani");
			Thread.sleep(2000);
			s.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LogoutasUser22()
	{
		try {
			s.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Loginasuser30()
	{
		try {

			s.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(2000);
			s.findElement(By.name("pwd")).sendKeys("mani");
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			/*s.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);*/


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LogoutasUser30()
	{
		try {
			s.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Loginasuser10()
	{
		try {

			s.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			s.findElement(By.name("pwd")).sendKeys("u1234");
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			/*s.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);*/


		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	private static void Modifyuserpassforuser2()
	{
		try {
			s.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			s.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			s.findElement(By.name("password")).sendKeys("shivu");
			Thread.sleep(2000);
			s.findElement(By.name("passwordCopy")).sendKeys("shivu");
			Thread.sleep(2000);
			s.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(2000);

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LogoutasUser10()
	{
		try {
			s.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Loginasuser21()
	{
		try {

			s.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			s.findElement(By.name("pwd")).sendKeys("shivu");
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			/*s.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);*/


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			 s.findElement(By.xpath("//a[@*='logoutLink']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginad()
	{
		try {
			s.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			s.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Modifyuser1()
	{
		try {
			s.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			s.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			s.findElement(By.name("password")).sendKeys("suman");
			Thread.sleep(2000);
			s.findElement(By.name("passwordCopy")).sendKeys("suman");
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logoutasadmin1()
	{
		try {
			s.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Loginasuser11()
	{
		try {

			s.findElement(By.name("username")).sendKeys("user1");
			s.findElement(By.name("pwd")).sendKeys("suman");
			s.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			/*s.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);*/


		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	private static void LogoutasUser11()
	{
		try {
			s.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Loginasuser22()
	{
		try {

			s.findElement(By.name("username")).sendKeys("user2");
			s.findElement(By.name("pwd")).sendKeys("shivu");
			s.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			/*s.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);*/


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteUser3()
	{
		try
		{
			s.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//span[text()='User3, demo3']")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			s.switchTo().alert().accept();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void logout_f()
	{
		try
		{
			s.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void loginUser_g()
	{
		try
		{
			Thread.sleep(4000);
			s.findElement(By.name("username")).sendKeys("user1");
			s.findElement(By.name("pwd")).sendKeys("suman");
			s.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteUser2()
	{
		try
		{
			s.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			s.switchTo().alert().accept();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout_h()
	{
		try
		{
			Thread.sleep(2000);
			s.findElement(By.linkText("Logout")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void login_i()
	{
		try
		{
			Thread.sleep(2000);
			s.findElement(By.name("username")).sendKeys("admin");
			s.findElement(By.name("pwd")).sendKeys("manager");
			s.findElement(By.xpath("//div[text()='Login ']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteUser1()
	{
		try
		{
			Thread.sleep(2000);
			s.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			s.switchTo().alert().accept();
		}catch(Exception e) 
		{
			e.printStackTrace();
			
		}
	}
	private static void logout_j()
	{
		try
		{
			s.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void close()
	{
		try
		{
			s.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}





