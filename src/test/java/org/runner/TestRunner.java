
package org.runner;

import java.net.URL;

import org.junit.After;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\"}, glue="org.stepdef", monochrome=true, dryRun=false, strict= false, snippets=SnippetType.CAMELCASE)

public class TestRunner {
	
	

}
