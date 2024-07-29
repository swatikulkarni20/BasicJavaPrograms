package BasicPrograms;

public class SmallestNoAndSecondSmallestNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,9,3,4,2,8,5,8,7,-8,0};
		
		int size=arr.length;
		
		int min=arr[0];
		int secondMin=Integer.MAX_VALUE;
		
		for(int i=0; i<size; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Smallest element is: " +min);

		for(int i=0; i<size; i++) {
			if(arr[i] < min) {
				secondMin=min;
				min=arr[i];
			}
		else if(arr[i]!= min && arr[i]< secondMin) {
				secondMin=arr[i];
			}
		}
		System.out.println("Second lowest Element is: "+secondMin);
	}

}
