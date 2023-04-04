package Exam;
//Q1 Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true 

import java.util.Scanner;
public class Q1Boolean {

	public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the 1st value");
			boolean a=s.nextBoolean();
			System.out.println("Enter the 2nd value");
			boolean b=s.nextBoolean();
			System.out.println("Enter the 3rd  value");
			boolean c=s.nextBoolean();
			//boolean a=true, b=false, c=false;
			boolean boo = atLeastTwo(a,b,c);
			System.out.println(boo);
			s.close();
		}
		
			static boolean atLeastTwo(boolean a, boolean b, boolean c) {

				return (a ^ b) ? c : a; //bitwise XOR ^ operator 1 0 =1; 0 1 =1 ; 1 1 =0; 0 0 =0;
				
				// return a && (b || c) || (b && c);//Logical AND(&&) 1 1 =1; 1 0 =0; 0 1 =0; 0 0 =0;
	                                               //Logical OR(ii)  0 0 =0; 1 1 =1; 1 0 =1; 0 1 =1;
				}			
	 
	
}
