package com.example.weatherapp.controller;

import com.example.weatherapp.dto.OpenWeatherMapResponse;
import com.example.weatherapp.service.OpenWeatherMapService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/weather")
public class WeatherController {

    private final OpenWeatherMapService service;

    @GetMapping("/get")
    public ResponseEntity<OpenWeatherMapResponse> getWeather(@RequestParam final double longitude, @RequestParam final double latitude) {
        log.info("Hi, i'm here! Lon: {}, lat: {}", longitude, latitude);
        return ResponseEntity.ok(service.getWeather(longitude, latitude));
    }

}