package com.weatherbit.action;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.weatherbit.model.Current;
import io.restassured.path.json.JsonPath;
import com.weatherbit.po_api.WeatherBit;
import io.restassured.response.Response;

import static com.weatherbit.utils.APIUtils.UNRELIABLE_INTEGER_FACTORY;

public class WeatherBitActions {

    /*Implementing pico container to share data between step definitions*/
    private Response response;
    private Current current;

    public WeatherBitActions(Current current) {
        this.current = current;
    }

    public int getResponseCode() {
        return this.response.getStatusCode();
    }

    private Gson getGSON() {
        return new GsonBuilder()
                .registerTypeAdapterFactory(UNRELIABLE_INTEGER_FACTORY)
                .create();
    }

    public Current getCurrentUsingLatAndLong(String latitude, String longitude) {
        this.response = new WeatherBit().getWeatherWithLatAndLong(latitude, longitude);
        this.current = getGSON().fromJson(this.response.asString(), Current.class);
        return this.current;
    }

    public Current getCurrentUsingPostcode(String postcode) {
        this.response = new WeatherBit().getWeatherWithPostcode(postcode);
        this.current =  getGSON().fromJson(this.response.asString(), Current.class);
        return this.current;
    }

    public String getErrorMessage() {
        JsonPath jp = new JsonPath(this.response.getBody().asString());
        return jp.getString("error");
    }

    public String getCityFromResponse() {
        Current current = getGSON().fromJson(this.response.asString(), Current.class);
        return current.getData().get(0).getCityName();
    }
}
