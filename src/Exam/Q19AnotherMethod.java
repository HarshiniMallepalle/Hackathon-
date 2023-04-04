package Exam;

import java.util.HashMap;
import java.util.Map;
//Q19. WJP to display number of occurrence of all character

public class Q19AnotherMethod {
	
	static void OccuranceOfChar(String str) {
		char[] s=str.toCharArray();
		Map<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		for(char value:s) {
			if(hmap.containsKey(value)) {
				hmap.put(value,hmap.get(value)+1 );//Doubt
			}else {
				hmap.put(value,1);
			}
		}
		System.out.println(str +" : "+hmap);
		
	}

	public static void main(String[] args) {
		String a="RamaRama";
		OccuranceOfChar(a);

	}

}
