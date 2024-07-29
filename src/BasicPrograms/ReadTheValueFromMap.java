package BasicPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ReadTheValueFromMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map= new HashMap<>();
		
		map.put(1, "swati");
		map.put(2, "Kuldeep");
		map.put(3, "reva");
		
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.print(entry.getKey()+" ");
			System.out.println(entry.getValue());
			
		}
		
		Iterator<Entry<Integer,String>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> entry=itr.next();
			System.out.print(entry.getKey()+" ");
			System.out.println(entry.getValue());
		}
		
		Iterator<Integer> itr1=map.keySet().iterator();
		while(itr1.hasNext()) {
			Integer key=itr1.next();
			System.out.println(key);
		}
		
		

	}

}
