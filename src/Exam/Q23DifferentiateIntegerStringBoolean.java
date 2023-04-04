package Exam;

import java.util.Scanner;
//Q23. WJP to differentiate input as string, int or bool

public class Q23DifferentiateIntegerStringBoolean {

	public static void main(String[] args) {

  Scanner s = new Scanner(System.in);
  
  if(s.hasNextInt())
	  System.out.println("Given input is Integer");
  else if(s.hasNextBoolean())
	  System.out.println("Given input is boolean");
  else if(s.hasNextDouble())
	  System.out.println("Given input is Double");
  else if(s.hasNextLine())
	  System.out.println("Given input is String");

		
	}

}
