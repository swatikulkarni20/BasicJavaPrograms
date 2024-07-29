package BasicPrograms;

public class StringDemo {

	public static void main(String[] args) {

		String str="Today is Saturday";
		
		String arr[]= str.split("");
		
		String rev="";
		
		String strRev="";
		
		for(int i=arr.length-1; i>=0; i--) {
			
			rev=rev+arr[i];
		}
		
		System.out.println(rev);
		
//		String arr1[]=rev.split(" ");
//		
//		for(String s:arr1) {
//			
//			String finalrev="";
//			
//			for(int i=s.length()-1; i>=0; i--) {
//				
//				finalrev=finalrev+s.charAt(i);
//			}
//			strRev=strRev+finalrev+ " ";
//		}
//		System.out.println(strRev);
		
	}

}
