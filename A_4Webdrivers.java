package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_4Webdrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		String Curr_Url= driver.getCurrentUrl();
		System.out.println(Curr_Url);
		
		String title= driver.getTitle();
//		String page= driver.getPageSource();
		
		driver.findElement(By.xpath("//div[@class='niO4u VDgVie SlP8xc']")).click();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium notes");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		
		System.out.println(title);
//		driver.manage().window().minimize();
				driver.navigate().to("http://www.facebook.com");
		driver.close();
		
//		driver.quit();
//		

	} 

}
