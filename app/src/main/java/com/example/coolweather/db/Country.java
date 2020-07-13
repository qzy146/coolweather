package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private int weatherID;
    private int cityID;

    public int getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getWeatherID() {
        return weatherID;
    }

    public int getCityID() {
        return cityID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setWeatherID(int weatherID) {
        this.weatherID = weatherID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }
}
