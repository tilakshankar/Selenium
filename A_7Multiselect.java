package ui;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_7Multiselect {

    public static void main(String[] args) {
    	 ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/dropdowns");
         driver.manage().window().maximize();

       
         WebElement dropdown = driver.findElement(By.id("fruits"));
         Select select = new Select(dropdown);

         // Select multiple options
         select.selectByVisibleText("Apple");
         select.selectByVisibleText("Orange");
         select.selectByIndex(2);

    
         List<WebElement> getallitems= select.getAllSelectedOptions();
         System.out.println("Selected items:"+ getallitems);
    }
}
