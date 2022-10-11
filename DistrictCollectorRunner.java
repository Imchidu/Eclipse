package program;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
     
		DistrictCollector DistrictCollector1=new DistrictCollector();
		
		System.out.println(DistrictCollector1.name);
		System.out.println(DistrictCollector1.age);
		System.out.println(DistrictCollector1.district);
		System.out.println(DistrictCollector1.batchno);
		
		DistrictCollector1.name="Ravi D Channanavar";
		DistrictCollector1.age=35;
		DistrictCollector1.district="Gadag";
		DistrictCollector1.batchno=25;
		
		System.out.println("Details of DistrictCollectors");
		
		System.out.println(DistrictCollector1.name);
		System.out.println(DistrictCollector1.age);
        System.out.println(DistrictCollector1.district);
        System.out.println(DistrictCollector1.batchno);

		
		
	}

}
