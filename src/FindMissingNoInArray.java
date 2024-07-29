import java.util.ArrayList;

public class FindMissingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,8,10,12,14};
		int n=a.length+1;
		int sum=(n*(n+1))/2;
		for(int i=0;i<a.length;i++) {
			
			sum=sum-a[i];
		}
		System.out.println("Missing no are:"+ sum);
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		int a[] = { 1,3,8,10,12,14};
//		int j = a[0];
//		for (int i=0;i<a.length;i++)
//		{
//		    if (j==a[i])
//		    {
//		        j++;
//		        continue;
//		    }
//		    else
//		    {
//		        arr.add(j);
//		        i--;
//		    j++;
//		    }
//		}
//		System.out.println("missing numbers are ");
//		for(int r : arr)
//		{
//		    System.out.println(" " + r);
//		}

	}

}
