import java.time.Duration;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		Logger log = LogManager.getLogger(Demo.class.getName());
		log.debug("Demo test execution has started");
	  	System.setProperty("webdriver.chorme.driver","C:\\Users\\shrim\\eclipse-workspace\\Log4jJavaP" );
		WebDriver driver = new ChromeDriver();
		log.debug("Chrome Browser launched");
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        log.debug("window got maximize");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[normalize-space()='compendiumdev']")).click();
        log.debug("Clicked on compendiumdev link and navigated to the Compendium page");
        driver.navigate().back();
        log.debug("Navigated back to omayoapplication");
        driver.navigate().forward();
        log.debug("Navigated forword to Compendiumdev application");
        if (driver.getTitle().equals("Basic Web Page Titleabc")) {
        	
        	log.info("Success: The correct title page got displayed");
        	
        }
        else {
        	log.error("Failed: The wrong title page got displayed");
        	
        }
        driver.close();
        log.debug("Browser closed and end of the test execution");
	}

}
