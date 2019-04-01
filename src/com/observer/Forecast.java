package com.observer;

/*
Forecast is the client. Run it to execute the main method.
 */

public class Forecast {
    public static void main(String[] args) {
        System.out.println("Creating new Weather Station Chicago...");
        WeatherStation weatherStation = new WeatherStation("Chicago", 40);

        WeatherSubscriber sub1 = new WeatherSubscriber("Joe", "3125551997", weatherStation);
        WeatherSubscriber sub2 = new WeatherSubscriber("Nigel", "3127772019", weatherStation);

        weatherStation.addObserver(sub1);
        weatherStation.addObserver(sub2);
        System.out.println("\nNew Users Joe and Nigel have just subscribed to Weather Station Chicago!");

        weatherStation.setTemp(55);

        System.out.println("\nWeather Station Chicago customer Joe has unsubscribed from the weather station!");
        weatherStation.removeObserver(sub1);

        weatherStation.setTemp(67);

        WeatherChannel tv = new WeatherChannel("WGN", 19, weatherStation);
        System.out.println("\nNew Channel WGN-TV has just subscribed to Weather Station Chicago!");
        weatherStation.addObserver(tv);

        weatherStation.setTemp(70);
    }
}
