package com_Object_Bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageWebElement {
	
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	public WebElement getusername()
	{
		return username;
	}
	public WebElement getpassword()
	{
		return password;
	}
	public WebElement getloginbtn()
	{
		return loginbtn;
	}
	
	public void loginToApp(String un ,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
	}
}
