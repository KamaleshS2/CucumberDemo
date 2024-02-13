package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src\\test\\resources\\Feature\\PlaceOrder.feature",
glue = "stepDefinition")
public class PlaceOrder extends AbstractTestNGCucumberTests{

}
