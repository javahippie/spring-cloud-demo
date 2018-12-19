package de.javahippie.springcloud.weather.domains.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "weather-client", url = "https://api.openweathermap.org/data/2.5/")
public interface WeatherClient {

    @RequestMapping(method = RequestMethod.GET, value = "/weather", consumes = "application/json")
    WeatherResponse getWeatherForCity(@RequestParam(name = "q") String city, @RequestParam(name="APPID") String apiKey);

}
