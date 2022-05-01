package Daily_Practice;

abstract class ATM
{

abstract void withdraw();
 
}

public class Dataabstraction extends ATM
{
	void withdraw()
	{
	System.out.println("withdraw successfull");
	}
	

	public static void main(String[] args) 
	{
		Dataabstraction ob=new Dataabstraction();
		ob.withdraw();
	}
}
