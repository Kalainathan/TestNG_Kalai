package com.SampleTestNG;

import org.testng.annotations.Test;

public class Dependency_class {
	
	@Test
    public void method1() {
        System.out.println("Method 1 executed.");
    }

    @Test(dependsOnMethods = "method1")
    public void method2() {
        System.out.println("Method 2 executed after Method 1.");
    }
}


