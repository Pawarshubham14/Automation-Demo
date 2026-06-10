package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Test_case12 extends BaseTest {
	
	@Test
	public void add_Product() {
	WebElement home_page = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
	if(home_page.isDisplayed()) {
		System.out.println("Home Page is Displayed");
	}
	Actions action = new Actions(driver);
	WebElement product = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/img"));
	action.moveToElement(product).perform();
	WebElement add_cart = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]"));
	action.moveToElement(add_cart).click().perform();
	WebElement continue_shopping = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]"));
	if(continue_shopping.isDisplayed()) {
		continue_shopping.click();
	}else {
		WebDriverWait wait =new WebDriverWait(driver , Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(continue_shopping));
		element.click();
	}
	WebElement product2 = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]"));
	action.moveToElement(product2).perform();
	WebElement add_cart2 = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]"));
	action.moveToElement(add_cart2).click().perform();
	WebElement view_cart = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/p[2]/a[1]/u[1]"));
	if(view_cart.isDisplayed()) {
		view_cart.click();
		
	}else {
		WebDriverWait wait =new WebDriverWait(driver , Duration.ofSeconds(10));
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(view_cart));
		element2.click();
	}
	List<WebElement> productinfo = driver.findElements(By.xpath("//div[@id='cart_info']"));
	Assert.assertEquals(productinfo.size(), 2);
	List<WebElement> prices = driver.findElements(By.xpath("//td[@class='cart_price']/p"));
	List<WebElement> quantities = driver.findElements(By.xpath("//td[@class='cart_quantity']/button"));
	List<WebElement> totals = driver.findElements(By.xpath("//td[@class='cart_total']/p"));

	for(int i = 0; i < prices.size(); i++) {
	    System.out.println("Price: " + prices.get(i).getText());
	    System.out.println("Quantity: " + quantities.get(i).getText());
	    System.out.println("Total: " + totals.get(i).getText());
	}
}
}
