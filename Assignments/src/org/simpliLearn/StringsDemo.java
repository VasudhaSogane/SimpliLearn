package org.simpliLearn;

public class StringsDemo {

	public static void main(String[] args) {
		//methods of strings
		String str=new String("Welcome to java");

		//length
		System.out.println("Length:"+str.length());

		//substring
		System.out.println("Substring:"+str.substring(3,7));
		System.out.println("Substring:"+str.substring(11));

		//string comparison
		String s1="Hello";
		String s2="Hello";
		String s3="Helio";
		//checks references. s1 and s2 point to the same object in string pool
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		//comparing by content
		System.out.println("\n"+s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		
		//immutability
		System.out.println("\n--Immutability--");
		s2="Namaste";
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s1==s2);
		
		//changing case
		System.out.println("\n--Changing cases--");
		String st1= "Hello World";
		System.out.println(st1.toLowerCase());
		System.out.println(st1.toUpperCase());

		//replace
		String replace = s3.replace('i', 'l');
		System.out.println(replace);
		
		//String Buffer
		System.out.println("\n--String Buffer--");
		//append
		StringBuffer sb=new StringBuffer("Lakshadweep");
		sb.append(" Islands");
		System.out.println(sb);
		
		//insert
		sb.insert(11, "-");
		System.out.println(sb);
		
		//replace
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.replace(0, 2, "hE");
		System.out.println(sb1);

		//delete
		sb.delete(12, 13);
		System.out.println(sb);
		
		//converting string to stringbuffer
		StringBuffer sbr = new StringBuffer(str);
		System.out.println("String to StringBuffer");
        System.out.println(sbr); 
        System.out.println(sbr.reverse()); 
        
        //StringBuilder
        System.out.println("\n--String Builder--");
		//append
		StringBuilder sbl=new StringBuilder("Andaman");
		sbl.append(" Islands");
		System.out.println(sbl);
		
		//insert
		sbl.insert(7, "-");
		System.out.println(sbl);
		
		//replace
		StringBuilder sbl1=new StringBuilder("Namaste");
		sbl1.replace(0, 1, "n");
		System.out.println(sbl1);

		//delete
		sbl.delete(8, 9);
		System.out.println(sbl);
		
		//converting string to StringBuilder
		StringBuilder strbld = new StringBuilder(str);
		System.out.println("String to StringBuilder");
        System.out.println(strbld); 
        System.out.println(strbld.reverse());
       }
}
