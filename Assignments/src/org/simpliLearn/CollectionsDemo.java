package org.simpliLearn;

import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args) {
		//Arraylist
		ArrayList<String> al = new ArrayList<String>();
		al.add("Python");
		al.add("Java");
		Collections.sort(al);
		System.out.println("ArrayList");
		System.out.println(al);

		//Vector
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(34);
		v.addElement(20);
		Collections.sort(v);
		System.out.println("Vector");
		System.out.println(v);

		//LinkedList
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Bangalore");
		ll.add("Mumbai");
		System.out.println("LinkedList");
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		//Hashset
		HashSet<Integer> hs=new HashSet<Integer>();  
		hs.add(31);  
		hs.add(42);  
		hs.add(16);
		hs.add(75);
		System.out.println("HashSet");
		System.out.println(hs);

		//Linkedhashset
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();  
		lhs.add(31);  
		lhs.add(42);  
		lhs.add(16);
		lhs.add(75);	 
		System.out.println("LinkedHashSet");
		System.out.println(lhs);
	}
}
