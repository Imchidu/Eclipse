package com.xworkz.constructor.boot;

import com.xworkz.constructor.Ciggerate;


public class CiggerateRunner {

	public static void main(String[] args) {
		
		Ciggerate smoke=new Ciggerate();
		
	System.out.println(smoke.type);
	System.out.println(smoke.brand);
	System.out.println(smoke.company);
	System.out.println(smoke.logo);
	System.out.println(smoke.location);
	System.out.println(smoke.price);
	System.out.println(smoke.gst);
	System.out.println(smoke.quantity);
	System.out.println(smoke.quality);
	
	smoke.owner="ITC Limited";
	smoke.chemicals="nicotine";
	smoke.productionQuality="Good";
	smoke.color="white";
	smoke.tobaccoQuantity=0.0;
	smoke.export="all over country";
	smoke.originatedPlace="Delhi";
	smoke.brandAmbassader="itc group";
	smoke.discount=10;

	
	System.out.println(smoke.owner);
	System.out.println(smoke.chemicals);
	System.out.println(smoke.productionQuality);
	System.out.println(smoke.color);
	System.out.println(smoke.tobaccoQuantity);
	System.out.println(smoke.export);
	System.out.println(smoke.originatedPlace);
	System.out.println(smoke.brandAmbassader);
	System.out.println(smoke.discount);
	
	Ciggerate smoke1= new Ciggerate();
	smoke1.brand = "Kings";
	System.out.println(smoke1.brand);
	
	
	}

}
