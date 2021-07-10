package test;
import org.junit.*;

import org.openqa.selenium.WebDriver;
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
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
