package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Test_case7 extends BaseTest {
	
	@Test
	public void verify_Testcase() {
		WebElement test = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a"));
		test.click();
		WebElement page = driver.findElement(By.xpath("/html/body/section/div/div[1]/div"));
		if (page.isDisplayed()) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Test fail");
		}
	}

}
