package com.xworkz.constructor.boot;

import com.xworkz.constructor.Bread;

public class BreadRunner {

	public static void main(String[] args) {
		Bread eat = new Bread('c');
		System.out.println(eat.type);
		System.out.println("======================================");

		Bread eat1 = new Bread("Square");
		System.out.println(eat1.shape);
		System.out.println("======================================");

		Bread eat2 = new Bread(35);
		System.out.println(eat2.price);
		System.out.println("======================================");

		Bread eat3 = new Bread(65.5);
		System.out.println(eat3.quantity);		
		System.out.println("======================================");

		Bread eat4 = new Bread("KH Bread",'m');
		System.out.println(eat4.companyName);
		System.out.println(eat4.type);
		System.out.println("======================================");

		Bread eat5 = new Bread(45.0,25);
		System.out.println(eat5.quantity);
		System.out.println(eat5.price);
		System.out.println("======================================");

		Bread eat6 = new Bread(55,'s');
		System.out.println(eat6.price);
		System.out.println(eat6.type);
		System.out.println("======================================");

		Bread eat7 = new Bread("Square",30.0);
		System.out.println(eat7.shape);
		System.out.println(eat7.quantity);

	}

}
