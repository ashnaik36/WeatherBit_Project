package com.weatherbit.utils;

import io.restassured.RestAssured;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import java.io.StringWriter;
import static io.restassured.RestAssured.given;

public class APIHelper {

    private static ThreadLocal<StringWriter> reponseWriterList = new ThreadLocal<>();

    public static StringWriter getResponseWriterList() {
        return reponseWriterList.get();
    }

    public static void setResponseWriterList(StringWriter errorWriter) {
        reponseWriterList.set(errorWriter);
    }

    public static RequestSpecification givenConfig() {
        RestAssured.useRelaxedHTTPSValidation();
        StringWriter errorWriter = new StringWriter();
        setResponseWriterList(errorWriter);
        return given()
                .contentType(ContentType.JSON);
    }
}
