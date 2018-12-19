package de.javahippie.springcloud.weather.domains.car;

import de.javahippie.springcloud.weather.domains.integration.WeatherClient;
import de.javahippie.springcloud.weather.domains.integration.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/weather")
public class WeatherController {

    private WeatherClient weatherClient;

    private IntegrationToCityWeatherMapper mapper;

    @Value("${API_KEY}")
    private String apiKey;

    @Autowired
    public WeatherController(WeatherClient weatherClient, IntegrationToCityWeatherMapper mapper) {
        this.weatherClient = weatherClient;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<CityWeather> getWeatherForCity(@RequestParam(name = "city") String city) {
        WeatherResponse response = weatherClient.getWeatherForCity(city, apiKey);
        return ResponseEntity.ok(mapper.fromIntegration(response));
    }
}
