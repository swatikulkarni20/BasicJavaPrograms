package Java_Basics;

public class MethodOverloadingDemo {

	public void math(int a, int b) {
		int sum=a+b;
		System.out.println("Sum is: "+ sum);
	}
	
	public void math(int a, int b, int c) {
		int sub= a-(b+c);
		System.out.println("sub is: "+ sub);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo mo= new MethodOverloadingDemo();
		mo.math(10, 20);
		mo.math(30, 10, 5);

	}

}
