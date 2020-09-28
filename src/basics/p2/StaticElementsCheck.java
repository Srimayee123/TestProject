package basics.p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basics.p1.Program1;

public class StaticElementsCheck{
	
	 int hi = 10;
	
	static void sum(int a, int b) {
		int c= a+b;
		System.out.println("dfgh"+c);
	}
	
	public static void main(String[] args) {
		StaticElementsCheck stat = new StaticElementsCheck();
		System.out.println(stat.hi);
		StaticElementsCheck.sum(10, 10);
		String driverExecutablePath = "C:\\Users\\Kartik_Kanda\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		WebDriver driver = new ChromeDriver();
		
		//System.out.println(staticMethodDef.hi);
		sum(10, 10);
	}

}

class staticMethodDef {
int asd = 10;
	//System.out.println(asd);
	static int hi = 10;
	static void sum(int a, int b) {
		int c= a+b;
		System.out.println(c);
		
	}
		
}
	
