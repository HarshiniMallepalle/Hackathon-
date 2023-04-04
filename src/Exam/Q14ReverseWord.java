package Exam;
//Q14. Given a string print the reverse of the words string.(Input:  Java Code Output: Code Java)

import java.util.Scanner;

public class Q14ReverseWord {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s2=sc.nextLine();
					
		String[] array=s2.split(" ");
		for(int i=array.length-1;i>=0;i--) {
		System.out.print(array[i]+" ");
		sc.close();
		}
	}

}
