package com.SampleTestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Class {
@Test
	private void Meth1() {
		System.out.println("browser launch");
		
	}
@Ignore
@Test
private void Meth2() {
	System.out.println("Add pop  up");
		
	}
@Test(enabled=false)
private void Meth3() {
	System.out.println("search product");
	
}
}
