package Daily_Practice;

public class jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = count++;
		System.out.println("contents of 2d jagged array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.println(arr[i][j] + "");
			System.out.println();
		}

	}

}