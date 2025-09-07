package ui;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//import io.github.bonigarcia.wdm.WebDriverManager;
 
public class B_16Keyboardextra {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize()	;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement txtarea= driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]"));
		
		Actions actions= new Actions(driver);
		
		actions.keyDown(txtarea,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		WebElement destination= driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[1]/pre"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actions.keyDown(destination,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
		

	}

}
