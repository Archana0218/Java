package Daily_Practice;
interface hellointerface
{
	void print();
	int i=22;
}
interface DISMSG
{
	void show();
}

 class msg implements hello,DISMSG
{
	public void print() {
		System.out.println("welcome");
	}
	public void show()
	{
		System.out.println("World");
	}
	@Override
	public void syso() {
		// TODO Auto-generated method stub
		
	}
	}

public class intfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		msg m=new msg ();
		m.print();
		m.show();
	}

}
