package com.Vtiger.TestScript;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Vtiger.genericLib.BaseClass;
import com.Vtiger.genericLib.WebDriverCommonUtils;

import com_Object_Bank.CreatingNewOrganizationPageWebElement;
import com_Object_Bank.HomePageWebElement;
import com_Object_Bank.MemberOfWindowPopup;
import com_Object_Bank.OrganizationCreationSuccessPageWebElement;
import com_Object_Bank.OrganizationHomePageWebElements;

@Listeners(com.Vtiger.genericLib.ListenerFunctionality.class)
public class CreateOrganisationTest  extends BaseClass{
	@Test
	public void OrganisationCreation() throws EncryptedDocumentException, IOException
	{
		WebDriverCommonUtils wdcu=new WebDriverCommonUtils();
		
		HomePageWebElement hp = PageFactory.initElements(BaseClass.driver, HomePageWebElement.class);
		OrganizationHomePageWebElements op = PageFactory.initElements(BaseClass.driver, OrganizationHomePageWebElements.class);
		CreatingNewOrganizationPageWebElement cnop = PageFactory.initElements(BaseClass.driver, CreatingNewOrganizationPageWebElement.class);
		OrganizationCreationSuccessPageWebElement ocsp = PageFactory.initElements(BaseClass.driver, OrganizationCreationSuccessPageWebElement.class);
		MemberOfWindowPopup mowp = PageFactory.initElements(BaseClass.driver, MemberOfWindowPopup.class);
		hp.getOrganizations().click();
		op.getcreateOrganization().click();
		String orgName = data.getDataFromExcel("Organisation", 2, 1);
		Random r=new Random();
		int num = r.nextInt(9999);
		orgName=orgName+num;
		cnop.getOrganizationName().sendKeys(orgName);
		
		// Window handle of Organisation(Member of)
		cnop.getMemberOfPlusSign().click();
		wdcu.switchToNewWindow();
		mowp.getNameOfOrg().click();
		wdcu.acceptAlert();
		wdcu.switchToMainWindow();
		
		
		cnop.getRating().click();
		WebElement rating = cnop.getRating();
		wdcu.selectFromList(rating, "Active");
		cnop.getTopSaveBtn().click();
		
		String actualSuccessMsg = ocsp.getSuccessMsg().getText();
		Assert.assertTrue(actualSuccessMsg.contains(data.getDataFromExcel("Organisation", 2, 2)));
		Reporter.log("Organisation created successfully",true);
		
		
//		driver.findElement(By.linkText("Organizations")).click();
//		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//		String orgName = data.getDataFromExcel("Organisation", 2, 1);
//		Random r=new Random();
//		int num = r.nextInt(9999);
//		orgName=orgName+num;
//		driver.findElement(By.name("accountname")).sendKeys(orgName);
//		
//		driver.findElement(By.xpath("//input[contains(@value,'Save')]")).click();
//		String successMsg = driver.findElement(By.xpath("//span[contains(text(),'Organization Information')]")).getText();
//		if(successMsg.contains(data.getDataFromExcel("Organisation", 2, 2)))
//		{
//			Reporter.log("Organisation Created Successfully",true);
//		}
//		else
//		{
//			Reporter.log("Organisation Creation unSuccessful",true);
//		}
	}
}
