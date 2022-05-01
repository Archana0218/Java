package Daily_Practice;

public class Staticage {
static int age;

	public static void main(String[] args) {
		Staticage a=new Staticage();
		a.age=30;
		Staticage b=new Staticage();
		b.age=60;
		System.out.println("age is:" +a.age);
		System.out.println("age is: "+b.age);

	}

}
