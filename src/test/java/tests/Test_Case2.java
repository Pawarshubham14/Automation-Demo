package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.FileReaderUtil;

public class Test_Case2 extends BaseTest {
	
	@Test
	public void login() throws IOException {
		WebElement log1 = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
		if (log1.isDisplayed()) {
			log1.click();
			System.out.println("click login button");
		}else {
			System.out.println("element not fount");
		}
		LoginPage elements = new LoginPage(driver);
		FileReaderUtil file = new FileReaderUtil();
		String email = file.getEmail();
		elements.email1.sendKeys(email);
		String pass = file.getPassword();
		elements.pass1.sendKeys(pass);
		elements.login_button.click();
		WebElement delete_account  = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
		if (delete_account.isDisplayed()) {
			System.out.println("account created sccesfully");
		}else {
			System.out.println("Test fail");
		}
		WebElement T1 = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a"));
		String s1 = T1.getText();
		System.out.println(s1);
		delete_account.click();
		WebElement account_message = driver.findElement(By.xpath("/html/body/section/div/div/div/h2"));
		if (account_message.isDisplayed()) {
			System.out.println("Account deleted permanantly");
		}else {
			System.out.println("test fail");
		}
				
		
		
	}
	
	

}
