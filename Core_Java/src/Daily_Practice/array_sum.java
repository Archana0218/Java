package Daily_Practice;

public class array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,22,44,11,32,21,22};
		int arr1[]={1,3,23,31,21,32,22,11};
		int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			sum +=arr[i]+arr1[i];
			
		}
		System.out.println("array sum is :"+sum);

	}

}
