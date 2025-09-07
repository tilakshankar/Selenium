package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.edge.EdgeDriver;
// import io.github.bonigarcia.wdm.WebDriverManager;

public class B_18Screenshot {

    public static void main(String[] args) {
        // WebDriverManager.edgedriver().setup(); 
//    	File folder = new File("./screenshot/");
//    	if (!folder.exists()) {
//    	    folder.mkdir(); 
//    	}

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();

      Date currentdate= new Date();
      System.out.println(currentdate);
      
      String ssfiledate= currentdate.toString().replace(" ", "-").replace(":","-");
      
      File ssfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      try {
		FileUtils.copyFile(ssfile,new File(".//screenshot//"+ssfiledate+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      

       
    }
}
