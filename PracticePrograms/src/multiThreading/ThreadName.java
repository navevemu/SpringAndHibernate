package multiThreading;

public class ThreadName implements Runnable {
 public void run() {
	 for(int i=0;i<10;i++)
		 System.out.println(Thread.currentThread().getName());
 }
 public static void main(String a[]) throws InterruptedException {
	 ThreadName tn= new ThreadName();
	 Thread t=new Thread(tn);
	// t.setName("p");
	 
	 t.start();
	
	 t.setPriority(1);
	 t.setName("Naveen");
	 Thread.sleep(2);
	 System.out.println(Thread.currentThread().getPriority());
 }
	
}
