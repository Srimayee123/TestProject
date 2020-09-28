package basics.p2;

import java.awt.List;
import java.util.*;
import java.util.ArrayList;

public class T2{
	
	
	String animal = "dog";
	
	{
		System.out.println("T2 IIB");
	}
	T2(){
		System.out.println("T2 Constructor");
	}
	static{
		System.out.println("T2 SIB");
	}
	
	public void method() {
		System.out.println("method");
	}

	public static void main(String[] args) {
	    T2 test = new T2();
	    test.method();
		// a power b
		int a = 3;
		int b = 3;
		int c = a;
		for(int x=1;x<b;x++){
		c = c * a;
		}
		System.out.println(c);
	    }

	//find min and max numbers in list without using min and max methods
	//List<Integer> list=new ArrayList<Integer>();
	//list.add(1); 
	

}
