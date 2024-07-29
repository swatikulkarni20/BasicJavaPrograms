package PracticePrograms;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class OccurancesOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="banana";
		
		Map<Character, Integer> map= new HashMap<>();
		
		char[] c= str.toCharArray();
		
		for(char ch:c) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			}else {
				map.put(ch, 1);
			}
		}
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
