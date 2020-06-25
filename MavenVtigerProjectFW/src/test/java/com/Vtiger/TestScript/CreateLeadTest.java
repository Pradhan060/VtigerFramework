package com.Vtiger.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Vtiger.genericLib.BaseClass;

import com_Object_Bank.CreatingNewLeadPgaeWebElement;
import com_Object_Bank.HomePageWebElement;
import com_Object_Bank.LeadCreationSuccessPageWebElement;
import com_Object_Bank.LeadHomePageWebElements;

@Listeners(com.Vtiger.genericLib.ListenerFunctionality.class)
public class CreateLeadTest extends BaseClass {
	@Test
	public void LeadCreation() throws EncryptedDocumentException, IOException
	{
		
		HomePageWebElement hp = PageFactory.initElements(driver, HomePageWebElement.class);
		LeadHomePageWebElements lp = PageFactory.initElements(driver, LeadHomePageWebElements.class);
		CreatingNewLeadPgaeWebElement cn = PageFactory.initElements(driver, CreatingNewLeadPgaeWebElement.class);
		LeadCreationSuccessPageWebElement lc = PageFactory.initElements(driver, LeadCreationSuccessPageWebElement.class);
		hp.getleads().click();
		lp.getcreateLead().click();
		cn.getLastName().sendKeys(data.getDataFromExcel("CreationOfLead", 2, 1));
		cn.getCompany().sendKeys(data.getDataFromExcel("CreationOfLead", 2, 2));
		cn.getSaveBtn().click();
		String actLeadmsg = lc.getSuccessMsg().getText();
		Assert.assertTrue(actLeadmsg.contains(data.getDataFromExcel("CreationOfLead", 2, 3)));
	
		
		
//		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
//		driver.findElement(By.name("lastname")).sendKeys(data.getDataFromExcel("CreationOfLead", 2, 1));
//		driver.findElement(By.name("company")).sendKeys(data.getDataFromExcel("CreationOfLead", 2, 2));
//		driver.findElement(By.xpath("//input[contains(@value,'Save')]")).click();
//		String successMsg = driver.findElement(By.xpath("//span[contains(text(),'Lead Information')]")).getText();
//		if(successMsg.contains(data.getDataFromExcel("CreationOfLead", 2, 3)))
//		{
//			Reporter.log("Lead Created Successfully",true);
//		}
//		else
//		{
//			Reporter.log("Lead Creation unSuccessful",true);
//		}
	}
}
