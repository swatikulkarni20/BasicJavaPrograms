package BasicPrograms;

import java.util.Arrays;

public class Move0ToTheLast {

	public static void moveZeroToLast(int[] nums) {
		int size= nums.length;
		
		if(size==0 || size==1) {
			return;
		}
		int nz=0, z=0;
		
		while(nz < size) {
			if(nums[nz] !=0) {
				int temp=nums[nz];
				nums[nz]=nums[z];
				nums[z]=temp;
				nz++;
				z++;
			}else {
				nz++;
			}
		}
	}
	public static void main(String[] args) {
		int[] nums= {0,2,1,0,5,0,6};
		moveZeroToLast(nums);
		System.out.println(Arrays.toString(nums));
	}
	
}
