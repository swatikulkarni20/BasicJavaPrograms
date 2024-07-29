package Java_Basics;

public class Cat extends Animal {
	public void meaww() {
		System.out.println("Meaww");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c= new Cat();
		c.meaww();
		c.eat();
	}

}
