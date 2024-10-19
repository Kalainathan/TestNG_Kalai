package com.SampleTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion_class {

	static WebDriver driver;
	@Test(enabled=false)
	public void assert1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);

		//Hard Assertion->condition fails terminate from execution;critical condition
		Assert.assertEquals(title, "Google");
		driver.navigate().refresh();
		driver.close();

	}
@Test
	public void softassert1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
//Soft Assertion -->non critical TC verification make to notify to the user
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "google");
		driver.navigate().refresh();
		driver.close();
		sa.assertAll();



	}


}
