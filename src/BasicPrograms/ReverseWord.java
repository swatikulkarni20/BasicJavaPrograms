package BasicPrograms;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is Swati";

		String words[]=str.split(" ");
		String rev=" ";
		
		for(String s:words) {
		String revstr="";
		for(int i=s.length()-1; i>=0;i--){
			revstr= revstr + s.charAt(i);
		}
		rev=rev+revstr;
		}
		System.out.println("Reverse String is: "+rev);
	}
	
}
