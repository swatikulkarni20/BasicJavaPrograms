package Java_Basics;

public class BabyDog extends Dog {

	public void sweep() {
		System.out.println("sweeping");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog bd= new BabyDog();
		bd.bark();
		bd.eat();
		bd.sweep();

	}

}
