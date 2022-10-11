package program;

public class SoftwareDeveloperRunner {

	public static void main(String[] args) {
		
		SoftwareDeveloper SoftwareDeveloper1=new SoftwareDeveloper();
		
		System.out.println(SoftwareDeveloper1.name);
		System.out.println(SoftwareDeveloper1.education);
		System.out.println(SoftwareDeveloper1.experience);
		System.out.println(SoftwareDeveloper1.salary);
		System.out.println(SoftwareDeveloper1.company);
		
		SoftwareDeveloper1.name="omkar";
		SoftwareDeveloper1.education="BCA";
		SoftwareDeveloper1.experience=12.5;
		SoftwareDeveloper1.salary=40;
		SoftwareDeveloper1.company="MNC";
		
		System.out.println("Details of Software Developer");
		
		System.out.println(SoftwareDeveloper1.name);
		System.out.println(SoftwareDeveloper1.education);
		System.out.println(SoftwareDeveloper1.experience);
		System.out.println(SoftwareDeveloper1.salary);
		System.out.println(SoftwareDeveloper1.company);
		
	}

}
