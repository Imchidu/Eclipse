package com.xworkz.constructor.boot;

import com.xworkz.constructor.Bags;

public class BagsRunner {

	public static void main(String[] args) {

		String[] Colors= {"black","red","brown","grey"};
		String[] material= {"polythene","synthetic"};
		char[] size= {'S','M','L'};
		int[] price= {2000,1200,550};
		String[] capacity= {"50L","20L","15L"};
		String[] brand= {"Skybags","Travelgo","Dell"};
		
		Bags details=new Bags("Good","300gms",4,4,2,true,Colors,material,size,price,capacity,brand);
		details.display();
		
		System.out.println(System.lineSeparator());
		
		Bags details1=new Bags("best","400gms",3,2,1,true,Colors,material,size,price,capacity,brand);
		details1.display();
		
		Bags details2=new Bags("notGood","150gms",2,1,0,true,Colors,material,size,price,capacity,brand);
		details2.display();
	}

}
