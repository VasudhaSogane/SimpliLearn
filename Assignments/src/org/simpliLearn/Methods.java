package org.simpliLearn;


class methodsDemo{
	//method to show pass by value
	public void changeValue(int x) {
		x=x+10;
	}
	
	//method overloading
	//compiler decides which method to call based on arguments passed
	public void sum(int a,int b) {
		System.out.println("Sum of 2 numbers:"+a+" and "+b+" is:"+(a+b));
	}
	public void sum(int a,int b,int c) {
		System.out.println("Sum of 3 numbers:"+a+","+b+" and "+c+" is:"+(a+b+c));	}
	
}
public class Methods {
	public static void main(String[] args) {
		methodsDemo MD = new methodsDemo();
		int i =10;
		System.out.println("Value of i before calling changeValue():"+i);
		//pass by value
		MD.changeValue(i);
		System.out.println("Value of i after calling changeValue():"+i);
		
		//method overloading
		MD.sum(10, 20);
		MD.sum(12, 32, 4);
	}
	
	
}
