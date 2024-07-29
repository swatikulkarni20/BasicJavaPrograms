package BasicPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubsetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[]= {1,2,3,2,1,4,5,6};
		int a2[]= {1,2,3,4};
		
		int n1= a1.length;
		int n2= a2.length;
		System.out.println(subSetOfArray(a1, a2, n1, n2));
		
	}
	
	public static String subSetOfArray(int[] a1, int[] a2, int n1, int n2) {
		Set<Integer> set= new HashSet<>();
		
		for(int i:a1) {
			set.add(i);
		}
		for(int i: a2) {
			if(!set.contains(i)) {
				return "No";
			}
		}
		return "Yes";
	}
}