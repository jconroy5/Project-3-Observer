package com.observer;

/*
WeatherSubject is the interface used to add and remove Observers.
The interface also sends weatherUpdate to Observers when the weather changes.
 */

public interface WeatherSubject {
    public void addObserver(WeatherObserver weatherObserver);
    public void removeObserver(WeatherObserver weatherObserver);
    public void weatherUpdate();
}
