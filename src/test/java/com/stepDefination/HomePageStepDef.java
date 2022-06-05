package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import pages.HomePage;

public class HomePageStepDef {
	HomePage homePage = new HomePage();
	
	@Then("^click on my naukri$")
	public void click_on_my_naukri() throws Throwable {
		homePage.scrolltomynaukari();

	}

	@Then("^click on edit profile$")
	public void click_on_edit_profile() throws Throwable {
		homePage.onClickEditProfile();
	   
	}


}
