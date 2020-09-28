package basics.p2;

import java.util.Date;
import java.util.HashSet;

import basics.p1.Program1;

public class Program3{
	
	public Program3(int w, String q){
		System.out.println("constructor text");
		int qw = w;
		String rt = q;
		System.out.println(qw + q);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 objThree = new Program1();
		Program3 objFour = new Program3(4, "Five");
		System.out.println(objThree.g);
		StaticElementsCheck stat = new StaticElementsCheck();
		System.out.println(stat.hi);
		
		String s = "Enter the String";
		//StringBuffer hyg= new StringBuffer(s);
		//System.out.println(hyg.replace(0, s.length(), ""));
		String[] f = s.split(" ");
		System.out.println(f[0]+f[1]+f[2]);
		//System.out.println(s.replace('e', 'k'));
		Date d = new Date();
		System.out.println(d);
		
		
	}

}
