package ui;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//import io.github.bonigarcia.wdm.WebDriverManager;
 
public class B_15DragDrop {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize()	;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement frame= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);		
		WebElement drag =driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop =driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions actions= new Actions(driver);
		
		actions.dragAndDrop(drag, drop).perform();
		
		
		

	}

}
