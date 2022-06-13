package Daily_Practice;



public class FinallyBlock {

	public static void main(String[] args) {
		try {
			int data = 4/2;
			System.out.println(data);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is always excueted");
		}
	}

}