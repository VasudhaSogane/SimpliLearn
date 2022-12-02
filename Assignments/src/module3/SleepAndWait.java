package module3;

public class SleepAndWait {
	private static Object LOCK = new Object();
	 
	public static void main(String[] args) throws InterruptedException {
	  
		//sleep() is a Thread class static method
	    Thread.sleep(1000);
	   
	    System.out.println("Thread '" + Thread.currentThread().getName() +
	      "' is woken after sleeping for 1 second");
	  
	    synchronized (LOCK)
	    {
	    	//wait() is an Object class method
	        LOCK.wait(1000);
	       
	        System.out.println("Object '" + LOCK + "' is woken after" +
	          " waiting for 1 second");
	    }
	}
}
