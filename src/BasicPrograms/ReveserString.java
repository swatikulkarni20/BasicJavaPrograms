package BasicPrograms;

public class ReveserString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Today is Saturday";
		
		String arr[]= str.split("");
		
		String rev="";
		
		for(int i=arr.length-1; i>=0; i--) {
			
			System.out.print(arr[i]+"");
		}
		
		
		
		
	}

}
/*
 String str="Today is Saturday";
		
		String arr[]= str.split("");
		
		String rev="";
		
		String strRev="";
		
		for(int i=arr.length-1; i>=0; i--) {
			
			rev=rev+arr[i];
		}
		
		System.out.println(rev); 
 * */
