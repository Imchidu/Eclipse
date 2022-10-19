package com.xworkz.constructor.boot;

import com.xworkz.constructor.Shoes;

public class ShoesRunner {

	public static void main(String[] args) {
	
		String[] colors={"white","black","red","blue"};
		int[] no= {10,8,9,7};
		String[] type={"casual","sports","sneakers","formal"};
		double[] price= {1200,2000,500,800};
		char[] size= {'s','m','l'};
		double[] weight= {800,1000,400,350};
		
		Shoes details=new Shoes("Addidas",false,2022,"good",true,colors,no,type,price,size,weight);
		details.showdetials();
	}

}
