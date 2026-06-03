package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactPage{
	WebDriver driver;
	public contactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[1]/input")
    public WebElement Name;
	
	public void getName(String name) {
		Name.sendKeys(name);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[2]/input")
	public WebElement Email;
	
	public void getEmail(String mail) {
		Email.sendKeys(mail);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[3]/input")
	public WebElement Subject;
	
	public void getsubject(String sub) {
		Subject.sendKeys(sub);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[4]/textarea")
	public WebElement Description;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[5]/input")
	public WebElement UploadFile;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[6]/input")
	public WebElement Submit;

}
