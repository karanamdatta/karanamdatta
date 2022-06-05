package pages;

import org.openqa.selenium.By;

import core.testutility;

public class LoginPage extends testutility {
	
	private By primaryLoginBtn = By.xpath("//li[@class='Login']");
	private By usernameInputText = By.xpath("//form[@name='login-form'] /div[2] /input");
	private By passwordInp = By.xpath("//input[@type='password']");
	private By loginbtn = By.xpath("//button[@type='submit']");
	

	public void HomeLoginPage() throws InterruptedException {
		testutility.driver.findElement(primaryLoginBtn).click();
		System.out.println("login");
		Thread.sleep(3000);
	}

	public void userNameInput() throws InterruptedException {
		driver.findElement(usernameInputText).sendKeys("umamaheswarareddy.ramireddy@gmail.com");
		Thread.sleep(3000);
	}

	public void userPassword() {
		driver.findElement(passwordInp).sendKeys("Password@1234");

	}

	public void loginButton() throws InterruptedException {
		driver.findElement(loginbtn).click();
		Thread.sleep(3000);
	}
}