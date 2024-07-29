package PracticePrograms;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={1,2,2,3,3,4,5};
	    int count=0;
	    HashSet<Integer> set= new HashSet<>();
	    for(int i=0; i<a.length; i++){
	        
	        set.add(a[i]);
	        
	    }
	    
	   System.out.println(set);

	}

}
