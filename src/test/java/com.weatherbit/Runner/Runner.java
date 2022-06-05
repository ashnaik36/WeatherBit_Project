package com.weatherbit.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

import java.io.File;

@CucumberOptions(tags = "",
        features = "src\\test\\resources\\feathures\\currentWeatherBit.feature",
        glue = "com.weatherbit.StepDefinitions")

public class Runner extends AbstractTestNGCucumberTests {
}
