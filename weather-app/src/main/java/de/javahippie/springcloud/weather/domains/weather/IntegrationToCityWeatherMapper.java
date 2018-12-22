package de.javahippie.springcloud.weather.domains.weather;

import de.javahippie.springcloud.car.domains.integration.WeatherResponse;
import org.springframework.stereotype.Component;

@Component
public class IntegrationToCityWeatherMapper {

    public CityWeather fromIntegration(WeatherResponse weatherResponse) {
        CityWeather cityWeather = new CityWeather();
        if(weatherResponse.getWeather() != null && weatherResponse.getWeather().length > 0) {
            cityWeather.setWeather(weatherResponse.getWeather()[0].getDescription());
            cityWeather.setHumidity(weatherResponse.getMain().getHumidity());
            cityWeather.setPressure(weatherResponse.getMain().getPressure());
            cityWeather.setTemp(weatherResponse.getMain().getTemp());
            cityWeather.setTempMax(weatherResponse.getMain().getTempMax());
            cityWeather.setTempMin(weatherResponse.getMain().getTempMin());
            return cityWeather;
        } else {
            return null;
        }
    }

}
