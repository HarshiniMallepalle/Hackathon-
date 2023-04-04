package Exam;
import java.util.Scanner;

//Q15. Given a string print the unique words of the string.
public class Q15UniqueWordsOfString {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the String.");
       String sentence=s.nextLine();
       s.close();
		//String str = "Welcome to home into sweet home";
 
        printUniqueWords(sentence);
    }
		
		    static void printUniqueWords(String str)
		    {
		         int count;
		         String[] words = str.split(" ");
		 
		        for (int i = 0; i < words.length; i++) {
		 		            count = 1;
		 
		            for (int j = i + 1; j < words.length; j++) {
		                if (words[i].equalsIgnoreCase(words[j])) {
		 		              count++;     	 
		                  words[j] = " ";
		                }
		            }
		 
		                 if (count == 1 && words[i] != " ")
		                	 {
		 	               System.out.println(words[i]);
		                 }
		            
		        }
		    } 
		   
}
