package basics.p2;

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
	}

}
