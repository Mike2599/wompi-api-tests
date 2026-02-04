package com.michael.wompi.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/michael/wompi/features",
        glue = "com.michael.wompi.stepdefinitions",
        plugin = {"pretty"}
)
public class RunCucumberTest {
}

