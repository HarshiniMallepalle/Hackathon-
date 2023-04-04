package Exam;

import java.util.Scanner;

public class Q23OtherWay {
	// Q23. WJP to differentiate input as string, int or bool

	public static void main(String[] args) {
		int m;
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		try {
			m = Integer.parseInt(str);
			System.out.println("Integer");
			return;
		} catch (Exception e) {
		}
		try {
			if(str.equalsIgnoreCase("true")||str.equalsIgnoreCase("False"))
				System.out.println("Boolean");
			else
				System.out.println("String");

		} catch (Exception e) {
		}
	}

}
