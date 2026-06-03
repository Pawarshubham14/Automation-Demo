package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.FileReaderUtil;

public class Test_case4 extends BaseTest {
	
	@Test
	public void logoutUser() throws IOException {
		WebElement log1 = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
		if (log1.isDisplayed()) { 
			log1.click();
			System.out.println("click login button");
		}else {
			System.out.println("element not found");
		}
		LoginPage elements = new LoginPage(driver);
		FileReaderUtil file = new FileReaderUtil();
		String email = file.getEmail();
		elements.email1.sendKeys(email);
		String pass = file.getPassword();
		elements.pass1.sendKeys(pass);
		elements.login_button.click();
		WebElement logout = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
		logout.click();
		
		
			System.out.println("Test 4 pass");
		
		
	}

}
