package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class A_2Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		WebElement password=driver.findElement(By.name("password")); 
		
		 driver.findElement(with(By.tagName("input")).above(password)).sendKeys("Admin");
		
		
		
		

	}

}
