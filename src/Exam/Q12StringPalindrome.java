package Exam;
//Q12.Write a program to check palindrome (MalayalaM) for both numbers and string?

import java.util.Scanner;

public class Q12StringPalindrome {

	public static void main(String[] args) {
		String a,reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer/String to check the Palindrome.");
    	a=sc.nextLine();
		System.out.println("Given Integer/String is : "+a);
		int n = a.length();
		//int count=0;
        for(int i=(n-1);i>=0;i--) {
        	reverse=reverse+a.charAt(i);
        	//count++;
        }
       
		System.out.println("Palindrome is           : "+reverse);
		 if(reverse.equalsIgnoreCase(a)) {
			System.out.println("Given Integer/String is Palindrome");
		}
		else {
			System.out.println("Given Integer/String is not Palindrome");
		}
		sc.close();
	

	}

}
