package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.contactPage;
import utilities.FileReaderUtil;

public class Test_case6 extends BaseTest{
	@Test
	public void contact_us() throws IOException {
		WebElement contact = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[8]/a"));
		contact.click();
		contactPage c = new contactPage(driver);
		FileReaderUtil File = new FileReaderUtil();
		String name = File.getUsername();
		c.getName(name);
	}

}
