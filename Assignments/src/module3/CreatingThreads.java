package module3;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread class thread "+i);
		}
	}
}

class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Runnable interface thread "+i);
		}
	}
}

public class CreatingThreads {
	public static void main(String[] args) {
		MyThread t1= new MyThread();
		t1.start();
		
		Runnable r = new MyRunnable();
		Thread t2 = new Thread(r);
		t2.start();
		
		for(int i=0;i<5;i++) 
			System.out.println("main thread "+i);
	}

}
