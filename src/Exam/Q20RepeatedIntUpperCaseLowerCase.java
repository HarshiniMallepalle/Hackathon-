package Exam;

import java.util.HashMap;
import java.util.Map;

public class Q20RepeatedIntUpperCaseLowerCase {
	// Q20. WJP to find total number of repeated integers, upperCase and lowerCase character in the give string

	public static void main(String[] args) {

		String str = "Java801";
		int repeatedinteger = 0;
		int repeatedUppercase = 0;
		int repeatedLowercase = 0;

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);

			if (Character.isDigit(a))
				repeatedinteger++;
			
			else if (Character.isUpperCase(a))
				repeatedUppercase++;
			
			else if (Character.isLowerCase(a))
				repeatedLowercase++;
		}

		System.out.println("Total number of Integers  :"+repeatedinteger);
		System.out.println("Total number of Uppercase :"+repeatedUppercase);
		System.out.println("Total number of Lowercase :"+repeatedLowercase);

	}

}
