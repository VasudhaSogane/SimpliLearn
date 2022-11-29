package org.simpliLearn;

public class TypeCasting {
	public static void main(String[] args) {
		System.out.println("Implicit type casting");
		
		char ch = 'A';
		System.out.println("Char:"+ch);
		
		int i=ch;
		System.out.println("int:"+i);
		
		float f = ch;
		System.out.println("float:"+f);
		
		long l=ch;
		System.out.println("long:"+l);
		
		double d= ch;
		System.out.println("double:"+d);
		
		System.out.println("\nExplicit type casting");
		
		double db = 26.4;
		int in = (int)db;
		
		System.out.println("double:"+db);
		System.out.println("int:"+in);
	}
}
