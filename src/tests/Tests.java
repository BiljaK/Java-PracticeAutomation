package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTest {
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to(
				"http://brame-campaign-demo.s3-website.eu-central-1.amazonaws.com/e7cea7c2-76cf-11eb-8678-b3be1ddb5d3b/");
		Thread.sleep(2000);
	}

	@Test(priority = 0)
	public void playGame() throws InterruptedException {
		String name = "Jane";
		String email = "jane@fakemail.com";
		String expectedText = "Thank you!";
		String actualText;

		introductionPage.clickStartBtn();
		Thread.sleep(1000);
		gameViewPage.solveGame();
		Thread.sleep(1000);
		registrationPage.insertFirstName(name);
		Thread.sleep(1000);
		registrationPage.insertEmail(email);
		Thread.sleep(1000);
		registrationPage.checkTermsField();
		Thread.sleep(1000);
		registrationPage.checkPrivacyField();
		Thread.sleep(1000);
		registrationPage.clickSubmitBtn();
		Thread.sleep(1000);

		actualText = outcomePage.getOutcomeText().getText();
		Thread.sleep(500);
		Assert.assertEquals(actualText, expectedText);
	}

	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
