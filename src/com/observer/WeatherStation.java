package com.observer;

import java.util.HashSet;
import java.util.Set;

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
        System.out.println("\nUPDATE: The temperature at Weather Station " + name + " is now " + newTemperature + ".");
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
