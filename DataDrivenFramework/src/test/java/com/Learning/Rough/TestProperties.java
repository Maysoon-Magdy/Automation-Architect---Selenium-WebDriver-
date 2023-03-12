package com.Learning.Rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
 
public class TestProperties {
	
	public static void main(String[] args) throws IOException {
		Properties config = new Properties();
		Properties OR = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Properties/Config.Properties");
		config.load(fis);
		
		fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Properties/OR.Properties");
		OR.load(fis);
		//so whenever i wanna call locator from the config file all i need to do is 
		//driver.findElement(By.CssSelector(OR.getProperty("bmlBtn")).click();
		System.out.println(config.getProperty("browser"));
		System.out.println(OR.getProperty("bmlBtn"));
	}
	
	
}
	