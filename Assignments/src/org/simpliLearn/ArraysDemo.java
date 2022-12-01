package org.simpliLearn;

public class ArraysDemo {
	public static void main(String[] args) {

		//one dimensional Array
		String names[] = {"Rama","Seetha","Krishna","Radha"};
		System.out.println("Elements of array names are:");
		for(String s:names) {
			System.out.println(s);
		}

		//two dimensional array
		int numbers[][] = {{1,2,3,4},
				{5,6,7,8,9}};
		System.out.println("\nElements of the 2D array are:");
		for(int[] a : numbers) {
			for(int b : a)
				System.out.print(b+" ");
			System.out.println();
		}

	}

}


