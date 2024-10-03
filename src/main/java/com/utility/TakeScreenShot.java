package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
	
	public static void screenShot(WebDriver driver) throws Throwable {
		TakesScreenshot takescreen = (TakesScreenshot) driver;
		  File source = takescreen.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\Screenshot\\s1.png" ));
			
	}
}
