package cs2901.utec.edu.pe;

public class ForecastDisplay implements Observer, DisplayElement {
    private float forecast;

    private Subject weatherData;
    
    public ForecastDisplay(Subject weatherData) {
      this.weatherData = weatherData;
      weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
      this.forecast = temperature;
    }

    public void display() {
      System.out.println("Forecast: " + forecast);
    }
}
