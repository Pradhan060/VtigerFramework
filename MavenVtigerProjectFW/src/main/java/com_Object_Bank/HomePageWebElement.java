package com_Object_Bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.Vtiger.genericLib.BaseClass;

public class HomePageWebElement {
	
	@FindBy(linkText="Leads")
	private WebElement leads;
	
	@FindBy(linkText="Organizations")
	private WebElement organizations;
	
	@FindBy(linkText="Products")
	private WebElement products;
	
	@FindBy(xpath=" //span[text()=' Administrator']/../following-sibling::td[1]/img")
	private WebElement signoutDD;
	
	@FindBy(linkText="Sign Out")
	private WebElement signoutLink;
	
	public WebElement getleads()
	{
		return leads;
	}
	
	public WebElement getOrganizations()
	{
		return organizations;
	}
	
	public WebElement getproducts()
	{
		return products;
	}
	
	public WebElement getsignoutDD()
	{
		return signoutDD;
	}
	public WebElement getsignoutLink()
	{
		return signoutLink;
	}
	
	public void logoutFromApp() 
	{
		Actions act=new Actions(BaseClass.driver);
		act.moveToElement(signoutDD).perform();
		signoutLink.click();
	}
}
