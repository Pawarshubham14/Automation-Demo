 package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Test_case9 extends BaseTest {
	
	@Test
	public void search_Product() {
		WebElement product = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a"));
		product.click();
		WebElement all_Products = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2"));
		if(all_Products.isDisplayed()) {
			System.out.println("All products page displayed");
			
		}else {
			System.out.println("Test fail");
		}
		WebElement search_box = driver.findElement(By.xpath("/html/body/section[1]/div/input"));
		WebElement search_button = driver.findElement(By.xpath("/html/body/section[1]/div/input"));
		if(search_box.isDisplayed()) {
			search_box.sendKeys("Polo");
			search_button.click();
		}else {
			System.out.println("Test 9 fail");
		}
		WebElement searched_Product = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2"));
		if(searched_Product.isDisplayed()) {
			System.out.println("Searched Product is displayed");
			
		}
		List<WebElement> Products = driver.findElements(By.xpath("//div[@class='features_items']"));
		System.out.println("Total products" + Products.size());
		for(WebElement Product : Products) {
			System.out.println("Product name " + Product.getText());
		}
	}

}
