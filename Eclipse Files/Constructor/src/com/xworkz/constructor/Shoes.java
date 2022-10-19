package com.xworkz.constructor;

public class Shoes {


	public String brand;
	public boolean waterressistant;
	public int mfgyear;
	public String quality;
	public boolean withlace;
	
	public String[] colors;
	public int[] no;
	public String[] type;
	public double[] price ;
	public char[] size;
	public double[] weight;
	
	public Shoes(String brand, boolean waterressistant,int mfgyear,String quality,boolean withlace,
			String[] colors,int[] no,String[] type,double[] price,char[] size,double[] weight) {
		
		
		this.brand=brand;
		this.waterressistant=waterressistant;
		this.mfgyear=mfgyear;
		this.quality=quality;
		this.withlace=withlace;
		this.no=no;
		this.type=type;
		this.price=price;
		this.size=size;
		this.weight=weight;
		this.colors=colors;
	}
	
	
	public void showdetials() {
		
		System.out.println("printing Shoes details");
		System.out.println("=============================");
		System.out.println(this.brand);
		System.out.println(this.waterressistant);
		System.out.println(this.mfgyear);
		System.out.println(this.quality);
		System.out.println(this.withlace);
		System.out.println("=============================");
		
		System.out.println(System.lineSeparator());
		
		for(int i=0; i<this.colors.length; i++){
		   String banna=this.colors[i];
		   System.out.println(banna);
		   System.out.println("=============================");
		}
		
		for(int i=0; i<this.no.length; i++){
		   int sanke=this.no[i];
		    System.out.println(sanke);
		    System.out.println("=============================");
		}
		
		for(int i=0; i<this.type.length; i++){
			String madariya=this.type[i];
			System.out.println(madariya);
			System.out.println("=============================");
			}
		
		for(int i=0; i<this.price.length; i++){
			double bele=this.price[i];
			System.out.println(bele);
			System.out.println("=============================");
			}
		
		
		for(int i=0; i<this.size.length; i++){
			char gatra=this.size[i];
			System.out.println(gatra);
			System.out.println("=============================");
			}
		
		
		for(int i=0; i<this.weight.length; i++){
			double gatra=this.weight[i];
			System.out.println(gatra);
			System.out.println("=============================");
			}
			
		
	}

		
	
}
