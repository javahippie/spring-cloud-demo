package de.javahippie.springcloud.weather.domains.weather;

import de.javahippie.springcloud.car.domains.integration.WeatherClient;
import de.javahippie.springcloud.car.domains.integration.WeatherResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOG = LoggerFactory.getLogger(WeatherController.class);

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
        LOG.info("Received weather request for city " + city );
        WeatherResponse response = weatherClient.getWeatherForCity(city, apiKey, "metric");
        LOG.info("Sending response " + response);
        return ResponseEntity.ok(mapper.fromIntegration(response));
    }
}
