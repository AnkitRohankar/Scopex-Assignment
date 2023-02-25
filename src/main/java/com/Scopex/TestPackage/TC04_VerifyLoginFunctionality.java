package com.Scopex.TestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Scopex.POMPackage.POMClass_LoginPage;
import com.Scopex.UtilityPackage.UtilityClass;

public class TC04_VerifyLoginFunctionality extends TestBaseClass
{

	@Test(priority = 1)
	public void VerifyLoginPageFunctionality()
	{
		POMClass_LoginPage LP = new POMClass_LoginPage(driver);
		
		LP.LoginClick();
		log.info("Click on Login");
		
		log.info("Apply for validadation ");
		
		String ExpectedResult = "https://scopex.money/Login";
		String ActualResult = driver.getCurrentUrl();
		
		Assert.assertEquals(ActualResult, ExpectedResult,"Mismatch of the WebPage");
		
	}
	
	
	@Test(priority =2)
	public void VerifyLoginActivityFunctionality() throws InterruptedException, IOException
	{
		
		// wrong email and password ---> Show Error Massage
		
		POMClass_LoginPage LP = new POMClass_LoginPage(driver);

		
		LP.EmailAddressSendKeys();
		log.info("Enter the Email");
		
		LP.passwordSendKeys();
		log.info("Enter the Password");
		
		LP.LoginBtnClick();
		log.info("Login Button are hit");
		
		log.info("Apply for Validation");
		
		Thread.sleep(3000);
		UtilityClass.screenShotMethod(driver, "Wrong Mail id and Password");
		log.info("Screenshot is Capture");
		
		
		String ExpectedResult1 = "You have entered an invalid email address!.";
		String ActualResult1 =LP.LoginMessageText();
		
		Assert.assertEquals(ActualResult1,ExpectedResult1,"Login in Sucecessfully ");
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
