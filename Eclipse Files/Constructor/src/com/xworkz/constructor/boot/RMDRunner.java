package com.xworkz.constructor.boot;

import com.xworkz.constructor.RMD;

public class RMDRunner {

	public static void main(String[] args) {
		
		RMD gutka=new RMD();
		
		System.out.println(gutka.type);
		System.out.println(gutka.brand);
		System.out.println(gutka.company);
		System.out.println(gutka.logo);
		System.out.println(gutka.location);
		System.out.println(gutka.price);
		System.out.println(gutka.gst);
		System.out.println(gutka.quantity);
		System.out.println(gutka.quality);
		
		gutka.owner="Rasiklal Manickchand Dherival";
		gutka.chemicals="nicotine";
		gutka.productionQuality="Good";
		gutka.color="white";
		gutka.tobaccoQuantity=40.0;
		gutka.export="all over country";
		gutka.originatedPlace="india";
		gutka.brandAmbassader="itc group";
		gutka.discount=5;
		
		System.out.println(gutka.owner);
		System.out.println(gutka.chemicals);
		System.out.println(gutka.productionQuality);
		System.out.println(gutka.color);
		System.out.println(gutka.tobaccoQuantity);
		System.out.println(gutka.export);
		System.out.println(gutka.originatedPlace);
		System.out.println(gutka.brandAmbassader);
		System.out.println(gutka.discount);
		
		RMD panmasala=new RMD();
		panmasala.brand="Super";
		System.out.println(panmasala.brand);
		

	}

}
