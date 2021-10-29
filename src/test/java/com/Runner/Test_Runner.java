package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_Hotel.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Adactin_Feature\\Adactin.feature",
glue = "com.StepD", monochrome = true, dryRun = false,
//tags = {"@regressionTest"},
plugin = {"html:Report1/HtmlReport.html",
		"pretty",
		"json:JsonReport/Report1.json",
//		"com.cucumber.listener.ExtentCucumberFormatter:Report1/HtmlReport.htm1"
		}
)

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_up() {
		driver = Base_Class.get_Driver("chrome");
	}

	@AfterClass
	public static void tear_down() {
		driver.close();
	}

}
