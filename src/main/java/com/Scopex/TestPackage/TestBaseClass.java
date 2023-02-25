package com.Scopex.TestPackage;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBaseClass {
	
	static WebDriver driver;
	
	Logger log = Logger.getLogger("ScopexProject");
	
	 @Parameters("browserName")
     @BeforeMethod
     
     public void setup(String browserName)
     {
		
		 if(browserName.equals("chrome"))
			{
			   System.setProperty("webdriver.chrome.driver"
                    	,"./Driver\\chromedriver.exe");
			    
			 driver = new ChromeDriver();
			}
			else
			{
				System.setProperty("webdriver.gecko.driver",
					   	"./Driver\\geckodriver.exe");				
				 
				driver = new FirefoxDriver();
			}
    
		 PropertyConfigurator.configure("log4j.properties");

         	
         log.info("Browser is open");

         driver.manage().window().maximize();
         log.info("Browser is Maximize");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

         driver.get("https://scopex.money/Login");
         log.info("Url is open");
	
}
	 
	
	 @AfterMethod
	 public void teardown()
	 {
		 driver.quit();
		 log.info("Browser is closed");
		 
		 log.info("End of Program");
	 }
	
	
	

}
