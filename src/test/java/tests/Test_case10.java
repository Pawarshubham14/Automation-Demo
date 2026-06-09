package tests;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.FileReaderUtil;

public class Test_case10 extends BaseTest {
	@Test
	public void subcription() throws IOException {
		WebElement Home_Page = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
		if(Home_Page.isDisplayed()) {
			System.out.println("Home Page is Displayed");
		}
		WebElement subcription_button = driver.findElement(By.id("susbscribe_email"));
		Actions Action = new Actions(driver);
		Action.moveToElement(subcription_button);
		if(subcription_button.isDisplayed()) {
			FileReaderUtil File = new FileReaderUtil();
			String email = File.getEmail();
			subcription_button.sendKeys(email);
			
		}
		WebElement enter = driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']"));
		enter.click();
		WebElement alert_message = driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']"));
		String message = alert_message.getText();
		if(alert_message.isDisplayed()) {
			System.out.println("Message is "+ "="+message);
		}
	}

}
