package module3;

class throwDemo{
	public int divide(int a,int b) {
		if(b==0)
			throw new ArithmeticException("Cannot divide by zero");
		else 
			return a/b;
	}
}

class throwsDemo{
	public int divide(int a,int b) throws ArithmeticException{
		return a/b;
	}
}

class finallyDemo{
	public void arrays() {
		try {
			int[] a = {1,2,3};
			System.out.println(a[4]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block - Executes in any case");
		}
	}
}

class createException{
	public void checkAge(int age) throws Exception {
		if(age<=0) {
			throw new Exception("Age should be greater than 0");
		}
		else
			System.out.println("Age is accepted");
	}
}

public class customExceptions {
	public static void main(String[] args) {
		
		//throw demo
		throwDemo td = new throwDemo();
		try {
			System.out.println(td.divide(2, 0));	
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		//throws demo
		throwsDemo td1 = new throwsDemo();
		try {
			System.out.println(td1.divide(2, 0));	
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		//finally demo
		finallyDemo fd = new finallyDemo();
		fd.arrays();
		
		//custom exception
		createException ce = new createException();
		try {
			ce.checkAge(-2);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
