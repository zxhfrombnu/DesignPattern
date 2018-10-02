package weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
	private float heatIndex = 0.0f;

	public HeatIndexDisplay(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("heatIndex : " + heatIndex);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			heatIndex = weatherData.getTemperature() + weatherData.getHumidity();
			display();
		}
	}
}
