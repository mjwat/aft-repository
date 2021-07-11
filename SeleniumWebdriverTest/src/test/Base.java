package test;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    public WebDriver driver;
    public WebDriverWait wait;
    

    @Before
    public void start() {   	
    	String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver");
      driver = new FirefoxDriver();
    	
//		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver");
//        driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        wait = new WebDriverWait(driver, 10);
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
