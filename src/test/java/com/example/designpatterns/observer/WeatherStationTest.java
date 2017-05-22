package com.example.designpatterns.observer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class WeatherStationTest {

    @Test
    public void currentConditionsDisplayShouldReceiveDataIfListening() {
        final float TEMPERATURE = 80;
        final float HUMIDITY = 65;
        final float PRESSURE = 30.4f;

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(TEMPERATURE, HUMIDITY, PRESSURE);

        assertEquals(TEMPERATURE, currentConditionsDisplay.getTemperature(), 0);
        assertEquals(HUMIDITY, currentConditionsDisplay.getHumidity(), 0);
        assertEquals(PRESSURE, currentConditionsDisplay.getPressure(), 0);
    }

    @Test
    public void currentConditionsDisplayShouldNotReceiveDataIfIsNotListening() {
        final float TEMPERATURE = 80;
        final float HUMIDITY = 65;
        final float PRESSURE = 30.4f;
        final float NEW_TEMPERATURE = 85;
        final float NEW_HUMIDITY = 66;
        final float NEW_PRESSURE = 36.4f;

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(TEMPERATURE, HUMIDITY, PRESSURE);
        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(NEW_TEMPERATURE, HUMIDITY, PRESSURE);

        assertNotEquals(NEW_TEMPERATURE, currentConditionsDisplay.getTemperature(), 0);
        assertNotEquals(NEW_HUMIDITY, currentConditionsDisplay.getHumidity(), 0);
        assertNotEquals(NEW_PRESSURE, currentConditionsDisplay.getPressure(), 0);
    }
}
