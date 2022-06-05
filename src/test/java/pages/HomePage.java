package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import core.testutility;


public class HomePage extends testutility{
	private By myNaukariLink = By.xpath("//div[@class='commonHeaderFooter']/div[1]/div/ul[2]/li[2]/a/div[2]");
	private By EditProfileLink = By.xpath("//a[@title='Edit Profile']");
	public void scrolltomynaukari() throws InterruptedException {
		Actions actions1 = new Actions(driver);
		WebElement wx1 = driver.findElement(myNaukariLink);
		actions1.moveToElement(wx1);
		actions1.perform();
		Thread.sleep(3000);
	}
	public void onClickEditProfile() throws InterruptedException {
		driver.findElement(EditProfileLink).click();
		Thread.sleep(3000);
	}

}
