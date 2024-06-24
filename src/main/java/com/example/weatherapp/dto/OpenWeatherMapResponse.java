package com.example.weatherapp.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherMapResponse {

    private Coordinates coord;
    private List<Weather> weather;
    private MainInfo main;
    private Wind wind;
    private Rain rain;
    private System sys;


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Coordinates {
        @JsonProperty("lon")
        private double longitude;
        @JsonProperty("lat")
        private double latitude;
    }

    @Getter
    @Setter
    @JsonIgnoreType
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Weather {
        private String id;
        private String main;
        private String description;
        private String icon;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MainInfo {

        private double temp;

        @JsonProperty("feels_like")
        private double feelsLike;

        @JsonProperty("temp_min")
        private double tempMin;

        @JsonProperty("temp_max")
        private double tempMax;

        private double pressure;
        private double humidity;

        @JsonProperty("sea_level")
        private double seaLevel;

    }

    private String visibility;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Wind {

        private double speed;

        @JsonProperty("deg")
        private double degree;
        private double gust;

    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Rain {
        @JsonProperty("1h")
        private double rainVolume;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class System {
        private int id;
        private String country;
        private int sunrise;
        private int sunset;
    }

    private String name;

}