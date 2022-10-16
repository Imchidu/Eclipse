package com.xworkz.constructor;

public class TextileShop {
	
	public String OwnerName;
	public String OwnerWifeName;
	public String OwnerDaughterName;
	public long OwnerDaughterNumber; 
	public int OwnersNoofWifes;
	public int ShopNo;
	public long ContactNo;
	
	public TextileShop(String OwnerName) {
		this.OwnerName=OwnerName;
		System.out.println("Creating Details of OwnerName ");
		System.out.println("***********************************************");

	}
	
	public TextileShop(String OwnerName, String OwnerWifeName) {
		this(OwnerName);
		this.OwnerWifeName=OwnerWifeName;
		System.out.println("Creating Details of OwnerName,OwnerWifeName");
		System.out.println("***********************************************");

	}
	
	public TextileShop(String OwnerName, String OwnerWifeName, String OwnerDaughterName) {
		this(OwnerName,OwnerWifeName);
		this.OwnerDaughterName=OwnerDaughterName;
		System.out.println("Creating Details of OwnerName,OwnerWifeName,OwnerDaughterName");
		System.out.println("***********************************************");

	}
	
	public TextileShop(String OwnerName, String OwnerWifeName, String OwnerDaughterName, long OwnerDaughterNumber) {
		this(OwnerName,OwnerWifeName,OwnerDaughterName);
		this.OwnerDaughterNumber=OwnerDaughterNumber;
		System.out.println("Creating Details of OwnerName,OwnerWifeName,OwnerDaughterName,OwnerDaughterNumber  ");
		System.out.println("***********************************************");

	}
	
	public TextileShop(String OwnerName, String OwnerWifeName, String OwnerDaughterName, long OwnerDaughterNumber,int OwnersNoofWifes) {
		this(OwnerName,OwnerWifeName,OwnerDaughterName,OwnerDaughterNumber);
		this.OwnersNoofWifes=OwnersNoofWifes;
		System.out.println("Creating Details of OwnerName,OwnerWifeName,OwnerDaughterName,OwnerDaughterNumber,OwnersNoofWifes ");
		System.out.println("***********************************************");

	}
	
	public TextileShop(String OwnerName, String OwnerWifeName, String OwnerDaughterName, long OwnerDaughterNumber,int OwnersNoofWifes,int ShopNo) {
		this(OwnerName,OwnerWifeName,OwnerDaughterName,OwnerDaughterNumber,OwnersNoofWifes);
		this.ShopNo=ShopNo;
		System.out.println("Creating Details of OwnerName,OwnerWifeName,OwnerDaughterName,OwnerDaughterNumber,OwnersNoofWifes,ShopNo ");
         System.out.println("***********************************************");

	}
	
	public TextileShop(String OwnerName, String OwnerWifeName, String OwnerDaughterName, long OwnerDaughterNumber,int OwnersNoofWifes,int ShopNo,long ContactNo) {
		this(OwnerName,OwnerWifeName,OwnerDaughterName,OwnerDaughterNumber,OwnersNoofWifes,ShopNo);
		this.ContactNo=ContactNo;
		System.out.println("Creating Details of OwnerName,OwnerWifeName,OwnerDaughterName,OwnerDaughterNumber,OwnersNoofWifes,ShopNo,ContactNo ");
        System.out.println("***********************************************");
		

	}
	
	public TextileShop(String OwnerName, String OwnerWifeName, int OwnersNoofWife) {
		this(OwnerName,OwnerWifeName);
		this.OwnersNoofWifes=OwnersNoofWife;
		System.out.println("Creating Details of OwnerName,OwnerWifeName,OwnerDaughterName,OwnerDaughterNumber,OwnersNoofWifes,ShopNo,ContactNo ");
System.out.println("***********************************************");

		
	}
	

}
