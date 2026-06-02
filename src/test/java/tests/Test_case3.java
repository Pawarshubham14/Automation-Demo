package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.FileReaderUtil;

public class Test_case3 extends BaseTest{
	
	@Test
	public void validation2() throws IOException, InterruptedException {
		WebElement log1 = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
		if (log1.isDisplayed()) {
			log1.click();
			System.out.println("click login button");
		}else {
			System.out.println("element not fount");
		}
		LoginPage elements = new LoginPage(driver);
		FileReaderUtil file = new FileReaderUtil();
		String email = file.getPassword();
		elements.email1.sendKeys(email);
		String pass = file.getPassword();
		elements.pass1.sendKeys(pass);
		elements.login_button.click();
		Thread.sleep(5000);
		String Error_message = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/p")).getText();
		if(Error_message.equals("Your email or password is incorrect!") ) {
			System.out.println("Test pass");
		}
	}
	

}
