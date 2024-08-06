package com.cba.api;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/cba/features/",
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber/report.html"},
        glue = "com.cba.steps",
        tags = "@Smoke"
)
public class PetStoreApiTests {

    public void cucumberTests() {
    }
}
