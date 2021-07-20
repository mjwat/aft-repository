package base;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    public static WebDriver driver;
    public static WebDriverWait wait;
    

    @BeforeAll
    public static void start() {   	
    	String projectPath = System.getProperty("user.dir");
    	
		System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver");
		driver = new FirefoxDriver();
    	
//		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver");
//		driver = new ChromeDriver();
		
//		System.setProperty("webdriver.safari.noinstall", "true"); //To stop uninstall each time
//		driver = new SafariDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        wait = new WebDriverWait(driver, 10);
    }

    @AfterAll
    public static void stop() {
        driver.quit();
        driver = null;
    }
}
