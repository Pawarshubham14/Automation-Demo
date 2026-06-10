package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.FileReaderUtil;

public class Test_case11 extends BaseTest {
	
	@Test
	public void cart_Page() throws IOException, InterruptedException {
		WebElement home_page = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
		if(home_page.isDisplayed()) {
			System.out.println("Home Page is Displayed");
		}
		WebElement cart = driver.findElement(By.xpath("//a[normalize-space()='Cart']"));
		cart.click();
		WebElement subcription = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[2]/div/h2"));
		Actions action =new Actions(driver);
		action.moveToElement(subcription);
		String s1 = subcription.getText();
		if (s1.equals("Subscription")) {
		System.out.println("Text matches");
	    }else {
	    	System.out.println("Text doesn't Match");
	    }
		WebElement sub = driver.findElement(By.id("susbscribe_email"));
		FileReaderUtil File = new FileReaderUtil();
		String email = File.getEmail();
		sub.sendKeys(email);
		WebElement arrow = driver.findElement(By.id("subscribe"));
		arrow.click();
		Thread.sleep(5000);
		WebElement successMsg = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/div"));
		String actualMsg = successMsg.getText();
		System.out.println(actualMsg);
		if(actualMsg.equals("You have been successfully subscribed!")) {
			System.out.println("Subscription successful");
		}
	}

}
