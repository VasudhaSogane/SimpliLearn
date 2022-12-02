package module3;

public class ExceptionHandling {
	public static void main(String[] args) {

		try {
			String str = null;
			System.out.println(str.length());
		} 
		catch(NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("Executes anyway");
		}

		System.out.println("Rest of the program");
	}

}
