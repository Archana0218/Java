package Daily_Practice;

public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		boolean isPrime=true;
		for(int i=2; i<n/2;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
			}
		}
		if(isPrime==true)
		{
			System.out.println("The no is prime");
		}
		else
		{
			System.out.println("The no is not prime");
		}
	}

}
