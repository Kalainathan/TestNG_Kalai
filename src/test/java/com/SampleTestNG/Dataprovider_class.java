package com.SampleTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider_class {
	static WebDriver driver;
		
	@Test(dataProvider = "userdetails")
    private void login(String a,String b) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/index.php/");
	
		driver.findElement(By.id("email")).sendKeys(a);
		driver.findElement(By.id("pass")).sendKeys(b);
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		
	}
	//object[][]
	//@DataProvider(name="TestData")
	@DataProvider
	private Object[][] userdetails() {
		return new Object[][] {
			{"priya" ,"asdfg"},
			{"magash", "kutty"}
		};
	}

}
