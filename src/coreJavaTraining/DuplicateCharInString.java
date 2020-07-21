package coreJavaTraining;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {
	
	public void countDupChars(String str) {
		//create a HashMap
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		//Converting a string to char array
		char[] chars = str.toCharArray();
		
		for(Character ch:chars) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		//obtaining set of keys
		Set<Character> keys = map.keySet();
		for(Character ch:keys) {
			if(map.get(ch)>1) {
				System.out.println("char"+"-"+ ch +" "+map.get(ch));
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharInString obj = new DuplicateCharInString();
		System.out.println("String :Hello World");
		System.out.println("--------------------");
		obj.countDupChars("Hello World");
		
		System.out.println("String :@#$@#$%%^&^&*!*!");
		System.out.println("-------------------------");
		obj.countDupChars("@#$@#$%%^&^&*!*!");
	}

}
