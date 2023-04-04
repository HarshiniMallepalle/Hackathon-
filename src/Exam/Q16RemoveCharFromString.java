package Exam;

import java.util.Scanner;

//Q16. Write a method that will remove given character from the String?

public class Q16RemoveCharFromString {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		System.out.println("Enter the character");
		String b=s.nextLine();
		removeChar(str,b);
		s.close();
	}
	static void removeChar(String so,String character) {
	System.out.println(so.replace(character,""));
	
	}

}
