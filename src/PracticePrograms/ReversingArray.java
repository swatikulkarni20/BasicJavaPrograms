package PracticePrograms;

public class ReversingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,5,6};
		
		int f=0;
		int l=a.length-1;
		int temp=0;
		
		while(f<l) {
		
				temp=a[f]; // a[0]=0
				a[f]=a[l]; //a[0]=5
				a[l]=temp; //a[5]=0
				f++;
				l--;
		
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
