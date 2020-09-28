package basics.p2;

import basics.p1.Program1;

public class Palindrome{
	
	public void Palindrome(int g){
		//g = 333;
		String t = Integer.toString(g);
		StringBuffer y = new StringBuffer(t);
		StringBuffer h = y.reverse();
		String r = h.toString();
		int u = Integer.parseInt(r);
		if(g==u) {
			System.out.println("Number is palindrome");
		}
		else
			System.out.println("Not Palindrome");
		//int qw = w;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome b = new Palindrome();
		b.Palindrome(678);
		b.Palindrome(212);
	}

}
