package Daily_Practice;

public class min {

	public static int main(int[] arr) {
		// TODO Auto-generated method stub
		int min=0;
		min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i]) {
				min=arr[i];
			}
		}
	
		return min;
	}


}
