package ui;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//import io.github.bonigarcia.wdm.WebDriverManager;
 
public class B_14mousehover {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize()	;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement element =driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
		
		Actions actions= new Actions(driver);
		
		actions.moveToElement(element).perform();
		
		
		// for resizing and slider same .
		//right click -> contextClick
		

	}

}
