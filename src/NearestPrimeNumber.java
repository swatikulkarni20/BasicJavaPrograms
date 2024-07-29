import java.util.Iterator;

public class NearestPrimeNumber {

	public static void main(String[] args) {
		
		int num=30;
		
		//boolean flag=false;		
		int count=0;
		if(num>1) {
			int i;
			for( i=28; i<=num; i++) {
				
				if(num%i==0)
					count++;
			}
				if(count==2) {
					System.out.println("Number is Prime" +i);
				}else {
					System.out.println("No is not prome");
				}
				
			
			}
		
		
		else {
			System.out.println("Number is not prime");
	}
	}
	}

