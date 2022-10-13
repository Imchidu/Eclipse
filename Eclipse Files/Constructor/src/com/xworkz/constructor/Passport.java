package com.xworkz.constructor;

public class Passport {
	public int number;
	public String name;
	public int expiryDate;
	public String country;
	public String issueDate;
	
	public Passport(int number)
	{
		this.number = number;
		System.out.println("Passport number");
	}
	
	public Passport(String name)
	{
		this.name = name;
		System.out.println("Name of the Passport");
	}
	
	public Passport(String name,int number)
	{
		this.name = name;
		this.number = number;
		System.out.println("name of the Passport");
		System.out.println("Passport no");
	}
	
	public Passport(int number,String name)
	{
		this.number = number;
		this.name = name;
		System.out.println("Passport no");
		System.out.println("Name of the Passport");
	}
	
	public Passport(int expirydate,String country,String issuedate)
	{
		this.expiryDate = expiryDate;
		this.country = country;
		this.issueDate = issueDate;
		System.out.println("Passport expiry Date");
		System.out.println("Country name");
		System.out.println("issue date");
	}
	
	public Passport(String country,int number,int expiryDate)
	{
		this.country = country;
		this.number = number;
		this.expiryDate=expiryDate;
		System.out.println("name of the country");
		System.out.println("Passport number");
		System.out.println("expiry date");
	}
	
	public Passport(int number,int expiryDate)
	{
		this.number = number;
		this.expiryDate = expiryDate;
		System.out.println("Passport no");
		System.out.println("expiry Date");
	}
	
	public Passport(String country,String name) 
	{
		this.country = country;
		this.name = name;
		System.out.println("Country name");
		System.out.println("name of the Passport");
	}

}
