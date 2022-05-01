package Daily_Practice;

public class Poly {
	
	void add(int x, int y)
	{
		
	
		System.out.println("add 2 no: "+(x+y));
	}
	void add(int x, int y, int z)
	{
		
		System.out.println("add no: "+(x+y+z));
	}
	void sub(int x, int y, int z)
	{
		System.out.println("sub no: "+(x-y-z));
	}

	public static void main(String[] args) 
	{
		Poly ad=new Poly();
		ad.add(2,31);
		ad.add(21, 22,33);
		ad.sub(10, 20, 40);

	}

}
