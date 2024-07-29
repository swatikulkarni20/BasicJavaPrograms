package BasicPrograms;

import java.util.Arrays;

public class LargestEelementInArray {

	public static void main(String[] args) {

		int[] arr= {1,5,2,8,3};
		int max= arr[0];
		
		//approach 1
		int size=arr.length;
//		
//		Arrays.sort(arr);
//		
//		System.out.println(arr[size-1]);
//		System.out.println(arr[0]);
		
		//Approach 2
		
		for(int i=1; i<size; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println(max);
		
	}

}
