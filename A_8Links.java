package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_8Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		List<WebElement> alltags =driver.findElements(By.tagName("a"));
		System.out.print("Total tags are" + alltags.size() );
		for(int i=0;i<alltags.size();i++) {
			System.out.println(alltags.get(i).getAttribute("href"));
		}

		

	}

}
