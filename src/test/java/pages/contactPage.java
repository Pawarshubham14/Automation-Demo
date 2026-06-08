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
	
	public void getsubject(String subject1) {
		Subject.sendKeys(subject1);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[4]/textarea")
	public WebElement Description;
	
	public void getdiscription(String discription) {
		Subject.sendKeys(discription);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[5]/input")
	public WebElement UploadFile;
	
	public void setUpladpath(String path) {
		UploadFile.sendKeys(path);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[6]/input")
	public WebElement Submit;

}
