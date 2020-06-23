package com_Object_Bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatingNewProductPgaeWebElement {

	@FindBy(name="productname")
	private WebElement ProductName;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement SaveBtn;
	
	public WebElement getProductName() 
	{
		return ProductName;
	}
	public WebElement getSaveBtn()
	{
		return SaveBtn;
	}
}
