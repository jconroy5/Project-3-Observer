# Project 3 - Observer
COMP 373/473 - Project 3 - Observer Pattern - Joseph Conroy and Nigel Castelino

# To run the client:
Run Forecast.java, found in 
```
src/com/observer/client
```

# Project Description:
For our Observer pattern, we created a program which makes a Weather Station that reports changes in temperature to subscribed observers. There are different kinds of observers that can subscribe to a Weather Station, such as everyday users and local news/TV stations. The Observer pattern is used by means of notifying observers of a Weather Station whenever the subject (in this case, the temperature variable) changes. The subject package contains the WeatherSubject interface and its implementer, “WeatherStation”. The observers package contains the WeatherObserver interface and its implementers, “WeatherSubscriber” and “WeatherChannel”.

The subject has an interface called WeatherSubject.java, which contains methods for adding and removing observers, as well as a method for notifying observers, called weatherUpdate(). WeathSubject is implemented as WeatherStation.java, which contains name and temperature variables, and is used to represent the location of a weather-reporting station. A WeatherStation also has get and set methods for the temperature variable, and uses a hashset to hold observers. When setTemp() is called, in addition to the change to the temp variable, weatherUpdate() is also called to notify subscribers of the change.

WeatherObserver.java is the observer interface, which contains the update() method used to notify an observer of a temperature change at a weather station they are subscribed to. In our program there are two examples of observers: “WeatherSubscriber” and “WeatherChannel”.

WeatherSubscriber represents a standard person who is subscribed to a Weather Station by their phone number. WeatherChannel represents a local news/TV station that is subscribed to a Weather Station by its channel ID number. Both types of WeatherObserver have variables for name, station, currentTemp, and subscription method (“phone” number for WeatherSubscriber and “channelID” number for WeatherChannel). Whenever update() is called, the WeatherObserver is notified of a temperature change with a message printed to the console.

# Project Rubric:

Project 3: Implementing Patterns I

Project Description:

In this project, we will practice the implementation of design patterns.
You need to design and implement:

– Bridge Pattern

– Observer Pattern

You can implement both patterns in the same implementation or separately.

Supporting documents:

- Class notes and examples as well as links for patterns

- Design Patterns book by Gamma

- Search on the web to get more information on the patterns

Project Expectation:

- Group executed project

- Submission of Design and Code

Project Submission and Grading:

- 10% of total grade

- Email

- Complete documentation on what problem you solved with the patterns

- Your code OR the location of your solution for the implementation

Project Due Date:

- Submission of the Implementation: EOD 04/07/2019 
