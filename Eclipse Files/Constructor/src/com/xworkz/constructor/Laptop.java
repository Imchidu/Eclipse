package com.xworkz.constructor;

public class Laptop {
	public String quality;
	public String weight;
	public int windows;
	public int ram;	
	public boolean logo;
	
	public String[] colors;
	public String[] material;
	public int[] price;
	public String[] storage;
	public String[] brand;
	
	
	public Laptop(String quality,String weight,int ram,int windows,boolean logo,String colors[],
			String material[],int price[],String storage[],String brand[]) 
	{
		this.quality=quality;
		this.weight=weight;
		this.windows=windows;
		this.logo=logo;
		this.ram=ram;
		this.colors=colors;
		this.material=material;
		this.price=price;
		this.storage=storage;
		this.brand=brand;
		
		System.out.println("Creating Instance Variables");

			
	}
	
	public void display() {
		
		System.out.println("====================");
		System.out.println(this.quality);
		
		System.out.println(this.weight);
		System.out.println(this.windows);
		System.out.println(this.ram);
		System.out.println(this.logo);

		for(int i=0;i<this.colors.length;i++) {
			String banna=this.colors[i];
			System.out.println(banna);
			
		}
		
		for(int i=0;i<this.material.length;i++) {
			String vasthuu=this.material[i];
			System.out.println(vasthuu);
			
		}
		
		
		
		for(int i=0;i<this.price.length;i++) {
			int bele=this.price[i];
			System.out.println(bele);
			
		}
		
		for(int i=0;i<this.storage.length;i++) {
			String jaga=this.storage[i];
			System.out.println(jaga);
			
		}

		for(int i=0;i<this.brand.length;i++) {
			String hesaru=this.brand[i];
			System.out.println(hesaru);
			
		}
		
		
	}
	
	

}
