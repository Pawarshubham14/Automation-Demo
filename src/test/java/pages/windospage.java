package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class windospage {
	public WebDriver driver;

	public windospage(WebDriver driver) {
		this.driver = driver;
	}

	public void switchwindow() {
		Set<String> windowset = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>(windowset);

		if (windowset.size() > 1) {

			driver.switchTo().window(windowsList.get(1));

		} else {

			System.out.println("No child window found");
		}
	}

}
