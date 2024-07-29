package PracticePrograms;

import java.util.HashMap;
import java.util.Map;

public class FindNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aabcc";
		
		Map<Character, Integer> map= new HashMap<>();
		char[] ch=str.toCharArray();
		
		for(char i:ch) {
			
			if(map.containsKey(i)) {
				int count=map.get(i);
				map.put(i, map.get(i)+1);
			}
		}

	}

}
