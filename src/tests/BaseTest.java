package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.GameViewPage;
import pages.IntroductionPage;
import pages.OutcomePage;
import pages.RegistrationPage;

public class BaseTest {
	WebDriver driver;
	IntroductionPage introductionPage;
	GameViewPage gameViewPage;
	RegistrationPage registrationPage;
	OutcomePage outcomePage;

	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		this.driver = new ChromeDriver();
		introductionPage = new IntroductionPage(driver);
		gameViewPage = new GameViewPage(driver);
		registrationPage = new RegistrationPage(driver);
		outcomePage = new OutcomePage(driver);

		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() throws IOException {
		driver.close();
		System.out.println("The End");

	}

}
