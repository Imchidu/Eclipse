package com.xworkz.constructor;

public class Tractor {
	
	public String Name;
	public String Brand;
	public int Price;
	public String Colour;
	public int Hp;
	public String Model;
	
	public Tractor(String Name) {
		this.Name=Name;
		System.out.println("Creating Name");
		System.out.println("***********************************************");
	}
	
	public Tractor(String Name, int Price) {
		this(Name);
		this.Price=Price;
		System.out.println("Creating Name and Price");
		System.out.println("***********************************************");

	}
	
	public Tractor(String Name, int Price, String Brand) {
		this(Name,Price);
		this.Brand=Brand;
		System.out.println("Creating Name ,Price and Brand ");
		System.out.println("***********************************************");

	}
	
	public Tractor(String Name, int Price, String Brand, int Hp) {
		this(Name,Price,Brand);
		this.Hp=Hp;
		System.out.println("Creating Name ,Price , Brand and Hp ");
		System.out.println("***********************************************");

	}
	
	public Tractor(String Name, int Price, String Brand, int Hp, String Colour) {
		this(Name,Price,Brand,Hp);
		this.Colour=Colour;
		System.out.println("Creating Name ,Price , Brand, Hp and Colour ");
		System.out.println("***********************************************");

	}
	
	public Tractor(String Name,  int Price,String Brand, int Hp, String Colour, String Model) {
		this(Name,Price,Brand,Hp,Colour);
		this.Model=Model;
		System.out.println("Creating Name ,Price , Brand, Hp, Colour and Model ");
		System.out.println("***********************************************");

	}

}
