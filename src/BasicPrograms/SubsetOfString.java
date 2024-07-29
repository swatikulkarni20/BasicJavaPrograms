package BasicPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SubsetOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "swatiKulkarni";
		String s2="Kul";
	
		
		System.out.println(isSubString(s1, s2));

	}
	
	public static boolean isSubString(String s1, String s2) {
		return s1.matches("(.*)" +s2+ "(.*)");
	}
}