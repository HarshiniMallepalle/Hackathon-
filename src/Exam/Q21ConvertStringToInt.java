package Exam;
//WJP to convert string to int

import java.util.Scanner;

public class Q21ConvertStringToInt {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
    	 String str=sc.nextLine();
    	 
		//String str = "949";
		System.out.println("Before conerting : "+str+10);//As str is string 10 is concatenated
		
		//converting to integer
		int a = Integer.parseInt(str);
		System.out.println("After converting : "+(a+10));
		
sc.close();
	}

}
