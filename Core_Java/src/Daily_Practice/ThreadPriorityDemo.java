package Daily_Practice;


public class ThreadPriorityDemo extends Thread{
	public void run()
	{
		System.out.println("Thread " +Thread.currentThread().getName()+"running");
	}

public static void main(String[] agrs) {
	ThreadPriorityDemo th1=new ThreadPriorityDemo();
	ThreadPriorityDemo th2=new ThreadPriorityDemo();
	ThreadPriorityDemo th3=new ThreadPriorityDemo();
	th1.start();
	th2.start();
	th3.start();
	System.out.println("Priority of Thread"+ th1.getName()+ " : "+ th1.getName());
	System.out.println("Priority of thread "+ th2.getName() +" : "+ th2.getName());
	System.out.println("Priority of thread "+ th3.getName() +" : "+ th3.getName());
	
	
}
}