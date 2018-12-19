package de.javahippie.springcloud.weather.domains.car;

import de.javahippie.springcloud.weather.domains.integration.WeatherResponse;
import org.springframework.stereotype.Component;

@Component
public class IntegrationToCityWeatherMapper {

    public CityWeather fromIntegration(WeatherResponse weatherResponse) {
        CityWeather cityWeather = new CityWeather();
        if(weatherResponse.getWeather() != null && weatherResponse.getWeather().length > 0) {
            cityWeather.setWeather(weatherResponse.getWeather()[0].getDescription());
            return cityWeather;
        } else {
            return null;
        }
    }

}
