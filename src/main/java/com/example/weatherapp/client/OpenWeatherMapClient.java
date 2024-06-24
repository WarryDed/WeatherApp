package com.example.weatherapp.client;

import com.example.weatherapp.dto.OpenWeatherMapResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "openWeatherClient", url = "https://api.openweathermap.org/data/2.5")
public interface OpenWeatherMapClient {

    @GetMapping("/weather?lat={latitude}&lon={longitude}&appid={apiKey}")
    OpenWeatherMapResponse getWeather(@PathVariable double longitude, @PathVariable final double latitude, @PathVariable final String apiKey);

}