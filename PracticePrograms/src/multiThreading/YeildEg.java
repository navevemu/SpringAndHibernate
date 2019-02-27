package multiThreading;

class YeildEx implements  Runnable {
	public void run() {
	for(int i=0;i<10;i++) {
		Thread.yield();
		try {
			Thread.sleep(25);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"   "+i);
	}
	
}

}
	

public class YeildEg {

 public static void main(String a[]) throws InterruptedException {
	 
	 Thread t=new Thread(new YeildEx(),"child thread");
	 t.start();
	 Thread.currentThread().setName("Main thread");
		for(int i=0;i<10;i++) {			
			System.out.println(Thread.currentThread().getName()+"   "+i);
			Thread.sleep(25);
		}
 }
}

