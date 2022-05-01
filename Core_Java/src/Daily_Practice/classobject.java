package Daily_Practice;

public class classobject {
	// data member 
	int yearofpur;
	String model;
	double cost;
	//member fun
	
	public void dis()
	{
		System.out.println("Year of purchase"+2000);
		System.out.println("make"+"suzuki");
		System.out.println("Cost of car"+10l);
	}
	public void dis2()
	{
		System.out.println("Year of purchase"+2022);
		System.out.println("make"+"maruti");
		System.out.println("Cost of car"+2l);
	}
	public static void main(String[] args) {
		classobject co=new classobject ();
		co.dis();
		co.dis2();

	}

}
