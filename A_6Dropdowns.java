package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_6Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stubve
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();		
		WebElement ddown= driver.findElement(By.xpath("//select[@name=\"input_8\"]"));
		
		Select select= new Select(ddown);
		
		select.selectByIndex(5);
	
		select.selectByVisibleText("2,501 - 5,000 employees");
		select.selectByValue("level2");
		select.selectByIndex(1);
		
		
	}

}
