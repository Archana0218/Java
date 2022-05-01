package Daily_Practice;

public class Single_Inheritance 
{

	void add()
	{
		int a=2; int b=1;
		System.out.println("Additiion :"+(a+b));
	}

}
class sub1 extends Single_Inheritance
	{
		
		void div()
		{
			int a=2; int b=98;
			
			System.out.println("Division :"+(a/b));
		}
		void subs() 
		{
			int a=22;
			int b=21;
			System.out.println("Substraction :"+(a-b));
			
		}


	public static void main(String[] args) 
	{
		sub1 s=new sub1();
		s.add();
		s.subs();
		s.div();
		

	}
	
}


