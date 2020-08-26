package basics.p2;

abstract class AbstractClass {
/*we cannot create objects for abstract class any where. Abstract class can have both abstract and non-abstract methods but 
both can be accessed by only in their subclass creating objects to the sub class*/
	
	//abstract method
	public abstract void test();
	public void tes1() {
		System.out.println("non abstract method");
	}

}