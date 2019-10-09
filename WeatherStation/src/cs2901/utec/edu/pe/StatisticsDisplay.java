package cs2901.utec.edu.pe;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperatureMin;
    private float temperatureMax;
    private float temperatureAvg;
    private float humidityMin;
    private float humidityMax;
    private float humidityAvg;
    private float pressureMin;
    private float pressureMax;
    private float pressureAvg;

    private Subject weatherData;
    
    public StatisticsDisplay(Subject weatherData) {
      this.weatherData = weatherData;
      weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
      if (temperature < this.temperatureMin) {
        this.temperatureMin = temperature;
      } else if (temperature > this.temperatureMax) {
        this.temperatureMax = temperature;
      }
      if (humidity < this.humidityMin) {
        this.humidityMin = humidity;
      } else if (humidity > this.humidityMax) {
        this.humidityMax = humidity;
      }
      if (pressure < this.pressureMin) {
        this.pressureMin = pressure;
      } else if (pressure > this.pressureMax) {
        this.pressure = pressure;
      }
      this.temperatureAvg = (this.temperatureAvg + temperature) / 2;
      this.humidityAvg = (this.humidityAvg + humidity) / 2;
      this.pressureAvg = (this.pressureAvg + pressure) / 2;
    }

    public void display() {
      System.out.println("Statistics: (min, max, avg)");
      System.out.println("Temperature: " + temperatureMin + ", " + temperatureMax + ", " + temperatureAvg);
      System.out.println("Humidity: " + humidityMin + ", " + humidityMax + ", " + humidityAvg);
      System.out.println("Pressure: " + pressureMin + ", " + pressureMax + ", " + pressureAvg);
    }
}
