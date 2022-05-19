package Daily_Practice;

import java.util.Scanner;

public class processor {
	

	public  void produce() throws InterruptedException{
		  synchronized(this){
			System.out.println("Producer thread running.....");
			wait();
			System.out.println("Rsumed.");
		}

	}
	public void consume() throws InterruptedException{
		try (Scanner scanner = new Scanner(System.in)) {
			Thread.sleep(2000);
			
			synchronized(this)
			{
				System.out.println("waiting for return key.");
				scanner.nextLine();
				System.out.println("return key prosses");
				notify();
			}
		}
		
	}

}
