package com.Scopex.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Scopex.POMPackage.POMClass_LoginPage;

public class TC03_VerifyRegisterFuctionality extends TestBaseClass
{
	
	@Test
	public void VerifyRegisterFuctionality()
	{
	POMClass_LoginPage LP = new POMClass_LoginPage(driver);   
	
	LP.RegisterClick();
	log.info("Click on Register");
	
	log.info("Apply for validation");
	
	String ExpectedResult = "https://scopex.money/SignUp";
	String ActualResult = driver.getCurrentUrl();
	
	Assert.assertEquals(ActualResult, ExpectedResult, " Mismatch of the WebPage");
	
	
	
	
	}

}
