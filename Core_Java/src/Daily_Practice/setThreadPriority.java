package Daily_Practice;

public class setThreadPriority extends Thread{
	public void run() {
		System.out.println("Thread "+ Thread.currentThread().getName()+ "started");
		System.out.println("Thread with priority"+Thread.currentThread().getPriority()+"is running");
	}
	

	public static void main(String[] args) {
		setThreadPriority t1 =new setThreadPriority();
		setThreadPriority t2=new setThreadPriority();
		setThreadPriority t3=new setThreadPriority();
		/*t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);*/
		
		t1.setPriority(3);
		t2.setPriority(1);
		t3.setPriority(2);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
