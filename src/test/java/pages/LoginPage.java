package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// WebElements

	@FindBy(xpath = "//input[@id='id_gender1']")
	public WebElement titlemr;

	public void clickRadiobutton2() {
		titlemrs.click();
	}

	@FindBy(id = "id_gender2")
	WebElement titlemrs;

	public void clickRadiobutton1() {
		titlemr.click();
	}

	@FindBy(id = "name")
	WebElement name;
	
	public void getname() {
		name.sendKeys();
	}

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "password")
	public WebElement Enterpassword;
	
	public void  getpassword(String userpassword) {
		Enterpassword.sendKeys(userpassword);
	}

	@FindBy(id = "days")
	WebElement days;
	
	public void selectday(String day) {
		Select select = new Select(days);
		select.selectByVisibleText(day);
		 
	}

	@FindBy(id = "months")
	WebElement months;
	
	public void selectmonth(String month) {
		Select select = new Select(months);
		select.selectByVisibleText(month);
		}

	@FindBy(id = "years")
	WebElement years;
	public void selectyear(String year) {
		Select select = new Select(years);
		select.selectByVisibleText(year);
		}

	@FindBy(id = "newsletter")
	WebElement newsletter;

	@FindBy(id = "optin")
	WebElement optin;
	
	@FindBy(id = "first_name")
	public WebElement first_name;
	
	@FindBy(id = "last_name")
	public WebElement last_name;
	
	@FindBy(id = "company")
	public WebElement company;
	
	@FindBy(id = "address1")
	public WebElement address1;
	
	@FindBy(id = "address2")
	public WebElement address2;
	
	@FindBy(id = "country")
	public WebElement country;
	
	@FindBy(id = "state")
	public WebElement state;
	
	@FindBy(id = "city")
	public WebElement city;
	
	@FindBy(id = "zipcode")
	public WebElement zipcode;
	
	@FindBy(id = "mobile_number")
	public WebElement mobile_number;
	
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")
	public WebElement create_accout;
	
	@FindBy(xpath ="/html/body/section/div/div/div[1]/div/form/input[2]")
	public WebElement email1;
	
	public void getemail1(String setemail) {
		email1.sendKeys(setemail);
	}
	
	@FindBy(xpath ="/html/body/section/div/div/div[1]/div/form/input[3]")
	public WebElement pass1;
	
	public void getpass(String setpass) {
		pass1.sendKeys(setpass);
	}
	
	@FindBy(xpath ="/html/body/section/div/div/div[1]/div/form/button")
	public WebElement login_button;

}
