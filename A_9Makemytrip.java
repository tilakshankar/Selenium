package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A_9Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]"))).click();
		
//
		//span[text()="From"]
		driver.findElement(By.xpath("	//span[text()=\"From\"]")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[@type=\"text\"][@placeholder=\"From\"]")).sendKeys("Sydney");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[@type=\"text\"][@placeholder=\"From\"]")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='From']")).sendKeys(Keys.ENTER);

		
		driver.findElement(By.xpath("//li[@data-cy=\"mulitiCityTrip\"]")).click();
		
		
//		driver.findElement(By.xpath("//input[@name=\"input_1\"]")).clear();
//		System.out.println(driver.findElement(By.xpath("//input[@name=\"input_1\"]")).getAttribute("placeholder"));
		
		
	}

}
