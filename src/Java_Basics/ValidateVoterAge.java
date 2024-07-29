package Java_Basics;

public class ValidateVoterAge {
	static void validate(int age) throws InvalidAgeException{
		if(age <18) {
			throw new InvalidAgeException("Age is not valid");
		}else {
			System.out.println("Age is valid");
		}
	}
	


public static void main(String[] args) {
	try {
		validate(13);
	}catch(InvalidAgeException ex){
		System.out.println("caught exception");
		System.out.println("Exception Occured "+ex);
	}
}

}


