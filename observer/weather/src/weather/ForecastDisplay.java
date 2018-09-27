package weather;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Forecast : current pressure : " + currentPressure);
	}

	public void update(float temperature, float humidity, float pressure) {
		currentPressure = pressure;
		display();
	}
}
