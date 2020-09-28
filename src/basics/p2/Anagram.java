package basics.p2;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     
     String[] test = {"asd","fgh","kll","ghj","jio","fgyu", "yui","yuii"};
     
     //int l = test.length;
    
     for(int i=0;i<test.length;i++) {
    	 if(i==2) {
    		 break;
    	 }	 
    	 
    	 for(int j=i;j<test.length;j++) {
         System.out.println(test[j]);
         j=j+1;
    	 }
    }
     
}

}
