package BasicPrograms;

public class RotateArray 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6};
		int n=3;
		
		for(int i=0; i<n; i++)
		{
			int first=arr[0];
			int j;
			for(j=0; j<arr.length-1; j++)
			{
				arr[j] = arr[j+1];
			}
			arr[j]=first;
		}
	}

}
