package com.Scopex.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Scopex.POMPackage.POMClass_LoginPage;

public class TC01_VerifyContantUsFunctionality extends TestBaseClass {
	
	
	@Test(priority=1)
	public void VerifyContancUsClickFunctionality()
	{
		POMClass_LoginPage LP = new POMClass_LoginPage(driver);
		
		LP.ContactUsClick();
		log.info("Click on Contact Us");
		
		log.info("Apply for validation");
		
		String ExpectedResult = "https://scopex.money/Contact";
		String ActualResult = driver.getCurrentUrl();
		
		Assert.assertEquals(ActualResult, ExpectedResult,"Mismatch of the Web Page");
		
	}
	

	@Test(priority=2)
	public void VerifyNameTextboxEnabledfunctionality()
	{
		POMClass_LoginPage LP = new POMClass_LoginPage(driver);
		LP.ContactUsClick();
		log.info("Click on Contact us");
		
		log.info("Apply for validation");
		
		boolean Textbox = LP.NameTextboxClick();
		
		if(Textbox=true)
		{
			log.info("Test case is passed");
		}
		else
		{
			log.info("Test case is failed");

		}
		
		
	}
	
	
	
	
	@Test(priority=3)
	public void VerifyEmailTextboxEnabledfunctionality()
	{
		POMClass_LoginPage LP = new POMClass_LoginPage(driver);
		LP.ContactUsClick();
		log.info("Click on Contact us");
		
		log.info("Apply for validation");
		
		boolean Textbox1 = LP.EmailTextboxEnbled();
		
		if(Textbox1=true)
		{
			log.info("Test case is passed");
		}
		else
		{
			log.info("Test case is failed");

		}
		
		
	}
	
	
	
	
	@Test(priority=3)
	public void VerifyMessageTextboxEnabledfunctionality()
	{
		POMClass_LoginPage LP = new POMClass_LoginPage(driver);
		LP.ContactUsClick();
		log.info("Click on Contact us");
		
		log.info("Apply for validation");
		
		boolean Textbox2 = LP.MessageTextboxEnbled();
		
		if(Textbox2=true)
		{
			log.info("Test case is passed");
		}
		else
		{
			log.info("Test case is failed");

		}
		
		
	}
	
	
	
}
