package Daily_Practice;



public class genericMethod {
	public<T> void methodgen(T var1)
	{
		System.out.println("The value passed is of type"+var1.getClass().getSimpleName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericMethod ob=new genericMethod();
		ob.<String>methodgen("Hello");
		ob.methodgen("Learning Java");
		ob.methodgen(123);

	}

}
