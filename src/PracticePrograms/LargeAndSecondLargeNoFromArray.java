package PracticePrograms;

public class LargeAndSecondLargeNoFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,15,4,5,6,7};
		int size=a.length;
		int max=a[0];
		
		int secondMax=0;
		
		for(int i=0;i<size; i++) {
			if(a[i]<max) {
				max=a[i];
			}
		}
		System.out.println("Maximum value is: "+max);
		
		for(int i=0; i<size; i++) {
			if(a[i]!=max && a[i]>secondMax) {
				secondMax=a[i];
			}
		}
		
		System.out.println("second maximum no is: "+ secondMax);
	}

}
