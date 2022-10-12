package program;

public class ChocolateRunner {

	public static void main(String[] args) {
		
		
		Chocolate Chocolate1=new Chocolate();
		
		System.out.println(Chocolate1.name);
		System.out.println(Chocolate1.brand);
		System.out.println(Chocolate1.price);
		System.out.println(Chocolate1.flavour);
		
		System.out.println("Description of Chocolate");
		
		Chocolate1.name="Dairymilk";
		Chocolate1.brand="cadbury";
		Chocolate1.price=10;
		Chocolate1.flavour="choco";
		
		System.out.println(Chocolate1.name);
		System.out.println(Chocolate1.brand);
		System.out.println(Chocolate1.price);
		System.out.println(Chocolate1.flavour);
		
		
	}

}
