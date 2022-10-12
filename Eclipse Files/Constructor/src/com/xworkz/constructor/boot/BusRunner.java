package com.xworkz.constructor.boot;

import com.xworkz.constructor.*;
public class BusRunner {

	public static void main(String[] args) {
		
		Bus Bus1=new Bus();
		System.out.println(Bus1.no);
		System.out.println(Bus1.starting);
		System.out.println(Bus1.destination);
		
		Bus1.no="KA 29 C 7852";
		Bus1.starting="Banglore";
	    Bus1.destination="Bagalkot";
		
	    System.out.println("Travelling in Bus");
		System.out.println(Bus1.no);
		System.out.println(Bus1.starting);
		System.out.println(Bus1.destination);
		

	}

}
