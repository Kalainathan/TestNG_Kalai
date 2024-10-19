package com.SampleTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invocation_count {
	static WebDriver driver;
	@BeforeClass
	@Test(invocationCount = 2)
	private void email() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/index.php/");
		driver.findElement(By.id("email")).sendKeys("priya");
		System.out.println("email checked");
	}
	@Test
private void password() {
	System.out.println("password checked");
}

}
