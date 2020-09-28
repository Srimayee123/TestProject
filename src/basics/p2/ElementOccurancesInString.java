package basics.p2;

import java.util.HashMap;
import java.util.Map;

public class ElementOccurancesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
     String test = "Srimayee";
     HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
     char[] test1 = test.toCharArray(); 
    	 
     for (char c : test1) { 
         if (charCountMap.containsKey(c)) { 

             // If char is present in charCountMap, 
             // incrementing it's count by 1 
             charCountMap.put(c, charCountMap.get(c) + 1); 
         } 
         else { 

             // If char is not present in charCountMap, 
             // putting this char to charCountMap with 1 as it's value 
             charCountMap.put(c, 1); 
         } 
     }
     // Printing the charCountMap 
     for (Map.Entry entry : charCountMap.entrySet()) { 
         System.out.println(entry.getKey() + " " + entry.getValue()); 
     }
}

}
