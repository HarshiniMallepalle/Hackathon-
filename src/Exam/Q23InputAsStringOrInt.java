package Exam;
//Q23. WJP to differentiate input as string, int or bool

public class Q23InputAsStringOrInt {
//int(digit) is 0 to 9 any other symbol,alphabet or even dot(.) is string
   
    static boolean isNumber(String s){
    
    	/*Parameters:ch the character to be tested.
    	 * Returns:true if the character is a digit; false otherwise.
    	 */
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;
 
        return true;
    }
			 
	public static void main(String[] args){
		
			        String str = "018";
		 
		        // Function returns 1 if all elements are in range '0 to 9'
		        if (isNumber(str))
		            System.out.println("Given Input is Integer");
		 
		        // Function returns 0 if the input is not an range '0 to 9' & any symbol or alphabet
		        else
		            System.out.println("Given Input is String");
		    }
}
