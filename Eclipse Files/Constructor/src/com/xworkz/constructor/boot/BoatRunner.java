package com.xworkz.constructor.boot;

import com.xworkz.constructor.Boat;

public class BoatRunner {

	public static void main(String[] args) {
		Boat ship = new Boat("headphone","Black");
		System.out.println(ship.name);
		System.out.println(ship.color);
		System.out.println("======================================");

		
		Boat ship1 = new Boat("blue",'L');
		System.out.println(ship1.color);
		System.out.println(ship1.type);
		System.out.println("======================================");

		
		Boat ship2 = new Boat('M',"ccc");
		System.out.println(ship2.type);
		System.out.println(ship2.owner);
		System.out.println("======================================");

		Boat ship3 = new Boat("jbl",'s',"headphone");
		System.out.println(ship3.companyName);
		System.out.println(ship3.type);	
		System.out.println(ship3.name);	
		System.out.println("======================================");

		
		Boat ship4 = new Boat('z',"black","amangupta");
		System.out.println(ship4.type);
		System.out.println(ship4.color);
		System.out.println(ship4.owner);
		System.out.println("======================================");

		
		Boat ship5 = new Boat("headphone","green",'x');
		System.out.println(ship5.name);
		System.out.println(ship5.color);
		System.out.println(ship5.type);
		System.out.println("======================================");

		
		Boat ship6 = new Boat("gauravkhatare","White","noise");
		System.out.println(ship6.owner);
		System.out.println(ship6.color);
		System.out.println(ship6.name);
		System.out.println("======================================");

		
		Boat ship7 = new Boat('L');
		System.out.println(ship7.type);
	}

	

}
