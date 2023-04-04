package Exam;
//Q52. What are collection APIs, give me an example

import java.util.*;

public class Q52CollectionsAPI {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("January");//Insertion is done using add() method
		al.add("February");
		al.add("March");
		al.add("April");
		al.set(2, "July");//Manipulation by replacing index place 2 from March to July
		for(String val:al) {
			System.out.println(val);
		}
		System.out.println("*************************");
		System.out.println(al.remove(1));//deletion is done using remove(i) method with index
		System.out.println("************************");
		Iterator itr=al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		
		
		}
		
	}


