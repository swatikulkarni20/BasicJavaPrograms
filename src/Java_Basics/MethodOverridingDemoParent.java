package Java_Basics;

public class MethodOverridingDemoParent {
	
	public int sum(int a, int b) {
		int sum= a+b;
		System.out.println("sum is: "+ sum);
		return sum;
	}
	
	public String stringMethod(String s) {
		return s;
	}

}
