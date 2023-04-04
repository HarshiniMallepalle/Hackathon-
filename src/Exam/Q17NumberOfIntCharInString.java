package Exam;
//Q17.  WJP to find total number of integers, uppercase and lowercase character in the give string
import java.util.Scanner;
public class Q17NumberOfIntCharInString {

	public static void main(String[] args) {
		//String s = "Hello Java Programming 8.0";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
        String s=sc.nextLine();
        
		int digit = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				digit++;
			}
		}
		System.out.println("No. of digits is : "+digit);

		int Uppercase = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				Uppercase++;
			}
		}
		System.out.println("No. of Uppercase is : "+Uppercase);

		int lowercase = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))) {
				lowercase++;
			}
		}
		System.out.println("No. of Lowercase is : "+lowercase);
        sc.close();
	}

}
