package Interview;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

class OccurancesOfChars {
    public static void main(String[] args) {
        
        String str="Raja";
        
        char[] c=str.toCharArray();
        
        Map<Character, Integer> map= new HashMap<>();
        
        for(char i: c) {
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
            
        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
        
            System.out.println(entry.getKey()+" "+ entry.getValue());
            
        }
    }

}
