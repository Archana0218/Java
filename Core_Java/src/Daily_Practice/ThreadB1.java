package Daily_Practice;
public class ThreadB1 {

	public static void main (String[] args ) throws InterruptedException{
		ThreadC b = new ThreadC();
		b.start();
		synchronized(b)
		{
			System.out.println("Main thread calling wait () method");
			System.out.println("Main thread calling notification call ");
			System.out.println("Total balance "+b.totalBalance);
		}
		}
	}
class ThreadC extends Thread{
	int totalBalance=0;
	public void run()
{
	synchronized(this) 
	{
		System.out.println("child thread start calculation for total balance");
		for (int i=0; i<=50;i++) {
			totalBalance = + i;
		}
		System.out.println("child thread gives notification call");
		this.notify();
	}
}
}
