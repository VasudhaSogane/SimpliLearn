package module3;

class Display{
	public synchronized void wish(String name) throws InterruptedException {
		for(int i=0;i<5;i++) {
			System.out.println("Good morning "+name);
			Thread.sleep(100);
		}
	}
}

class MyThread2 extends Thread{
	Display d;
	String name;
	MyThread2(Display d,String name){
		this.d = d;
		this.name=name;
	}
	public void run(){
		try {
			d.wish(name);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class synchonizedThreads {
	public static void main(String[] args) {
		Display d=new Display();
		MyThread2 t1 = new MyThread2(d,"Rama");
		MyThread2 t2 = new MyThread2(d,"Krishna");
		MyThread2 t3 = new MyThread2(d, "Brahma");
		t1.start();
		t2.start();
		t3.start();

	}

}
