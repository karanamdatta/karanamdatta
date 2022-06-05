package com.stepDefination;

import java.io.File;

import com.cucumber.listener.Reporter;

import core.testutility;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends testutility{
	@Before
public void intiateBrowser() throws InterruptedException {
		testutility t = new testutility();
		t.initiate();
		
	}

@After
public void CloseBrowser() {
	
		
		
		
}
	
}
