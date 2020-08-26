package basics.p2;

public class Program5 extends AbstractClass {
	
	/*When an abstract class is extended, abstract methods should be definitely implemented*/
	@Override
	public void test() {
		System.out.println("abstract method in abstract class");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Program5 p5 = new Program5();
    p5.tes1();
    p5.test();

	}
}
