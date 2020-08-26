package basics.p1;

public class Program1 {
	public int g = 6;
	
	static int sum(int a,int b) {
		int c = a+b;
		//System.out.println(c);
		return c;
	}
	
	public Program1(){
		System.out.println("constructor text123");
	}

	public static void main(String[] args) {
		Program1 testObj = new Program1();
		System.out.println(testObj.g);
		System.out.println(sum(3,5));
		
		final String text = "Hello";
		final int gh = 45;
		final int h = 5;
		
		System.out.println(gh);
		
     System.out.println("test " + text +" "+ gh + h);
     System.out.println(text.toLowerCase());
     System.out.println(text.toUpperCase());
     String txt = "We are the so-called \'Vikings\' from the north.";
    // String txt = "We are the so-called \"Vikings\" from the north.";
    // String txt = "We are the so-called \\Vikings\\ from the north.";
     System.out.println(txt);
     System.out.println(Math.min(5, 10));
     boolean x = true;
     System.out.println(h<7);
     System.out.println(x);
// if, else, else if loops
     if(gh>50)
    	 System.out.println("Greater");
     
     else if(gh==50)
    	 System.out.println("Lesser");
     else
    	 System.out.println("Hello");
// Ternary Operator     
     int time = 20;
     String result = (time < 18) ? "Good day." : "Good evening";
     System.out.println(result);
     
 // Switch case
     int day = 2;
     switch (day) {
       case 1:
         System.out.println("Monday");
         break;
       case 2:
         System.out.println("Tuesday");
        break;
       case 3:
         System.out.println("Wednesday");
         break;
        default:
    	    System.out.println("Looking forward to the Weekend");
         
	}
     int i = 0;
// do while
     do {
       System.out.println(i);
       i++;
     }
     while (i < 6);
     System.out.println(i);
     System.out.println("*********************");
     
// While Loop 
     int j = 6;
     while (j < 11) {
       System.out.println(j);
       j++;
     }
     
// For loop
 for(int y = 1;y< 6;y++) {
	 System.out.println(y);
 }
 
 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
 System.out.println(cars.length);
   for(int z = 0; z < cars.length; z++){
   System.out.println(cars[z]);
 }
 

// break usage
for (int t = 0; t < 10; t++) {
	  if (t == 4) {
	    break;
	  }
	  System.out.println(t);
	}

//continue usage
for (int r = 0; r < 10; r++) {
	  if (r == 4) {
	    continue;
	  }
	  System.out.println(r);
	}

}

}


