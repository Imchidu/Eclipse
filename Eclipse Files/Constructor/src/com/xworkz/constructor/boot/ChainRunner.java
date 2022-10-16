package com.xworkz.constructor.boot;

import com.xworkz.constructor.Chain;

public class ChainRunner {

	public static void main(String[] args) {
		
		Chain chain=new Chain("steel");
		System.out.println(chain.Type);
		
		Chain chain1=new Chain("steel",150);
		System.out.println(chain.Type);
		System.out.println(chain.Price);
		
		Chain chain2=new Chain("steel",150,10,"good", 0950.6);
		System.out.println(chain.Type);
		System.out.println(chain.Price);
		System.out.println(chain.Length);
		System.out.println(chain.Material);
		
		Chain chain3=new Chain("steel",150,10,"good", 0950.6,true);
		System.out.println(chain.Type);
		System.out.println(chain.Price);
		System.out.println(chain.Length);
		System.out.println(chain.Material);
		System.out.println(chain.Weight);
		System.out.println(chain.Stolen);
		
		Chain chain4=new Chain("steel",150,10,"good", 0950.6,true,"binding");
		System.out.println(chain.Type);
		System.out.println(chain.Price);
		System.out.println(chain.Length);
		System.out.println(chain.Material);
		System.out.println(chain.Weight);
		System.out.println(chain.Stolen);
		System.out.println(chain.UsedFor);
		
		Chain chain5=new Chain("steel",150,10,"good", 0950.6,true,"binding",false);
		System.out.println(chain.Type);
		System.out.println(chain.Price);
		System.out.println(chain.Length);
		System.out.println(chain.Material);
		System.out.println(chain.Weight);
		System.out.println(chain.Stolen);
		System.out.println(chain.UsedFor);
		System.out.println(chain.Fresh);

		
	}

}
