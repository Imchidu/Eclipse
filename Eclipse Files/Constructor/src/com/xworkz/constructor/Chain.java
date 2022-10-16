package com.xworkz.constructor;

public class Chain {
	public String Type;
	public int Price;
	public int Length;
	public String Material;
	public double Weight;
	public boolean Stolen;
	public String UsedFor;
	public boolean Fresh;
	
	
	public Chain(String Type) {
		this.Type=Type;
		System.out.println("Creating type");
		System.out.println("***********************************************");

		
	}

	public Chain(String Type,int Price) {
		this(Type);
		this.Price=Price;
		System.out.println("Creating type and price");
		System.out.println("***********************************************");

		
	}

	public Chain(String Type,int Price,int Length,String Material, double Weight) {
		this(Type,Price);
		this.Length=Length;
		this.Material=Material;
		System.out.println("Creating type,price,length and material and Weight");
		System.out.println("***********************************************");
	}
		

	public Chain(String Type,int Price,int Length,String Material,double Weight,boolean Stolen) {
		
		this(Type,Price,Length,Material,Weight);
		this.Stolen=Stolen;
		System.out.println("Creating type,price,length, material,Weight and Stolen ");
		System.out.println("***********************************************");
	}
	
    public Chain(String Type,int Price,int Length,String Material,double Weight,boolean Stolen,String UsedFor) {
		
		this(Type,Price,Length,Material,Weight,Stolen);
		this.UsedFor=UsedFor;
		System.out.println("Creating type,price,length, material,Weight and Stolen ");
		System.out.println("***********************************************");
	}
	
   public Chain(String Type,int Price,int Length,String Material,double Weight,boolean Stolen,String UsedFor,boolean Fresh) {
		
		this(Type,Price,Length,Material,Weight,Stolen,UsedFor);
		this.Fresh=Fresh;
		System.out.println("Creating type,price,length, material,Weight and Stolen ");
		System.out.println("***********************************************");
	}
	
	
	
	
}
