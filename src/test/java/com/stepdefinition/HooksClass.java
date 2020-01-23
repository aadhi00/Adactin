package com.stepdefinition;

import com.base.LibGlobal;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class HooksClass extends LibGlobal {
	@After
	public void afterScenario(Scenario sc) {
		if (sc.isFailed())
			sc.embed(scrShot(), "failed.png");
		else
			sc.embed(scrShot(), "passed.png");
	}
}
