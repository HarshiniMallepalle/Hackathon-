package Exam;
//Q30. Write a function to find out longest palindrome in a given string?
import java.util.Scanner;

public class Q30LongestPalindrome {
	     //@param input is a String input
	     //@return The longest palindrome found in the given input.
	     
	    public static String getLongestPalindrome(final String input) {
	        int rIndex = 0, lIndex = 0;
	        String currentP = "", longestP = "";
	        for (int i = 1; i < input.length() - 1; i++) {
	            lIndex = i - 1;  rIndex = i + 1;
	            while (lIndex >= 0 && rIndex < input.length()) {
	                if (input.charAt(lIndex) != input.charAt(rIndex)) {
	                    break;
	                }
	                currentP = input.substring(lIndex, rIndex + 1);
	                longestP = currentP.length() > longestP.length() ? currentP : longestP;
	                lIndex--;  rIndex++;
	            }
	        }
	        return longestP;
	      }

	    public static void main(String ... args) {
	       // String str = "momspeaksmommalayalam";
	    	Scanner s= new Scanner(System.in);
	    	System.out.println("Enter the String :");
	    	String str = s.nextLine();
	        String longestPali = getLongestPalindrome(str);
	        System.out.println("Given String: " + str);
	        System.out.println("Longest Palindrome: " + longestPali);
	    s.close();
	    }
	}

