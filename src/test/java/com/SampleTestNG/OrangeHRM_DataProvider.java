package com.SampleTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_DataProvider {

	static WebDriver driver;
	@Test(dataProvider="loginTestData")
	public void TestLogin(String uname,String pass) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	Assert.assertTrue(driver.findElement(By.id("welcome"))).isDisplayed();

	}
	@DataProvider(name="loginTestData")
	public  Object[][] Login() {
		Object[][] data=new Object[2][2];

		data[0][0]="Admin";
		data[0][1]	="admin123";

		data[1][0]="Admin";
		data[1][1]="admin";
		return data;
	}


}
