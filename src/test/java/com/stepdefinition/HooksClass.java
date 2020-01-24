package com.stepdefinition;

import com.base.LibGlobal;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends LibGlobal {
	@Before({ "@login,@booking" })
	public void beforeScenario() {
		set();
		// setCloud();
	}
		
	@After(order = 2)
	public void afterScenario(Scenario sc) {
		if (sc.isFailed())
			sc.embed(scrShot(), "failed.png");
		else
			sc.embed(scrShot(), "passed.png");
	}
	
	@After(value="@login,@order",order=1)
	public void finish() {
		driver.quit();
	}

}
