package com.fis.api;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/fis/api/features/FIS/FIS.feature"
		,glue = "com.fis.api.stepDefs"
		//@sanity , @regression, @OAuth, @basic, @qa
		,tags = "@FIS"
		//monochrome = true
		,plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml",
		// monochrome = false, // display the console output in readable format
		//strict = false,      // no declaration of any step , strict = false --> pass , true--> fail
		//dryRun = false,     // checking if mapping is in place
		// }
}
		)
public class RunnerTest {

	@AfterClass
	public static void afterClass() throws Exception {

		}
}