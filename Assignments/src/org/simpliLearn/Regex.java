package org.simpliLearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		String regex="[a-zA-z]+";
		String check="Charlie777";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(check);
			
		while(m.find())
			System.out.print(check.substring(m.start(),m.end()));
		
		boolean result = m.matches();
		System.out.println("\n"+result);
	}

}
