package weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float curTemp = 0f;

	public StatisticsDisplay(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("curTemp : " + curTemp);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			curTemp = weatherData.getTemperature();
			display();
		}
	}
}
