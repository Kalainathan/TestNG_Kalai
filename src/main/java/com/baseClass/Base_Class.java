package com.baseClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	  static WebDriver driver;
	  
	public static void browserLaunch() {
		System.out.println(driver);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println(driver);
		



	}
	public static void urlLaunch(String u) {
		driver.get(u);
		driver.manage().window().maximize();



	}
	public static void Takes_sc(String s) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;//narrow
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\kalai\\eclipse-workspace\\TestNG_Project\\target\\"+s);
		FileHandler.copy(src, des);


	}
	public static void close() {
		driver.close();
	}
	

}
