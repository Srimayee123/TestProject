package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class P3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromeDriverPath = "C:\\Users\\Kartik_Kanda\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		/*String s = "ghjgjgj&678#$gh%5hj!h34%#";
		char[] d = s.toCharArray();
		int sum =0;
		for(int i=0;i<d.length;i++) {
			if(Character.isDigit(d[i])) {
				sum = sum + d[i];
		     }
			
		}
		System.out.println(sum);
		Alert alert =driver.switchTo().alert();*/
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']/select")).click();
		driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']/select/option[contains(text(),'Electronics')]")).click();
        Thread.sleep(5);
        driver.findElement(By.xpath("//input[@type='submit' and @value='Go']")).click();
        Thread.sleep(5);
        driver.close();

	}

	
}
