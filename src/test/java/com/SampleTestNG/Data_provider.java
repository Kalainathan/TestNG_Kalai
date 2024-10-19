package com.SampleTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	

	    @DataProvider(name = "dataProvider")
	    public Object[][] dataProvider() {
	        return new Object[][] {
	            {1, 2},
	            {3, 4}
	        };
	    }

	    @Test(dataProvider = "dataProvider")
	    public void testWithData(int a, int b) {
	        System.out.println("Sum: " + (a + b));
	    }
	}


