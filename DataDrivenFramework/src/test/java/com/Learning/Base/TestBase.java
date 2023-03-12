package com.Learning.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	/*
	 * web driver 
	 * properties 
	 * logs 
	 * extent reports 
	 * DB 
	 * Excel 
	 * Mail
	 * */
	
	public static WebDriver driver ;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	@BeforeSuite
public void setUp() throws IOException {
	if(driver == null) {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Properties/Config.Properties");
		config.load(fis);
		fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Properties/OR.Properties");
		OR.load(fis);
		System.out.println(config.getProperty("browser"));
	}
}


@AfterSuite	
public void tearDown(){
	
}


}
