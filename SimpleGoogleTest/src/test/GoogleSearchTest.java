package test;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class GoogleSearchTest extends Base{

	@Test
	public void testWebsite() {
        driver.navigate().to("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("webdriver");
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
        btn.click();
        wait.until(titleIs("webdriver - Поиск в Google"));
	}

}
