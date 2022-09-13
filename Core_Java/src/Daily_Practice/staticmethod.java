package Daily_Practice;
/*it is used to initialize the static data member,
 * It is excuted before the main method at the time of classloading*/

public class staticmethod {
	static int i=100;
	static int n=30;
	static void sm()
	{
		int a=200;
		n=8;
		System.out.println("print a :"+a);
		System.out.println("print n :"+n);
		
		
	}

	public static void main(String[] args) {
		sm();
		
	}

}
