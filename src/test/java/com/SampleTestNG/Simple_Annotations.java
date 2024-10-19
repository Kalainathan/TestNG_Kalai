package com.SampleTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	private void meth1() {
		System.out.println("browser launch");
	}
	
	@BeforeTest
	private void meth2() {
		System.out.println("Url launch");
	}
	
	@BeforeClass
	private void meth3() {
		System.out.println("login");
	}
	
	@BeforeMethod
	private void meth4() {
		System.out.println("search product");
	}
	
	@Test
	private void meth5() {
		System.out.println("buy product");
	}
	
	@AfterMethod
	private void meth6() {
		System.out.println("logout");
	}
	
	@AfterClass
	private void meth7() {
		System.out.println("Url close");
	}
	
	@AfterTest
	private void meth8() {
		System.out.println("close");
	}
	


}
