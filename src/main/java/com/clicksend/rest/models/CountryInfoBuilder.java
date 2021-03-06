/*
 * CountriesAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.rest.models;

import java.util.*;

public class CountryInfoBuilder {
    //the instance to build
    private CountryInfo countryInfo;

    /**
     * Default constructor to initialize the instance
     */
    public CountryInfoBuilder() {
        countryInfo = new CountryInfo();
    }

    /**
     * This indicates the code of country
     */
    public CountryInfoBuilder code(String code) {
        countryInfo.setCode(code);
        return this;
    }

    /**
     * This indicates the name of country
     */
    public CountryInfoBuilder value(String value) {
        countryInfo.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CountryInfo build() {
        return countryInfo;
    }
}