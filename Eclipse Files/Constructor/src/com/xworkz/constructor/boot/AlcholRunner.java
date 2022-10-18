package com.xworkz.constructor.boot;

import com.xworkz.constructor.Alchol;

public class AlcholRunner {

	public static void main(String[] args) {
		
		int[] quantity= {180,360,750};
		int[] price= {150,400,850};
		String[] pakage= {"tetra","bottle"};
		String[] brand= {"OMR","MC","IB","100 PIPERS","ROYAL STAG"};
		
		Alchol details=new Alchol("raghu","alchol",26,"reddiush black",true,quantity,price,pakage,brand);
		details.displaydetails();
		

		Alchol details1=new Alchol("rohan","alchol",24,"reddiush black",true,quantity,price,pakage,brand);
		details.displaydetails();
		

		Alchol details2=new Alchol("maltesh","alchol",22,"reddiush black",true,quantity,price,pakage,brand);
		details.displaydetails();
		

	}

}
