package Daily_Practice;


import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReader 
{

public static void main(String args[]) throws IOException
  

{
		// TODO Auto-generated method stub
		InputStreamReader r =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader();
		System.out.println("Enter Your Name: ");
		String name=br.readLine();
System.out.println("Welcome:"+name);


	}

	
	

}


