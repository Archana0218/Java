package Daily_Practice;

class gen<T>
{
	T ob;
	gen(T o)
	{
		ob=o;
	}
	public T getOb()
	{
		return ob;
	}
	}

public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
gen<Integer> iob=new gen<>(100);
int x=iob.getOb();
System.out.println(x);
gen<String> sob =new gen<>("Hello");
String str = sob.getOb();
System.out.println(str);
	}

}
