package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import core.testutility;
import cucumber.api.java.en.Then;
import pages.EditProfilePage;

public class updateresume{

	EditProfilePage editProfilePage = new EditProfilePage();
@Then("^click on update resume$")
public void click_on_update_resume() throws Throwable {
	editProfilePage.updateResume();
}
}