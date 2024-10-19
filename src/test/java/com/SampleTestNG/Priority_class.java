package com.SampleTestNG;

import org.testng.annotations.Test;

public class Priority_class {
	
	public class PriorityExample {
	    @Test(priority = 2)
	    public void test1() {
	        System.out.println("Test 1 executed.");
	    }

	    @Test(priority = -1)
	    public void test2() {
	        System.out.println("Test 2 executed.");
	    }
	    @Test(priority = 0)
	    public void test3() {
	        System.out.println("Test 3 executed.");
	    }


	}

}
