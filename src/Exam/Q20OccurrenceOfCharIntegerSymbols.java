package Exam;
//Q20. WJP to find total number of repeated integers, upperCase and lowerCase character in the give string

import java.util.Scanner;

public class Q20OccurrenceOfCharIntegerSymbols {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the String.");
	       String str=sc.nextLine();
	       
		//String str = "A Java Programming 8";
	       charSymbolIntOccurance(str);
		sc.close();
	}

	static void charSymbolIntOccurance(String str) {
		int max=256;
		int count[] = new int[max];

		int len = str.length();

		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;
		

		for (int j = 0; j < max; j++) {
			if (count[j] != 0) {
				System.out.println("No. of occurances of "+(char) (j) + " is :" + count[j]);
			}
		}
	}

}
