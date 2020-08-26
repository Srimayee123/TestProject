package basics.p2;

import basics.p1.Program1;

public class StaticElementsCheck{
	
	 int hi = 10;
	
	static void sum(int a, int b) {
		int c= a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		StaticElementsCheck stat = new StaticElementsCheck();
		System.out.println(stat.hi);
		StaticElementsCheck.sum(10, 10);
		//System.out.println(staticMethodDef.hi);
		//staticMethodDef.sum(10, 10);
	}
	
}

/*class staticMethodDef {
int asd = 10;
	//System.out.println(asd);
	static int hi = 10;
	static void sum(int a, int b) {
		int c= a+b;
		System.out.println(c);
		
	}
		
}*/
	
