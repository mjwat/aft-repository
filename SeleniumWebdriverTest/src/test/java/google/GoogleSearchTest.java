package google;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class GoogleSearchTest extends Base{

	@Test
	public void testWebsite() {
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
        btn.click();
        wait.until(titleIs("webdriver - Поиск в Google"));
	}

}
