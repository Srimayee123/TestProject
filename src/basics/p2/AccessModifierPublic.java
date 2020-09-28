package basics.p2;

import java.util.Date;
import java.util.HashSet;

import basics.p1.Program1;

import basics.p1.Program2;
public class AccessModifierPublic{
	
	/*public void thu() {
		 Program2 ghu = new Program2();
		 ghu.name="ghjk";
		 ghu.fruit();
	}*/

	public static void main(String[] args) {
		
    String f = "enter the string";
    char[] ch = f.toCharArray();
    for(int i=ch.length-1;i>=0;i--) {
    System.out.println(ch[i]);
    //System.out.println();
    }
		
	}

}
