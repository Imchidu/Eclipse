package com.xworkz.constructor.boot;

import com.xworkz.constructor.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {

		TextileShop textileShop=new TextileShop("rohan");
		System.out.println(textileShop.OwnerName);

		TextileShop textileShop1=new TextileShop("rohan", "anulekha");
		System.out.println(textileShop1.OwnerName);
		System.out.println(textileShop1.OwnerWifeName);
		
		TextileShop textileShop2=new TextileShop("rohan", "anulekha", "gotilla");
		System.out.println(textileShop2.OwnerName);
		System.out.println(textileShop2.OwnerWifeName);
		System.out.println(textileShop2.OwnerDaughterName);
		
		TextileShop textileShop3=new TextileShop("rohan", "anulekha", "gotilla", 9874561230l);
		System.out.println(textileShop3.OwnerName);
		System.out.println(textileShop3.OwnerWifeName);
		System.out.println(textileShop3.OwnerDaughterName);
		System.out.println(textileShop3.OwnerDaughterNumber);
		
		TextileShop textileShop4=new TextileShop("rohan", "anulekha", "gotilla", 9874561230l,1);
		System.out.println(textileShop4.OwnerName);
		System.out.println(textileShop4.OwnerWifeName);
		System.out.println(textileShop4.OwnerDaughterName);
		System.out.println(textileShop4.OwnerDaughterNumber);
		System.out.println(textileShop4.OwnersNoofWifes);
		
		TextileShop textileShop5=new TextileShop("rohan", "anulekha", "gotilla", 9874561230l ,1 ,45);
		System.out.println(textileShop5.OwnerName);
		System.out.println(textileShop5.OwnerWifeName);
		System.out.println(textileShop5.OwnerDaughterName);
		System.out.println(textileShop5.OwnerDaughterNumber);
		System.out.println(textileShop5.OwnersNoofWifes);
		System.out.println(textileShop5.ShopNo);
		
		TextileShop textileShop6=new TextileShop("rohan", "anulekha", "gotilla", 9874561230l ,1 ,45,7894561203l);
		System.out.println(textileShop6.OwnerName);
		System.out.println(textileShop6.OwnerWifeName);
		System.out.println(textileShop6.OwnerDaughterName);
		System.out.println(textileShop6.OwnerDaughterNumber);
		System.out.println(textileShop6.OwnersNoofWifes);
		System.out.println(textileShop6.ShopNo);
		System.out.println(textileShop6.ContactNo);
		
		TextileShop textileShop7=new TextileShop("rohan", "anulekha", 1);
		System.out.println(textileShop7.OwnerName);
		System.out.println(textileShop7.OwnerWifeName);
		System.out.println(textileShop7.OwnersNoofWifes);
	}

}
