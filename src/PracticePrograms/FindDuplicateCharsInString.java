package PracticePrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="cdabdcabbacd";
		
		Map<Character, Integer> map= new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				count++;
				map.replace(ch, count);
				
				
			}else {
				map.put(ch, 1);
			}
		}
		for(Character key:map.keySet()) {
			System.out.print(key+""+map.get(key));
		}

	}

}
