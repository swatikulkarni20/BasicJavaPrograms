package PracticePrograms;

public class FindSmallestAndSecondSmallestNo {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,7,8,5,6,2};
		
		int size=a.length;
		
		int small=a[0];
		int secondsmall=Integer.MAX_VALUE;
		
		for(int i=0; i<size; i++) {
			
			if(a[i]<small) {
				secondsmall=small;
				small=a[i];
			}
		}
		System.out.println("Smallest no is: "+small);
		
		for(int i=0; i<size; i++) {
			if(a[i]<secondsmall && a[i]!=small) {
				secondsmall=a[i];
			}
		}
		System.out.println("second smallest is: "+secondsmall);
	}

}
