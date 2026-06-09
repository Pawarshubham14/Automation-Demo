package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Test_case8 extends BaseTest {
	
	@Test
	public void product_page() {
		WebElement product = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a"));
		product.click();
		WebElement all_Products = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2"));
		if(all_Products.isDisplayed()) {
			System.out.println("All products page displayed");
			
		}else {
			System.out.println("Test fail");
		}
		WebElement view_product = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a"));
		view_product.click();
		WebElement name = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2"));
		WebElement brand = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]"));
		WebElement cat = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]"));
		String n = name.getText();
		System.out.println("Product name" + " " +n);
		String b = brand.getText();
		System.out.println("Brand name" + " " +b);
		String c = cat.getText();
		System.out.println("category name" + " " +c);
	}

}
