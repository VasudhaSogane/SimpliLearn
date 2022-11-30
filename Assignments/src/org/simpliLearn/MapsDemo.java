package org.simpliLearn;

import java.util.*;

public class MapsDemo {
	public static void main(String[] args) {

		//HashMap
		HashMap<Integer, String> hm = new HashMap<Integer,String>();

		hm.put(10, "Rama");
		hm.put(20, "Krishna");
		hm.put(30, "Shiva");
		hm.put(40, "Lakshmi");

		System.out.println("\nElements of HashMap:");
		for(Map.Entry<Integer,String> e:hm.entrySet() )
			System.out.println(e.getKey()+" "+e.getValue());

		//HashTable
		Hashtable<Integer, String> ht = new Hashtable<Integer,String>();

		ht.put(50, "Seetha");
		ht.put(60, "Radha");
		ht.put(70, "Parvathi");
		ht.put(80, "Vishnu");

		System.out.println("\nElements of HashTable:");
		for(Map.Entry<Integer,String> e:ht.entrySet() )
			System.out.println(e.getKey()+" "+e.getValue());

		//TreeMap
		TreeMap<Integer, String> tm = new TreeMap<Integer,String>();

		tm.put(90, "Brahma");
		tm.put(100, "Ganesha");
		tm.put(110, "Saraswathi");
		tm.put(120, "Gayathri");

		System.out.println("\nElements of TreeMap:");
		for(Map.Entry<Integer,String> e:tm.entrySet() )
			System.out.println(e.getKey()+" "+e.getValue());
	}
}
