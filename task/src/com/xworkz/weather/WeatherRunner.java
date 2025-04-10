package com.xworkz.weather;

import com.xworkz.weather.rainyweather.RainyWeather;

public class WeatherRunner {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.type();
        weather.temperature();
        weather.effects();

        RainyWeather rainyWeather = new RainyWeather();
        rainyWeather.type();
        rainyWeather.temperature();
        rainyWeather.effects();
    }
}
