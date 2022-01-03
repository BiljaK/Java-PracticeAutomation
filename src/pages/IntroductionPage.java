package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IntroductionPage {

	WebDriver driver;

	public IntroductionPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickStartBtn() throws InterruptedException {
		WebElement startBtn = driver.findElement(By.id("start-button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", startBtn);
		Thread.sleep(1500);
		startBtn.click();
	}

}
