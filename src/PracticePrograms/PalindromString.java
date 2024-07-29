package PracticePrograms;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="mom";
		String rev="";
		char[] c=str.toCharArray();
		
		for(int i=c.length-1; i>=0; i--) {
			rev= rev+c[i];
		}
		
		System.out.println(rev);
	}

}
