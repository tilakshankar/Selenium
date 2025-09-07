package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_5Webelements {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"input_1\"]")).sendKeys("Hello@gmail.com");
//		driver.findElement(By.xpath("//input[@name=\"input_1\"]")).clear();
		System.out.println(driver.findElement(By.xpath("//input[@name=\"input_1\"]")).getAttribute("placeholder"));
		
		
	}

}
