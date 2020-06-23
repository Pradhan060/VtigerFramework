package com.Vtiger.TestScript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Vtiger.genericLib.BaseClass;

import com_Object_Bank.CreatingNewProductPgaeWebElement;
import com_Object_Bank.HomePageWebElement;
import com_Object_Bank.ProductCreationSuccessPageWebElement;
import com_Object_Bank.ProductHomePageWebElements;
@Listeners(com.Vtiger.genericLib.ListenerFunctionality.class)
public class CreateProductTest extends BaseClass{
	@Test
	public void ProductCreation() throws EncryptedDocumentException, IOException
	{
		HomePageWebElement hp = PageFactory.initElements(BaseClass.driver, HomePageWebElement.class);
		ProductHomePageWebElements pp = PageFactory.initElements(BaseClass.driver, ProductHomePageWebElements.class);
		CreatingNewProductPgaeWebElement cnp = PageFactory.initElements(BaseClass.driver, CreatingNewProductPgaeWebElement.class);
		ProductCreationSuccessPageWebElement pcsw = PageFactory.initElements(BaseClass.driver, ProductCreationSuccessPageWebElement.class);
		hp.getproducts().click();
		pp.getcreateProduct().click();
		cnp.getProductName().sendKeys(data.getDataFromExcel("Product", 2, 1));
		cnp.getSaveBtn().click();
		String ActSuccessMsg = pcsw.getSuccessMsg().getText();
		Assert.assertTrue(ActSuccessMsg.contains(data.getDataFromExcel("Product", 2, 2)));
		Reporter.log("Product created successfully" ,true);
		
		
//	driver.findElement(By.linkText("Products")).click();
//	driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
//	driver.findElement(By.name("productname")).sendKeys(data.getDataFromExcel("Product", 2, 1));
//	
//	driver.findElement(By.xpath("//input[contains(@value,'Save')]")).click();
//	String successMsg = driver.findElement(By.xpath("//span[contains(text(),'Product Information')]")).getText();
//	if(successMsg.contains(data.getDataFromExcel("Product", 2, 2)))
//	{
//		Reporter.log("Product Created Successfully",true);
//	}
//	else
//	{
//		Reporter.log("Product Creation unSuccessful",true);
//	}
		
	}
}
