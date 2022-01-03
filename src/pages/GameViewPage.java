package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GameViewPage {

	WebDriver driver;

	public GameViewPage(WebDriver driver) {
		this.driver = driver;
	}

	public void solveGame() throws InterruptedException {

		int i = 0;
		int j = 1;
		String srcForPairingPic;
		String srcForSecondPairingPic;

		List<WebElement> pics = driver.findElements(By.cssSelector(".game-item img"));

		while (pics.size() > 0) {
			pics.get(i).click();
			srcForPairingPic = pics.get(i).getAttribute("src");
			Thread.sleep(1000);
			pics.get(j).click();
			srcForSecondPairingPic = pics.get(j).getAttribute("src");
			Thread.sleep(2000);

			if (srcForPairingPic.equals(srcForSecondPairingPic)) {
				pics.remove(j);
				pics.remove(i);
				i = 0;
				j = 1;
			} else {
				j++;
			}
		}

	}
}
