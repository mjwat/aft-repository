package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LitecartAdminLogin extends Base {
	
	@Test
	public void successLoginToAdmin() {
		String user = "admin";
		String passw = "admin";

		driver.get("http://litecart.loc/admin/");
		
		
		WebElement usernameInp = driver.findElement(By.name("username"));
		WebElement passwordInp = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.name("login"));

		usernameInp.sendKeys(user);
		passwordInp.sendKeys(passw);
		loginBtn.click();
	}

}
