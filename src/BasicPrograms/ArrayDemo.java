package BasicPrograms;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] a1= {1,2,3,4,5};
		int[] a2= {1,2,3};
		
		for(int i=1; i<=a1.length; i++) { //1
			
			for(int j=0; j<=i; j++) { //1
				if(i==j) {
				
				System.out.println(j);
				
			}
		}
	
	}

	}
}
