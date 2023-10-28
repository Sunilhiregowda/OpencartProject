package com.opencart.runnerpack;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
             features = "Features",
                glue  = "Steps" ,
                dryRun = false,
        		monochrome = true
                )
public class RunnerClass {

}
