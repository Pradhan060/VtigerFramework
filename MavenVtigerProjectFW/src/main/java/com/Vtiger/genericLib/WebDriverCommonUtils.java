package com.Vtiger.genericLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebDriverCommonUtils {
		String mainId= null;
		public void explicitWaitForElement(WebElement element)
		{
			WebDriverWait wait =new WebDriverWait(BaseClass.driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		public void selectFromList(WebElement element, String itemToBeSelected)
		{
			Select s =new Select(element);
			s.selectByValue(itemToBeSelected);
		}
		public boolean checkMultipleList(WebElement element)
		{
			Select s=new Select(element);
			return s.isMultiple();
		}
		public void keepMouseOn(WebElement element)
		{
			Actions act=new Actions(BaseClass.driver);
			act.moveToElement(element).perform();
		}
		public void DragNDropElement(WebElement source,WebElement destination)
		{
			Actions act= new Actions(BaseClass.driver);
			act.dragAndDrop(source, destination).perform();
		}
		public void acceptAlert()
		{
			Alert alt = BaseClass.driver.switchTo().alert();
			alt.accept();
		}
		public void rejectAlert()
		{
			Alert alt = BaseClass.driver.switchTo().alert();
			alt.dismiss();
		}
		public void validateAlertMessage(String expectedAlertMsg)
		{
			Alert alt = BaseClass.driver.switchTo().alert();
			String actualText = alt.getText();
			Assert.assertEquals(actualText, expectedAlertMsg);
			System.out.println("Alert validation passs");
		}
		public void switchToNewWindow()
		{
			mainId = BaseClass.driver.getWindowHandle();
			Set<String> allId = BaseClass.driver.getWindowHandles();
			for(String id:allId)
			{
				if(!id.equals(mainId))
				{
					BaseClass.driver.switchTo().window(id);
				}
			}
		}
		public void switchToMainWindow() 
		{
			
			BaseClass.driver.switchTo().window(mainId);
		}
		public void SwitchToRequiredFrame(WebElement element)
		{
			BaseClass.driver.switchTo().frame(element);
		}
		public void SwitchToDefaultFrame()
		{
			BaseClass.driver.switchTo().defaultContent();
		}
		public void fileUploadToApplication(String filepath) throws AWTException
		{	filepath=filepath.replace("\\","\\\\");
			StringSelection path=new StringSelection(filepath);
			Toolkit tool = Toolkit.getDefaultToolkit();
			Clipboard cb = tool.getSystemClipboard();
			cb.setContents(path, null);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
}
