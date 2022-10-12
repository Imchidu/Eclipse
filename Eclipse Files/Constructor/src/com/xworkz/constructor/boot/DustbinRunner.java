package com.xworkz.constructor.boot;

import com.xworkz.constructor.Dustbin;

public class DustbinRunner {

	public static void main(String[] args) {
         
		  Dustbin plastic=new Dustbin ();
		
		System.out.println(plastic.type);
		System.out.println(plastic.brand);
		System.out.println(plastic.company);
		System.out.println(plastic.logo);
		System.out.println(plastic.location);
		System.out.println(plastic.price);
		System.out.println(plastic.gst);
		System.out.println(plastic.quantity);
		System.out.println(plastic.quality);
		
		plastic.owner="super";
		plastic.chemicals="carbon";
		plastic.productionQuality="Good";
		plastic.color="red";
		plastic.Quantity=150.0;
		plastic.export="all over country";
		plastic.originatedPlace="india";
		plastic.brandAmbassader="plastic group";
		plastic.discount=5;
		
		System.out.println(plastic.owner);
		System.out.println(plastic.chemicals);
		System.out.println(plastic.productionQuality);
		System.out.println(plastic.color);
		System.out.println(plastic.Quantity);
		System.out.println(plastic.export);
		System.out.println(plastic.originatedPlace);
		System.out.println(plastic.brandAmbassader);
		System.out.println(plastic.discount);
		
		Dustbin plastic1=new Dustbin();
		plastic1.brand="Super";
		System.out.println(plastic1.brand);

	}

}
