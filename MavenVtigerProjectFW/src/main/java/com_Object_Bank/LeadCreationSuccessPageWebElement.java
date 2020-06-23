package com_Object_Bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadCreationSuccessPageWebElement {
	
	@FindBy(xpath="//span[contains(text(),'Lead Information')]")
	public WebElement SuccessMsg;
	
	public WebElement getSuccessMsg()
	{
		return SuccessMsg;
	}
	
	
}
