package com.observer;

import java.util.HashSet;
import java.util.Set;

/*
WeatherStation is the subject class which contains a set of observers, which can be added and removed.
A WeatherStation represents a temperature monitoring system at a given location.
When a new temperature for a WeatherStation is set, observers are notified via weatherUpdate().
 */

public class WeatherStation implements WeatherSubject {
    private Set<WeatherObserver> setOfWeatherObservers;
    private int temp;
    String name;

    public WeatherStation(String name, int temperature) {
        setOfWeatherObservers = new HashSet<>();
        this.name = name;
        this.temp = temperature;

    }

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        setOfWeatherObservers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        setOfWeatherObservers.remove(weatherObserver);
    }

    @Override
    public void weatherUpdate() {
        for(WeatherObserver observer : setOfWeatherObservers) {
            observer.update();
        }
    }

    public void setTemp(int newTemperature) {
        System.out.println("\nUPDATE: The temperature at Weather Station " + name + " is now " + newTemperature + " degrees Fahrenheit.");
        temp = newTemperature;
        weatherUpdate();
    }

    public int getTemp() {
        return temp;
    }

    public Set<WeatherObserver> getSetOfWeatherObservers() {
        return setOfWeatherObservers;
    }
}
