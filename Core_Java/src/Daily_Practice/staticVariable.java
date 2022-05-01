package Daily_Practice;

public class staticVariable {
	static int a = 10;

	public static void main(String[] args) {
		System.out.println("sv1.a value:" + staticVariable.a);
		System.out.println("sv2.a value:" + staticVariable.a);

		// change value of a
		staticVariable.a = 20;
		System.out.println("sv1.a value:" + staticVariable.a);
		System.out.println("sv2.a value: " + staticVariable.a);
	}

}
