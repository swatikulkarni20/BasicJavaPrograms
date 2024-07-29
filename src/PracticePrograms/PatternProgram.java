package PracticePrograms;

public class PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		
		for(int i=0; i<=n; i++) {  //0
			for(int j=n; j>=i; j--) { //6
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}
	

}
