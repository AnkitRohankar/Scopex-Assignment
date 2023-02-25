package com.Scopex.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Scopex.POMPackage.POMClass_LoginPage;

public class TC02_VerifyFAQsFunctionality extends TestBaseClass
{
     
	@Test
	public void VerifyFAQsFunctionality()
	{
		
		POMClass_LoginPage LP = new POMClass_LoginPage(driver);
		LP.FAQsClick();
		log.info("Click on FAQs");
		
		log.info("Apply for validation");
		
		String ExpectedResult = "https://scopex.money/Faqs";
		String ActualResult = driver.getCurrentUrl();
		
		Assert.assertEquals(ActualResult, ExpectedResult,"Mismatch of the WebPage");
		
		
		
		
		
	}
	
	
	
	
	
}
