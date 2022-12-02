package module3;


public class tryCatchStatements {
	public static void main(String[] args) {
		
		try {
			//System.out.println(10/0);
			String str = null;
			System.out.println(str.length());
		} 
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Arithmetic exception");
		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("General exception");
		} finally {
			System.out.println("Executes anyway");
		}
		
		System.out.println("Rest of the program");
	}

}
