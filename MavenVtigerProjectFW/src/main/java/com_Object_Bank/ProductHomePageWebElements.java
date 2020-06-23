package com_Object_Bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductHomePageWebElements {

	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProduct;
	
	public WebElement getcreateProduct()
	{
		return createProduct;
	}
}
