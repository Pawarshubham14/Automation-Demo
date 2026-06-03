package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import base.ragister_user;

public class Test_case5 extends BaseTest {

	@Test
	public void Ragister_already_exist_mail() throws IOException {
		ragister_user ragister = new ragister_user(driver);
		ragister.login1();
		String error_message = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/p")).getText();
		if (error_message.equals("Email Address already exist!")) {
			System.out.println("Test pass with Error message");
		} else {
			System.out.println("Test fail No error message");
		}
	}

}
