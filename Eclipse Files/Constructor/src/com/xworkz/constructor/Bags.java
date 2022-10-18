package com.xworkz.constructor;

public class Bags {
	
	public String quality;
	public String weight;
	public int noofjips;
	public int noofcompartments;	
	public double bottleholder;
	public boolean logo;
	
	public String[] colors;
	public String[] material;
	public char[] size;
	public int[] price;
	public String[] capacity;
	public String[] brand;
	
	
	public Bags(String quality,String weight,int noofjips,int noofcompartments,double bottleholder,boolean logo,String colors[],
			String material[], char size[],int price[],String capacity[],String brand[]) 
	{
		this.quality=quality;
		this.weight=weight;
		this.noofjips=noofjips;
		this.noofcompartments=noofcompartments;
		this.bottleholder=bottleholder;
		this.logo=logo;
		this.colors=colors;
		this.size=size;
		this.material=material;
		this.price=price;
		this.capacity=capacity;
		this.brand=brand;
		
		System.out.println("Creating Instance Variables");

			
	}
	
	public void display() {
		
		System.out.println("====================");
		System.out.println(this.quality);
		System.out.println(this.weight);
		System.out.println(this.noofjips);
		System.out.println(this.noofcompartments);
		System.out.println(this.bottleholder);
		System.out.println(this.logo);

		for(int i=0;i<this.colors.length;i++) {
			String banna=this.colors[i];
			System.out.println(banna);
			
		}
		
		for(int i=0;i<this.material.length;i++) {
			String vasthuu=this.material[i];
			System.out.println(vasthuu);
			
		}
		
		for(int i=0;i<this.colors.length;i++) {
			String banna=this.colors[i];
			System.out.println(banna);
			
		}
		
		for(int i=0;i<this.price.length;i++) {
			int bele=this.price[i];
			System.out.println(bele);
			
		}
		
		for(int i=0;i<this.capacity.length;i++) {
			String jaga=this.capacity[i];
			System.out.println(jaga);
			
		}

		for(int i=0;i<this.brand.length;i++) {
			String hesaru=this.brand[i];
			System.out.println(hesaru);
			
		}
		
		
	}
	
	
	
		
}
