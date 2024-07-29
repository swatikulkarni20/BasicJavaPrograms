package BasicPrograms;

public class FindMissingNoOfSquareOfGivenNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,9,25};
		int sum1=0;
		int sum2=0;
		
		int missingNo=0;
		
		for(int i=0; i<a.length; i++) {
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		
		for(int i=1;i<=5; i++) {
			sum2=sum2+(i*i);
			
		}
		System.out.println(sum2);
		
		missingNo=sum2-sum1;
		System.out.println("Missing No is "+missingNo);
	}

}
