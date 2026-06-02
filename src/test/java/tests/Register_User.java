package tests;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.windospage;
import utilities.FileReaderUtil;

public class Register_User extends BaseTest {

	@Test
	public void test1() throws IOException {

		WebElement HomePage = driver.findElement(By.xpath("/html/body/header/div/div/div/div[1]/div/a/img"));
		if (HomePage.isDisplayed()) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Test fail");
		}
		WebElement login = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
		if (login.isDisplayed()) {
			login.click();
		} else {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0, 10));
			wait.until(ExpectedConditions.elementToBeClickable(login));
		}
		WebElement NewUserLogin = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/h2"));
		if (NewUserLogin.isDisplayed()) {
			System.out.println("login form is dislayed");
		}
		windospage w = new windospage(driver);
		w.switchwindow();

		WebElement name = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
		WebElement email1 = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));
		WebElement signup = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button"));
		FileReaderUtil file = new FileReaderUtil();
		String username = file.getUsername();
		String email = file.getEmail();
		name.sendKeys(username);
		email1.sendKeys(email);
		signup.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement headertext = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[normalize-space()='Enter Account Information']")));

		WebElement textvisible = driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']"));

		if (headertext.isDisplayed()) {
			System.out.println("Details form displayed");
		}

		LoginPage elements = new LoginPage(driver);
		elements.clickRadiobutton1();
		if (elements.titlemr.isSelected()) {
			System.out.println("mr radio button is working");

		}
		elements.clickRadiobutton2();
		if(elements.titlemr.isSelected()) {
			System.out.println("test fail");
			
		}else {
			System.out.println("Test pass");
		}
		String userpassword = file.getPassword();
		elements.Enterpassword.sendKeys(userpassword);
		
		elements.selectday("14");
		elements.selectmonth("July");
		elements.selectyear("1999");
		WebElement checkbox1 = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/span[1]/input[1]"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/span[1]/input[1]"));
		checkbox2.click();
		String first_name = file.getUsername();
		elements.first_name.sendKeys(first_name);
		String s1 = elements.first_name.getText();
		System.out.println(s1);
		String last_name = file.getlastname();
		elements.last_name.sendKeys(last_name);
		String company = file.getcompany();
		elements.company.sendKeys(company);
		String adress = file.getadress();
		elements.address1.sendKeys(adress);
		String adress1 = file.getadress1();
		elements.address2.sendKeys(adress1);
		String state = file.getstate();
		elements.state.sendKeys(state);
		String city = file.getcity();
		elements.city.sendKeys(city);
		String zip = file.getpin();
		elements.zipcode.sendKeys(zip);
		String mobile = file.getmobilenumber();
		elements.mobile_number.sendKeys(mobile);
		elements.create_accout.click();

	}
}
