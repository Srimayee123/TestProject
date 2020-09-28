package basics.p2;

import java.util.HashSet;

public class FindingDuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     
		String[] gt = {"abc","yu","gh","tyu","abc","thi"};
		HashSet<String> set = new HashSet<String>();
		for(String test : gt) {
			if(!set.add(test)) {
				System.out.println("Duplicate element is " + test);
			}
		}
		System.out.println(set);
   }
}
