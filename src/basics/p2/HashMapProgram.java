package basics.p2;

import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class HashMapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hello = new HashMap<Character, Integer>();
		hello.put('a', 10);
		hello.put('b', 20);
		hello.put('c', 30);
		hello.put('d', 40);
		hello.put('e', 50);
		System.out.println(hello.get(2));
		System.out.println(hello);
		
		Pattern pattern = Pattern.compile("srimayee");
	    Matcher matcher = pattern.matcher("My name is srimayee");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	  }
		
	}

