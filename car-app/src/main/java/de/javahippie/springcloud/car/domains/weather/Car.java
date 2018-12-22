package de.javahippie.springcloud.car.domains.car;

import java.io.Serializable;

public class Car implements Serializable {
    private String weather;

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
