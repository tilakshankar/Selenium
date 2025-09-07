package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
// import io.github.bonigarcia.wdm.WebDriverManager;

public class B_17JavascriptExceutor {

    public static void main(String[] args) {
        // WebDriverManager.edgedriver().setup(); 

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();

        driver.switchTo().frame(1);
        
        JavascriptExecutor jsexu=(JavascriptExecutor)driver;
        String script= "return document.title;";
        String title=(String) jsexu.executeScript(script);
        System.out.println(title);
        
        
        jsexu.executeScript("myFunction()");
   
        // driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();

        System.out.println(driver.switchTo().alert().getText());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();
        
        //scroll
        
       driver.navigate().to("https://www.w3schools.com");
       WebElement endbutton= driver.findElement(By.xpath("//*[@id=\"howto_padding\"]/a"));
       
       jsexu.executeScript("arguments[0].scrollIntoView(true)", endbutton);
       
        
        
        //we can click, highlight,scroll 

       
    }
}
