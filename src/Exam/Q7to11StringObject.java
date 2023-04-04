package Exam;
//Q7.What are different ways to create String Object?
//Q8.How can we make String upper case to lower case?
//Q9.How can we make String Lower case to Upper case?
//Q10.What is String subSequence method?
//Q11.How to Split String in java?


public class Q7to11StringObject {

	public static void main(String[] args) {
		//String is non Primitive Data Type
				//String is Class
		
				//Literal way
				String s1 = "HACKATHON";
				System.out.println("S1 :" +s1);
			
		        //Object way
				String s2 = new String("Hackathon Exam 3 Days");
				String s3 = new String("S3 :" +"Testing");
				System.out.println("s2 :"+s2);
				System.out.println(s3);

				//UpperCase to LowerCase
				System.out.println(s1.toLowerCase());
				
				//LowerCase to UpperCase
				System.out.println(s2.toUpperCase());
				
				//subSequence method
				System.out.println("sub : "+s2.subSequence(10,13));
				
				String[] array=s2.split(" ");
				for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
				}
	}

}
