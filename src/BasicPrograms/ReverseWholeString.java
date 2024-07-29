package BasicPrograms;

public class ReverseWholeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My name is Swati";
		
		String[] arr=str.split("");
		String rev="";
		
		for(int i=str.length()-1; i>=0;i--) {
			rev=rev+arr[i];
		}
		System.out.println(rev);
	}

}
