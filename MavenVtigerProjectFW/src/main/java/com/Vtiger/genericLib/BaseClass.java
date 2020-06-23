package com.Vtiger.genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com_Object_Bank.HomePageWebElement;
import com_Object_Bank.LoginPageWebElement;

public class BaseClass {
	public static WebDriver driver;
	public DataUtility data=new DataUtility();
	
	@BeforeSuite
	public void configBS()
	{
		System.out.println("=========Database connected==========");
	}
	@Parameters("browser")
	@BeforeClass
	public void configBC() throws IOException
	{
		String browser = data.getDataFromProperty("browser");
		System.out.println("========Browser launching Starts========");
		//driver=new ChromeDriver();
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
		driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(data.getDataFromProperty("url"));
		System.out.println("========Browser launching Ends========");
	}
	@BeforeMethod
	public void configBM() throws IOException
	{
		System.out.println("==========login Starts==========");
		LoginPageWebElement login = PageFactory.initElements(driver, LoginPageWebElement.class);
		login.loginToApp(data.getDataFromProperty("username"), data.getDataFromProperty("password"));
		login.getloginbtn().click();
//		driver.findElement(By.name("user_name")).sendKeys(data.getDataFromProperty("username"));
//		driver.findElement(By.name("user_password")).sendKeys(data.getDataFromProperty("password"));
//		driver.findElement(By.id("submitButton")).click();
		System.out.println("==========login done==========");
	}
	@AfterMethod
	public void configAM()
	{
		HomePageWebElement logout = PageFactory.initElements(driver, HomePageWebElement.class);
		logout.logoutFromApp();
//		WebElement logout = driver.findElement(By.xpath("//span[text()=' Administrator']/../following-sibling::td/img"));
//		Actions act=new Actions(driver);
//		act.moveToElement(logout).perform();
//		driver.findElement(By.linkText("Sign Out")).click();
		System.out.println("===========Logout done===========");
	}
	@AfterClass
	public void cofigAC()
	{
		System.out.println("==========close Browser=========");
		driver.quit();
	}
	@AfterSuite
	public void configAS()
	{
		System.out.println("=======Database Disconnected========");
	}
}
	

