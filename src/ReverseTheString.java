
public class ReverseTheString {

	public static void main(String[] args) {

		String str="My Name is Swati";
		String rev="";
		
		String[] arr=str.split("");
		
		for(int i=str.length()-1;i>=0; i--) { //my
			
			rev=rev+arr[i];
			
			
		}
		
		System.out.println(rev);
	}

}
