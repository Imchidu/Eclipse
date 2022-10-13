package com.xworkz.constructor.boot;

import com.xworkz.constructor.Passport;

public class PassportRunner {

	public static void main(String[] args) {
		Passport visa = new Passport(999);
		System.out.println(visa.number);
		System.out.println("======================================");
		
		Passport visa1 = new Passport("rohan");
		System.out.println(visa1.name);
		System.out.println("======================================");
		
		Passport visa2 = new Passport("rohan",888);
		System.out.println(visa2.name);
		System.out.println(visa2.number);
		System.out.println("======================================");
		
		Passport visa3 = new Passport(123,"yogi");
		System.out.println(visa3.number);
		System.out.println(visa3.name);
		System.out.println("======================================");
		
		Passport visa4 = new Passport(17,"India","10-10-2022");
		System.out.println(visa4.expiryDate);
		System.out.println(visa4.country);
		System.out.println(visa4.issueDate);
		System.out.println("======================================");
		
		Passport visa5 = new Passport("India",600,20);
		System.out.println(visa5.name);
		System.out.println(visa5.number);
		System.out.println(visa5.expiryDate);
		System.out.println("======================================");
		
		Passport visa6 = new Passport(456,49);
		System.out.println(visa6.number);
		System.out.println(visa6.expiryDate);
		System.out.println("======================================");
		
		Passport visa7 = new Passport("India","raghu");
		System.out.println(visa7.country); 
	    System.out.println(visa7.name);
		
		
	}

}
