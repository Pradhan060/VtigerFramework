package com_Object_Bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatingNewLeadPgaeWebElement {
	 	@FindBy(name="lastname")
		private WebElement LastName;
	 	
		@FindBy(name="company")
		private WebElement Company;
		
        @FindBy(xpath="//input[@value='  Save  ']")
		private WebElement SaveBtn;
		
		public WebElement getLastName()
		{
			return LastName;
		}
		
		public WebElement getCompany()
		{
			return Company;
		}
		
		public WebElement getSaveBtn()
		{
			return SaveBtn;
		}
		
}
