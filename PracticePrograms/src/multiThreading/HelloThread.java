package multiThreading;

public class HelloThread extends Thread{

	public void run() {
		System.out.println("Hello i am Child Thread of Main Thread");
	}
	public static void main(String[] args) throws InterruptedException {
		
		HelloThread ht=new HelloThread();
		ht.start();
		Thread.sleep(2);
		System.out.println("I am Main Thread");

	}

}
