package Interview;

public class Owels {
	 public static void main(String[] args) {
	
	String str= "my name is swati kulkarni";
    int count=0;
    
    for(int i=0; i<str.length(); i++){
    	char c=str.charAt(i);
        if(c=='a' ||c=='e'|| c=='i'|| c=='o'||c=='u' && c !=' '){
           count++;
           System.out.println(c); 
        }
          
        }
    System.out.println("owels" + count);
}

}
