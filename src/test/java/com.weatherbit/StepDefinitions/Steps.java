package com.weatherbit.StepDefinitions;

import com.weatherbit.action.WeatherBitActions;
import com.weatherbit.model.Current;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/*
* this is the step definition class used to define the steps in the feature file
* */
public class Steps {
    /*Implementing pico container to share data between step definitions*/

    private WeatherBitActions weatherBitActions;
    private Current current;
    public Steps(WeatherBitActions weatherBitActions, Current current) {
        this.weatherBitActions = weatherBitActions;
        this.current = current;
    }

    @When("I use the weatherbit app to get the current weather using the Latitude as \"([^\"]*)\" and Longitude as \"([^\"]*)\"$")
    public void getWeatherUsingLatAndLong(String latitude, String longitude) {
        current = weatherBitActions.getCurrentUsingLatAndLong(latitude, longitude);
    }

    @Then("I expect the error to be \"([^\"]*)\"$")
    public void verifyErrorMessage(String expectedErrorMessage) {
        assertThat(weatherBitActions.getErrorMessage(), equalTo(expectedErrorMessage));//Hamcrest assertion
    }

    @Then("Response code should be \"([^\"]*)\"$")
    public void verifyResponseCode(String expectedResponseCode) {
       assertThat(String.valueOf(weatherBitActions.getResponseCode()), equalTo(expectedResponseCode));//Hamcrest assertion
    }

    @When("I use the weatherbit app to get the current weather using the Postcode as \"([^\"]*)\"$")
    public void getWeatherUsingPostcode(String postCode) {
        current= weatherBitActions.getCurrentUsingPostcode(postCode);
    }

    @Then("I expect the city name to be \"([^\"]*)\"$")
    public void verifyCityName(String expectedCityName) {
        assertThat(weatherBitActions.getCityFromResponse(), equalTo(expectedCityName));//Hamcrest assertion
    }
}
