package ui;



import org.openqa.selenium.edge.EdgeDriver;
// import io.github.bonigarcia.wdm.WebDriverManager;

public class B_19auth {

    public static void main(String[] args) {
        // WebDriverManager.edgedriver().setup(); 
//    	File folder = new File("./screenshot/");
//    	if (!folder.exists()) {
//    	    folder.mkdir(); 
//    	}

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://admin:admin@ the-internet.herokuapp.com/basic_auth");
      
      

       
    }
}
