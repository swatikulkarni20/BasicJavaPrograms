package PracticePrograms;

import java.util.HashSet;

public class FindMissingNimbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,5,6,8,10};
//		int sum1=0;
//		int sum2=0;
//		for(int i=0; i<a.length; i++) {
//			sum1= sum1 + a[i];
//		}
//		System.out.println(sum1);
//		
//		for(int i=0; i<=6; i++) {
//			sum2=sum2+i;
//		}
//		System.out.println(sum2);
//		
//		int missingNo=sum2-sum1;
//		System.out.println(missingNo);
		
		HashSet<Integer> set= new HashSet<>();
		
		for(int num:a) {
			set.add(num);
		}
		int n=a.length+1;
		for(int i=0; i<=10; i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
