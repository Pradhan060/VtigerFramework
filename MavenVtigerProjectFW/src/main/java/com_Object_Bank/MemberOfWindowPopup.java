package com_Object_Bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MemberOfWindowPopup {
	
	@FindBy(xpath="(//a[contains(text(),'GITA')])[1]")
	private WebElement NameOfOrg;
	
	public WebElement getNameOfOrg()
	{
		return NameOfOrg;
	}
}
