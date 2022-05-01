package Daily_Practice;

class ThisExample

{
	int age;

	ThisExample(int age) {
		this.age = age;

	}
}

public class thiskeyword {

	public static void main(String[] args) {
	
		ThisExample TE = new ThisExample(23);
		System.out.println("age is:" + TE.age);

	}

}
