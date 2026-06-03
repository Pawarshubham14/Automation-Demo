package base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import utilities.FileReaderUtil;

public class ragister_user {
	public WebDriver driver;
	
	public ragister_user(WebDriver driver) {
		this.driver = driver;
	}
	public void login1() throws IOException {
		WebElement signup_login = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
		signup_login.click();
		WebElement Name = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
		FileReaderUtil File = new FileReaderUtil();
		String Name1 = File.getUsername();
		Name.sendKeys(Name1);
		WebElement EmailAdress = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));
		String Email = File.getEmail();
		EmailAdress.sendKeys(Email);
		WebElement signupButton = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button"));
		signupButton.click();
		
	}

}
