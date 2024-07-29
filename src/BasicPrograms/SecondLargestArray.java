package BasicPrograms;

import java.util.Arrays;

public class SecondLargestArray {

	public static void main(String[] args) {

		int[] arr= {1,5,6,8,9,3,2};
		
		int size=arr.length;
//		Arrays.sort(arr);
//		System.out.println(arr[size-2]);
		
		int max=arr[0];
		int secondLargestNo = 0;
		
		for(int i=0; i<size; i++){
		
		if(arr[i]>max) {
			
			max=arr[i];
		}
		}
		System.out.println("Largest no is: "+max);
		for(int i=0; i<size; i++) {
			if(arr[i]>secondLargestNo && arr[i]!=max) {
				secondLargestNo=arr[i];
			}
		}
		System.out.println("Second Largest No is: "+secondLargestNo);
		
	}

	}
