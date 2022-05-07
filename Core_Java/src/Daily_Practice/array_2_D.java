/*ex:
 * int[][] intArray =new int[10][20];
 * int[][][] intArray=new int[10][20][30]*/
package Daily_Practice;

public class array_2_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 4 }, { 5, 6, 9 }, { 7, 3, 8 } };
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++)

				System.out.println(arr[i][j] + " ");
			System.out.println();
		}
	}

}
