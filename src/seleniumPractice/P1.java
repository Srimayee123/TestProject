package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class P1 {

	public static void main(String[] args) throws InterruptedException{
		String chromeDriverPath = "C:\\Users\\Kartik_Kanda\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		
		// TODO Auto-generated method stub
		driver.get("http://demo.guru99.com/test/newtours/");
		WebElement ele = driver.findElement(By.xpath("//input[@name='userName']"));
		ele.click();
		ele.sendKeys("username");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.name("password")).getTagName());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.findElement(By.name("password")).getText());
		//driver.close();
		//System.exit(0);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]")).click();
		Thread.sleep(10);
		
		//driver.wait(); 
		
		 // Go back to Home page
		 driver.navigate().back();
		 
		// Go forward to Registration page
		driver.navigate().forward();
		 
		 // Refresh browser
		 driver.navigate().refresh();	
		 
		 // Close browser
		 //driver.close();
		 
		 Select slt = new Select(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]")));
		//select byValue, byIndex, byVisibleText
		 
		 // Drag and Drop from one position to other
		 /*WebElement From = driver.findElement(By.xpath(".//*[@id='j3_7']/a"));
	      WebElement To = driver.findElement(By.xpath(".//*[@id='j3_1']/a"));
	      
	      Actions builder = new Actions(driver);
	      #######################
	      Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();	      
	      dragAndDrop.perform();
		   ##################### (OR)
		 
		 //Creating object of Actions class to build composite actions  
         Actions action = new Actions(driver);  
   
         //Performing the drag and drop action  
         action.dragAndDrop(From,To).build().perform();
         
         //Performing Mouseover
          action.moveToElement(we).build().perform();

			
        //Using Alert class to first switch to or focus to the alert box  
		Alert alert = driver.switchTo().alert();  
		alert.accept();  
		alert.dismiss();  
	
		 import org.junit.Assert;  -->
		--> Assert.AssertFalse(condition);  
		 AssertEquals
		 AssertNotEquals
		 AssertTrue
		 AssertFalse
		 AssertNull
		 AssertNotNull
		 */
		 
	}

}
