package Daily_Practice;

public class wrapper_cls_ex {
	public static void main(String[] args) {
		int a = 4;
		double b = 12.25;

		Integer Obj1 = Integer.valueOf(a);
		Double Obj2 = Double.valueOf(b);

		if (Obj1 instanceof Integer) {
			System.out.println("An object of Integer is created.");
		}
		if (Obj2 instanceof Double) {
			System.out.println("An object of Double is created.");
		}

	}
}
