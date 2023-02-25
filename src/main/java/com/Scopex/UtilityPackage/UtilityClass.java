package com.Scopex.UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	public static void screenShotMethod(WebDriver driver, String name) throws IOException
	
		
		
		{
	        Date d = new Date();
			DateFormat d1 = new SimpleDateFormat("mm-dd-yy & hh-mm-ss");
			String date = d1.format(d);
	       
	        TakesScreenshot ts = (TakesScreenshot)driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Scopex Screenshot\\Scopex"+name+date+".jpg");
			FileHandler.copy(sourceFile, destFile);
			
		
		}

}
