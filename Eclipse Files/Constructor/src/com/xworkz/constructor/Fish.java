package com.xworkz.constructor;

public class Fish {
	
	public String name;
	public String type;
	public int price;
	public String weight;
	public int length;
	
	
	public Fish(String name,String type) {
		
		this.name=name;
		this.type=type;
		System.out.println("finding the name and type");
		System.out.println("======================================");
	}
	
	public Fish(int price,String weight) {
		
		this.price=price;
		this.weight=weight;
		
		System.out.println("finding the price and weight");
		System.out.println("======================================");
	}
	
	
      public Fish(int price,int length) {
		
		this.price=price;
		this.length=length;
		
		System.out.println("finding the price and weight");
		System.out.println("======================================");
	}
      
      public Fish(String name,int length) {
  		
  		this.length=length;
  		this.name=name;
  		
  		System.out.println("finding the length and name");
  		System.out.println("======================================");
  	}
    
         public Fish(String name,int length,int price) {
    		
    		this.name=name;
    		this.length=length;
    		this.price=price;

    		System.out.println("finding the name,length and price");
    		System.out.println("======================================");
         }
      
         public Fish(int length,int price,String name) {
     		
     		this.length=length;
     		this.price=price;
     		this.name=name;
     		System.out.println("finding the name,length and price");
     		System.out.println("======================================");
          }
         
         public Fish(int length,String name,int price) {
      		
      		this.length=length;      		
      		this.name=name;
      		this.price=price;
      		
      		System.out.println("finding the length,name and price");
      		System.out.println("======================================");
           }
         
            public Fish(String name,int length,int price,String type) {
     		
     		this.name=name;
     		this.length=length;
     		this.price=price;
     		this.type=type;
     		
     		System.out.println("finding the name,length, price and type");
     		System.out.println("======================================");
            }
     
         

}
