package PracticePrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="banana";
		
		
		
		Set<Character> set= new HashSet<>();
		char[] c= str.toCharArray();
		
		for(char i:c) {
			if(!set.contains(i)) {
				set.add(i);
			} 
			else if(set.contains(i)) {
				System.out.println("Duplicate char is:"+i);
				
			}
				
		}
		
		System.out.println(set);

	}

}
