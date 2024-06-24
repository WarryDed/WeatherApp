package com.example.weatherapp.service;

import com.example.weatherapp.client.OpenWeatherMapClient;
import com.example.weatherapp.config.AppConfig;
import com.example.weatherapp.dto.OpenWeatherMapResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OpenWeatherMapService {

    private final AppConfig appConfig;
    private final OpenWeatherMapClient client;

    public OpenWeatherMapResponse getWeather(double longitude, final double latitude) {
        log.info("Hi, i'm in service! Lon: {}, lat: {}, apiKey: {}", longitude, latitude, appConfig.getApiKey());
        return client.getWeather(longitude, latitude, appConfig.getApiKey());
    }

}