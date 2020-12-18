/*
 * CountriesAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.rest.models;

import java.util.*;

public class CountryResponseBuilder {
    //the instance to build
    private CountryResponse countryResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CountryResponseBuilder() {
        countryResponse = new CountryResponse();
    }

    /**
     * HTTP status code
     */
    public CountryResponseBuilder httpCode(int httpCode) {
        countryResponse.setHttpCode(httpCode);
        return this;
    }

    /**
     * Response code of API
     */
    public CountryResponseBuilder responseCode(String responseCode) {
        countryResponse.setResponseCode(responseCode);
        return this;
    }

    /**
     * Response message of API
     */
    public CountryResponseBuilder responseMsg(String responseMsg) {
        countryResponse.setResponseMsg(responseMsg);
        return this;
    }

    /**
     * This is the list of countries object
     */
    public CountryResponseBuilder data(List<CountryInfo> data) {
        countryResponse.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CountryResponse build() {
        return countryResponse;
    }
}