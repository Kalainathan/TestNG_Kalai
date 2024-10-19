package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	WebDriver driver;
	
	

@FindBy(id = "email")
private WebElement user;

@FindBy(name = "pass")
private WebElement pass;

@FindBy(xpath = "//button[text()='Log in']")

private WebElement loginbtn;



public WebElement getLoginbtn() {
	return loginbtn;
}



public WebElement getPass() {
	return pass;
}



public PomClass(WebDriver driver2) {
	
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}



public WebElement getUser() {
	return user;
}



	

	
	
	

}
