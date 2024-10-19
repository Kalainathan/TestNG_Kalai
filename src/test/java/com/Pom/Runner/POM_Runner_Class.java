package com.Pom.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pom_Class.PomClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POM_Runner_Class {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		PomClass p=new PomClass(driver);
		
		WebElement user = p.getUser();
		user.sendKeys("8939596988");
		
		WebElement pass = p.getPass();
		pass.sendKeys("Thiya$1804");
		
		p.getLoginbtn().click();
		
		
	}

}
