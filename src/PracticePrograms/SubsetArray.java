package PracticePrograms;

import java.util.HashSet;
import java.util.Set;

public class SubsetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,6};
		int s1=a.length;
		int s2=b.length;
		System.out.println(isSubset(a, b, s1, s2));
		

	}
	
	public static String isSubset(int[] a, int[] b, int s1, int s2) {
		
		Set<Integer> set= new HashSet<>();
		
		for(int sub: a) {
				set.add(sub);
			}
		
		for(int sub: b) {
			if(!set.contains(sub)) {
				return "NO";
			}
		}
		return "Yes";
		
	}

}
