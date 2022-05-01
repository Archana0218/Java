package Daily_Practice;
/*java program to calculate the commission as follows: 
 * Sales_amount >= 100000, 
commission = 10%; 50000 <= Sales_amount < 100000, 
commission = 5%; 30000 <= Sales_amount < 50000, commission = 3%; 
Sales_amount < 30000, no commission.*/

import java.util.Scanner;


class studentcomission{
	
	
	int phone;
	String Name, Add;
	long sales_amount;
	int commissionPercentage = 0;
	void info()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name :"+Name);
		String Name=sc.next();
		System.out.println("Enter the Address :"+Add);
		String Add=sc.next();
		System.out.println("Enter the phone :"+phone);
		int Phone=sc.nextInt();
		System.out.println("Enter sales_account"+sales_amount);
		long sales_amount=sc.nextLong();
		System.out.println("Enter sales_account"+commissionPercentage);
		long comissionPercentage=sc.nextLong();
		
			
	}
	void display()
	{
		
		 
		
		double commission=(commissionPercentage/100)*sales_amount;

		System.out.println("Commission amount="+commission);
			
	}
	
}

public class hm_student {

	
	public static void main(String[] args) {
		studentcomission st=new studentcomission();
		st.info();
		st.display();
		

	}

}
