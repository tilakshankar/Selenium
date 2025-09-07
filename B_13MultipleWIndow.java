package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


//import io.github.bonigarcia.wdm.WebDriverManager;
 
public class B_13MultipleWIndow {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize()	;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		 
		Iterator<String> iterator =windowhandles.iterator();		
		String parent= iterator.next();
		String child= iterator.next();	
		
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
		
		driver.switchTo().window(parent);
		
		

	}

}
