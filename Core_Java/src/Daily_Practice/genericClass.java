package Daily_Practice;

class GenericExample<T>{
	GenericExample(){
		System.out.println("The generic class is declared now. You can use it well");
	}
	public void methodgeneric(T obj)
	{
		System.out.println("the type of the object that this class now contains is "+obj.getClass().getSimpleName());
	}
}
public class genericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericExample<Integer> test=new GenericExample<>();
		Integer a=5;
		test.methodgeneric(a);
		GenericExample<String>testString =new GenericExample<>();
		String s="Hello";
		testString.methodgeneric(s);
	}

}
