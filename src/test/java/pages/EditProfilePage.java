package pages;

import org.openqa.selenium.By;

import core.testutility;

public class EditProfilePage extends testutility {
	
	private By Resumedocx = By.xpath("//input[@id='attachCV']");

	

	public void updateResume() throws InterruptedException {
		driver.findElement(Resumedocx).sendKeys("C:\\Users\\Dell\\Documents\\Downloads\\mahesh resume.docx");
		Thread.sleep(3000);
	}
}
