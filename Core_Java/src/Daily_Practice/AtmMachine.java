package Daily_Practice;

public class  AtmMachine{
	
		double atmAmount;
		public void getAmountinfo()
		{
			atmAmount=45000;
			System.out.println("we have amount in the ATM is: "+atmAmount);
		}
		
	}

	class MoneyWindrawal extends AtmMachine
	{
		
		private double widrwalAmount;
		public void getAmountinfo()
		{
			widrwalAmount=23000;	
			System.out.println("we have widrawal amount in the ATM is: "+widrwalAmount);
		}
		
	}

	class AtmTest
	{
		public static void main(String[] args) {
			
			MoneyWindrawal moneyWindrawal=new MoneyWindrawal();
			moneyWindrawal.getAmountinfo();
		}
	}



