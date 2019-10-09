package cs2901.utec.edu.pe;

public class CurrentCoditions implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;
    
    public CurrentConditions(Subject weatherData) {
      this.weatherData = weatherData;
      weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
      this.temperature = temperature;
      this.humidity = humidity;
      this.pressure = pressure;
    }

    public void display() {
      System.out.println("Current conditions:");
      System.out.println("Temperature: " + temperature);
      System.out.println("Humidity: " + humidity);
      System.out.println("Pressure: " + pressure);
    }
}
