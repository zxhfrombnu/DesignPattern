package weather;

public class HeatIndexDisplay implements Observer, DisplayElement {
	private float heatIndex = 0.0f;
	private Subject weatherData;

	public HeatIndexDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		heatIndex = (temperature + humidity) / 2;
		display();
	}

	public void display() {
		System.out.println("Heat Index is : " + heatIndex);
	}
}
