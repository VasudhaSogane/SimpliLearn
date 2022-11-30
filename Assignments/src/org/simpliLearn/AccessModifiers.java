package org.simpliLearn;

class testClass{
	void defaultMethod() {
		System.out.println("This is default access specifier");
	}
	public void publicMethod() {
		System.out.println("This is a public access specifier");
	}
	private void privateMethod() {
		System.out.println("This is a private access specifier");
	}
	protected void protectedMethod() {
		System.out.println("This is a protected access specifier");
	}
	public void accessPrivateMethod() {
		privateMethod();
		System.out.println("Private method accessed from the same class");
	}
}


public class AccessModifiers {
	public static void main(String[] args) {
		
		testClass TC = new testClass();
		TC.defaultMethod();
		TC.publicMethod();
		TC.protectedMethod();
		//trying to access private method from another class
		//TC.privateMethod();
		TC.accessPrivateMethod();
		
	}
	
	protected void proMethod() {
		System.out.println("This is a protected method");
	}
	
	void defMethod() {
		System.out.println("This is a default method");
	}
	
	public void pubMethod() {
		System.out.println("This is a public method");
	}

}
