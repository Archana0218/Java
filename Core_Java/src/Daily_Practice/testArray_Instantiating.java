//Instantiating an array in java
/*Syntax: VAR-name=new type[size] 
 * Example: 
 * int[] intArray=new int[5];
 * or
 * int Array[]=new int[5];
 * 
 * int[] intArray=new int[]{1,2,3,4,5,6,7,8,9}*/

package Daily_Practice;

public class testArray_Instantiating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
