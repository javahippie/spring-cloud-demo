package de.javahippie.springcloud.weather.domains.car;

import java.io.Serializable;

public class CityWeather implements Serializable {
    private String weather;

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
