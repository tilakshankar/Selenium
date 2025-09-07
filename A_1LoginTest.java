package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class A_1LoginTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try{
			Thread.sleep(2000); 
		}catch(Exception e){
		System.out.print("lol");
			
		}

		
		driver.findElement(By.name("username")).sendKeys("Admin");

		
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		

	}

}
