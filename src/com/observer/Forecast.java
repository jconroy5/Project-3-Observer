package com.observer;

/*
Forecast is the client. Run it to execute the main method.
The client creates a WeatherStation called chicago.
There are three example Observers, 2 WeatherSubscribers and 1 WeatherChannel.
Each time WeatherStation Chicago is updated, the observers receive a notification by phone number or channel ID.
 */

public class Forecast {
    public static void main(String[] args) {
        //Creating an example WeatherStation in Chicago, IL
        System.out.println("Creating new Weather Station Chicago...");
        WeatherStation chicago = new WeatherStation("Chicago", 40);

        //Creating example WeatherSubscribers
        WeatherSubscriber sub1 = new WeatherSubscriber("Joe", "3125551997", chicago);
        WeatherSubscriber sub2 = new WeatherSubscriber("Nigel", "3127772019", chicago);

        //Adding the example WeatherSubscribers as WeatherStation Chicago Observers
        chicago.addObserver(sub1);
        chicago.addObserver(sub2);
        System.out.println("\nNew Users Joe and Nigel have just subscribed to Weather Station Chicago!");

        //Updating WeatherStation Chicago temperature
        chicago.setTemp(55);

        //Removing WeatherSubscriber Joe
        System.out.println("\nWeather Station Chicago subscriber Joe has unsubscribed from the weather station!");
        chicago.removeObserver(sub1);

        //Updating WeatherStation Chicago again
        chicago.setTemp(63);

        //Creating example WeatherChannel WGN Channel 19 as a WeatherStation Chicago Observer
        WeatherChannel tv1 = new WeatherChannel("WGN", 19, chicago);
        System.out.println("\nNew Channel WGN-TV has just subscribed to Weather Station Chicago!");
        chicago.addObserver(tv1);

        //Updating WeatherStation Chicago once more
        chicago.setTemp(70);
    }
}
