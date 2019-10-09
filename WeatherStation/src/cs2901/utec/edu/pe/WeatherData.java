package cs2901.utec.edu.pe;

import java.utils.ArrayList

public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;

    private ArrayList observers;

    public void registerObserver(Observer obs) {
      observers.add(obs);
    }

    public void removeObserver(Observer obs) {
      observers.remove(obs);
    }

    public void notifyObservers() {
      for (Observer obs : observers) {
        obs.update(this.temperature, this.humidity, this.pressure);
      }
    }

    public float getTemperature() {
      return this.temperature;
    }

    public float getHumidity() {
      return this.humidity;
    }

    public float getPressure() {
      return this.pressure;
    }

    public void measurementsChanged() {
      notifyObservers();
    }

    public void changeMeasurements(float temperature, float humidity, float pressure) {
      this.temperature = temperature;
      this.humidity = humidity;
      this.pressure = pressure;
      measurementsChanged();
    }
}
