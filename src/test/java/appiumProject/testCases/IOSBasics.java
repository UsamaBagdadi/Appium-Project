package appiumProject.testCases;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import appiumProject.TestUtils.IOSBaseTest;
import appiumProject.pageObjects.ios.AlertViews;

public class IOSBasics extends IOSBaseTest{

	
	@Test
	public void IOSBasicsTest()
	{
		//Xpath, classname, IOS, iosClassCHain, IOSPredicateString, accessibility id, id
		
		AlertViews alertViews = homePage.selectAlertViews();
		alertViews.fillTextLabel("hello");
		String actualMessage = alertViews.getConfirmMessage();
		AssertJUnit.assertEquals(actualMessage, "A message should be a short, complete sentence.");

		
		
		
		
		
		
		
	}
}
