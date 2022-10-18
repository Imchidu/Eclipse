package com.xworkz.constructor;

public class Alchol {
	
	public String owner;
	public String type;
	public int batchno;
	public String color;
	public boolean smell;
	
	public int[] quantity;
	public int[] price;
	public String[] pakage;
	public String[] brand;
	
	public Alchol(String owner,String type,int batchno,String color,boolean smell,
			int[] quantity,int[] price,String[] pakage,String[] brand) {
		
		this.owner=owner;
		this.type=type;
		this.batchno=batchno;
		this.color=color;
		this.smell=smell;
		this.quantity=quantity;
		this.price=price;
		this.pakage=pakage;
		this.brand=brand;
		
		
		System.out.println("Printing alchol details");
		
	}
	 public void displaydetails() {
		 
		 System.out.println("============================");
		 
		 System.out.println(this.owner);
		 System.out.println(this.type);
		 System.out.println(this.batchno);
		 System.out.println(this.color);
		 
		 
		 for(int i=0;i<this.quantity.length;i++) {
				int praman=this.quantity[i];
				System.out.println(praman);
				
			}
		 
		 for(int i=0;i<this.price.length;i++) {
				int dara=this.price[i];
				System.out.println(dara);
				
			}
		 
		 for(int i=0;i<this.brand.length;i++) {
				String kanthe=this.brand[i];
				System.out.println(kanthe);
				
			}
		 
		 
		 
		 for(int i=0;i<this.pakage.length;i++) {
				String kanthe=this.pakage[i];
				System.out.println(kanthe);
				
			}
		 
		 
		 
	 }
	
	
	
}
