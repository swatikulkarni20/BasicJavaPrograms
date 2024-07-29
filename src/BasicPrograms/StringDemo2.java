package BasicPrograms;

public class StringDemo2 {

	public static void main(String[] args) {

		String str="Today is Saturday";
		
		String arr[]= str.split(" ");
		
		String revStr="";
		
		for(String s:arr) {
			
			String rev="";
			
			for(int i=s.length()-1; i>=0;i--) {
				
				rev=rev+s.charAt(i);
			}
			
			revStr=revStr+rev+" ";
		}
		System.out.println(revStr);
	}

}
