package com.xworkz.constructor.boot;

import com.xworkz.constructor.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {

		String[] Colors= {"black","white","silver","grey"};
		String[] material= {"plastic","aluminium"};
	
		int[] price= {35000,65000,90000};
		String[] storage= {"1TB","500GB","250GB"};
		String[] brand= {"DELL","HP","APPLE"};
		
		Laptop details=new Laptop("Good","900gms",11,4,true,Colors,material,price,storage,brand);
		details.display();
		
		System.out.println(System.lineSeparator());
		
		Laptop details1=new Laptop("Good","700gms",8,8,true,Colors,material,price,storage,brand);
		details1.display();
		
		Laptop details2=new Laptop("BEST","800gms",10,16,true,Colors,material,price,storage,brand);
		details2.display();
	
	}

}
