package com.observer;

public class WeatherChannel implements WeatherObserver {

    private final String name;
    private final int channelID;
    private final WeatherStation station;
    private int currentTemp;

    public WeatherChannel(String name, int channelID, WeatherStation station) {
        this.name = name;
        this.channelID = channelID;
        this.station = station;
        this.currentTemp = station.getTemp();
    }

    @Override
    public void update() {
        currentTemp = station.getTemp();
        System.out.println("\nSending weather notification to " + name + " at Channel " + channelID + "...");
        System.out.println("TV Station, " + name + ", received a notification. " +
                "\nMESSAGE: The current temperature is " + currentTemp + " degrees Fahrenheit.");
    }
}