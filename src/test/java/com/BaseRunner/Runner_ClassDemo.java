package com.BaseRunner;

import java.io.IOException;

import com.baseClass.Base_Class;

public class Runner_ClassDemo extends Base_Class {
	public static void main(String[] args) throws IOException, InterruptedException {
		browserLaunch();	
		urlLaunch("https://www.facebook.com/login/");
		Takes_sc("fb.png");
		Thread.sleep(2000);
		urlLaunch("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		Takes_sc("insta.png");
		Thread.sleep(2000);
		close();
	}

	

}
