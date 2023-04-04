package Exam;
//Q18. WJP to display duplicate character in string

import java.util.Scanner;

public class Q18DuplicateChar {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the String.");
	       String s=sc.nextLine();
	       sc.close();
		
		//String s = "SriShivaSwamy";
	
		String[] str = s.split("");
		for (int i = 0; i < str.length; i++) {
			// System.out.println(str[i]);
		}
		int count;
		for (int i = 0; i < str.length; i++) {
			count = 1;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					count++;
					
				}

			}

			if (count != 1) {
				System.out.print(str[i]);
			}	
		}
	}

}
