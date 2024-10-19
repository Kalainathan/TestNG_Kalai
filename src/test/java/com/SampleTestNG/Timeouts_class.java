package com.SampleTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Timeouts_class {
static WebDriver driver;
	@Test(timeOut = 1000,expectedExceptions = ThreadTimeoutException.class)
	private void fb_url_launch() throws InterruptedException  {
		Thread.sleep(4000);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("www.google.com");
		System.out.println("url launched");
	}
	@Test(expectedExceptions = ArithmeticException.class)
	public void dividiblebyzero() {
		int a=10/0;
		System.out.println(a);
	}

	
}
//org.testng.internal.thread.ThreadTimeoutException