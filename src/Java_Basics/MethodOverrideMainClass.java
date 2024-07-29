package Java_Basics;

public class MethodOverrideMainClass extends MethodOverridingDemoParent {
	
	public int sum(int a, int b) {
		int sub= a-b;
		return sub;
	}
	public String stringMethod(String s) {
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverrideMainClass mo= new MethodOverrideMainClass();
		MethodOverridingDemoParent parent= new MethodOverridingDemoParent();
		System.out.println(mo.sum(20, 10));
		System.out.println(mo.stringMethod("Hi"));
		System.out.println(parent.sum(20, 10));
		System.out.println(parent.stringMethod("hello"));

	}

}
