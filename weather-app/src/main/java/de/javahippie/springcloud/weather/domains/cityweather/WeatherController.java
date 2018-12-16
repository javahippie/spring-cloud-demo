package de.javahippie.springcloud.weather.cityweather;

import de.javahippie.springcloud.weather.integration.WeatherClient;
import de.javahippie.springcloud.weather.integration.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/weather")
public class WeatherController {

    private WeatherClient weatherClient;

    @Autowired
    public WeatherController(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    @GetMapping
    public ResponseEntity<CityWeather> getWeatherForCity(@RequestParam(name = "city") String city) {
        WeatherResponse response = weatherClient.getWeatherForCity(city, "f7584feeedfc0d0c69f21cdb8b06c097");
        return ResponseEntity.ok(new CityWeather());
    }
}
