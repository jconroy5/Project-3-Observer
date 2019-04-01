package com.observer;

/*
WeatherSubscriber is a type of Observer.
It refers to a user who is subscribed to a local WeatherStation by phone number.
 */

public class WeatherSubscriber implements WeatherObserver {

    private final String name;
    private final String phone;
    private final WeatherStation station;
    private int currentTemp;

    public WeatherSubscriber(String name, String phone, WeatherStation station) {
        this.name = name;
        this.phone = phone;
        this.station = station;
        this.currentTemp = station.getTemp();
    }

    @Override
    public void update() {
        currentTemp = station.getTemp();
        System.out.println("\nSending weather notification to " + name + " at " + phone + "...");
        System.out.println("Weather Subscriber, " + name + ", received a notification. " +
                "\nMESSAGE: The current temperature is " + currentTemp + " degrees Fahrenheit.");
    }
}
