package com.weatherbit.po_api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static com.weatherbit.constants.Constants.*;
import static com.weatherbit.utils.APIHelper.givenConfig;

public class WeatherBit {

    public Response getWeatherWithLatAndLong(String latitude, String longitude) {
        return RestAssured.given()
                .queryParam("lat", latitude)
                .queryParam("lon", longitude)
                .queryParam("key", APP_KEY)
                .when()
                .get(BASE_URL)
                .then()
                .extract().response();
    }

    public Response getWeatherWithPostcode(String postcode) {
        return RestAssured.given()
                .queryParam("postal_code", postcode)
                .queryParam("key", APP_KEY)
                .when()
                .get("https://api.weatherbit.io/v2.0/current")
                .then()
                .extract().response();
    }
}
