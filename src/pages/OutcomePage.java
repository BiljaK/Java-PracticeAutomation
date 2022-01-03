package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OutcomePage {

	WebDriver driver;

	public OutcomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getOutcomeText() {
		return driver.findElement(By.id("outcome-title"));
	}

}
