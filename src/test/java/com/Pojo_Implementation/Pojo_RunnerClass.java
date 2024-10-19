package com.Pojo_Implementation;

import com.pojo.Pojo_Class;

public class Pojo_RunnerClass {
	//extends
	//method static
	//object
	
	public static void main(String[] args) {
		Pojo_Class p=new Pojo_Class();
		System.out.println(p.get());
		System.out.println(p.set(25));
		System.out.println(p.get());
		System.out.println(p.set(20));
		System.out.println(p.get());
		System.out.println(p.get1());
		System.out.println(p.set1("Ilan Prem"));
		System.out.println(p.get1());
		
	}


}
