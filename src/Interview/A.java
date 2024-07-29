package Interview;

public class A {
	
		static int x=10;//11
		//int y=10;//11
		A(){
		int y=10;
		x++;//12
		
		System.out.print("X is printing: "+x);
		System.out.println();
		y++;
		System.out.print("Y is printing: "+y);
		}
		
		public static void main(String arg[]){
		A a = new A();// 11,11
		A b = new A();// 
		A c = new A();

		}
}


