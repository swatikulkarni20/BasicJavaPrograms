package Java_Basics;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		while(a<5) {
			System.out.println("In while Loop");
			a++;
		}
		System.out.println("Did not enter in while loop");
		
		int b=1;
		do {
			System.out.println(b);
			b++;
		}while(b < 5);

	}

}
