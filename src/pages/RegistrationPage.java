package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstNameField() {
		return driver.findElement(By.id("name-input"));
	}

	public void insertFirstName(String name) {
		this.getFirstNameField().sendKeys(name);
	}

	public WebElement getEmailField() {
		return driver.findElement(By.id("email-input"));
	}

	public void insertEmail(String email) {
		this.getEmailField().sendKeys(email);
	}

	public void checkTermsField() throws InterruptedException {
		WebElement termsField = driver.findElement(By.id("register-label-terms"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", termsField);
		Thread.sleep(1500);
		termsField.click();
	}

	public void checkPrivacyField() {
		WebElement fieldPrivacy = driver.findElement(By.id("register-label-privacy"));
		fieldPrivacy.click();
	}

	public void clickSubmitBtn() {
		WebElement submitBtn = driver.findElement(By.id("submit-button"));
		submitBtn.click();
	}
}
