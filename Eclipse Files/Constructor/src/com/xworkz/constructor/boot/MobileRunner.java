package com.xworkz.constructor.boot;

import com.xworkz.constructor.constants.Mobile;
import com.xworkz.constructor.constants.name;

public class MobileRunner {

	public static void main(String[] args) {
		Mobile details=new Mobile{int price,name brand,String color,String quality,boolean durable,double batchno};
		details.displaydeatils();

	}

}
