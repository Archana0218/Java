package Daily_Practice;

public class switch_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4;
		if(x==1)
		{
			System.out.println("The value of x is 1");
		}
		else if(x==2)
		{
			System.out.println("The value of x is 2");
		}
		else if(x==3)
		{
			System.out.println("The value of x is 3");
		}
		else
		{
			System.out.println("The value of x is other than 1,2,3");
		}
		switch(x)
		{
		case 1:
			System.out.println("The value of x is 1");
		case 2:
			System.out.println("The value of x is 2");
		case 3:
			System.out.println("The value of x is 3");
		
		
		break;
		 default:
			System.out.println("The value of x is other than 1,2,3");
		}
		}

}
