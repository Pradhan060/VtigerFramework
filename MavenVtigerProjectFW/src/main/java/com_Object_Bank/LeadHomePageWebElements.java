package com_Object_Bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadHomePageWebElements {
	
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createLead;
	
	public WebElement getcreateLead()
	{
		return createLead;
	}
	
}
