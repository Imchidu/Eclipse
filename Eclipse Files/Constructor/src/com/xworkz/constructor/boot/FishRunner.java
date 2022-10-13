package com.xworkz.constructor.boot;

import com.xworkz.constructor.Fish;

public class FishRunner {

	public static void main(String[] args) {
		
		Fish river=new Fish("fff","shark");
		
		System.out.println(river.name);
		System.out.println(river.type);
		
		Fish river1=new Fish(100,"1kg");
		System.out.println(river1.price);
		System.out.println(river1.weight);
		
		
		Fish river2=new Fish(100,30);
		System.out.println(river2.price);
		System.out.println(river2.length);
		
		Fish river3=new Fish("30","fff");
		System.out.println(river3.length);
		System.out.println(river3.name);
		
		Fish river4=new Fish(30,"100");
		System.out.println(river4.length);
		System.out.println(river4.price);
		
	
		Fish river5=new Fish(30,100,"fff");
		System.out.println(river5.length);
		System.out.println(river5.price);
		System.out.println(river5.name);
		
		Fish river6=new Fish(100,30,"1kg");
		System.out.println(river6.price);
		System.out.println(river6.length);
		System.out.println(river6.weight);
	
		Fish river7=new Fish("fff",30,100,"shark");
		System.out.println(river7.name);
		System.out.println(river7.length);
		System.out.println(river7.price);
		System.out.println(river7.type);
	}

}
