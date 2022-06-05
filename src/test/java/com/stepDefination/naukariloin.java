package com.stepDefination;

import org.openqa.selenium.By;


import core.testutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;


public class naukariloin   {
	LoginPage loginPage = new LoginPage();
	
@Given("^user is  on homepage$")
public void user_is_on_homepage() throws Throwable {
	loginPage.HomeLoginPage();
}
@When("^user navigates to Login Page$")
public void user_navigates_to_Login_Page() throws Throwable {
	
}

@When("^user enters username and Password$")
public void user_enters_username_and_Password() throws Throwable {
	Thread.sleep(3000);
	loginPage.userPassword();
	loginPage.userNameInput();
	loginPage.loginButton();
   
}

@Then("^success message is displayed$")
public void success_message_is_displayed() throws Throwable {
   
}
}

