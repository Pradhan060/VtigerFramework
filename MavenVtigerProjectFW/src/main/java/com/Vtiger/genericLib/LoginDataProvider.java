package com.Vtiger.genericLib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider {
	@Test(dataProvider="supplyCredentials")
	public void login(String username ,String password)
	{
		System.out.println("Username is :"+ username);
		System.out.println("Password is :"+ password);
		System.out.println("HomePage Displayed successfully");
	}
	
	@DataProvider
	public Object[][] supplyCredentials() throws EncryptedDocumentException, IOException
	{
		Object[][] objArr=new Object[50][2];
		DataUtility data= new DataUtility();
		for(int i=0 ; i<50 ; i++)
		{
			objArr[i][0]=data.getDataFromExcel("SampleListData", i+1, 0);
			objArr[i][1]=data.getDataFromExcel("SampleListData", i+1, 1);
		}
		return  objArr;
	}
}
