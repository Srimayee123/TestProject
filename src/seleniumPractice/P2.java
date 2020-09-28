package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeDriverPath = "C:\\Users\\Kartik_Kanda\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

}
