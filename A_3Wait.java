package ui;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class A_3Wait {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	        username.sendKeys("Admin");

	        
	       
		
//		driver.findElement(By.name("username")).sendKeys("Admin");

		
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 

		
		

	}

}

