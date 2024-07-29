package PracticePrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int original_No=121;
		
		int num=121;
		int rev=0;
		
		while(num!=0) {
			rev = rev*10 + num%10;//6
			num=num/10;  //12345
		}
		
		System.out.println(rev);
		
		if(original_No==rev) {
			System.out.println("Number is palindrom");
		}else
		{
			System.out.println("no is not palindrom");
		}
	}

}
