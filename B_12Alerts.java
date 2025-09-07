package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


//import io.github.bonigarcia.wdm.WebDriverManager;
 
public class B_12Alerts {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize()	;
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();

		
		

	}

}
